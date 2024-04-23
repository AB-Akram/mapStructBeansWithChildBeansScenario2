package org.example.mapstructbeanswithchildbeansscenario2.service;

import org.example.mapstructbeanswithchildbeansscenario2.dto.ContactDTO;
import org.example.mapstructbeanswithchildbeansscenario2.entity.Contact;
import org.example.mapstructbeanswithchildbeansscenario2.mapper.ContactMapper;
import org.example.mapstructbeanswithchildbeansscenario2.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private ContactMapper contactMapper;

    public Contact saveContact(ContactDTO contactDTO) {
        return contactRepository.save(contactMapper.toEntity(contactDTO));
    }

    public ContactDTO getContactById(Long id) {
        return contactRepository.findById(id)
                .map(contactMapper::toDTO)
                .orElse(new ContactDTO());
    }

    public List<ContactDTO> getContactList() {
        List<Contact> contactList = contactRepository.findAll();
        return contactMapper.toDTO(contactList);
    }
}
