package org.example.mapstructbeanswithchildbeansscenario2.controller;

import org.example.mapstructbeanswithchildbeansscenario2.dto.ContactDTO;
import org.example.mapstructbeanswithchildbeansscenario2.entity.Contact;
import org.example.mapstructbeanswithchildbeansscenario2.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public Contact saveContact(@RequestBody ContactDTO contactDTO) {
        return contactService.saveContact(contactDTO);
    }

    @GetMapping("/contacts")
    public List<ContactDTO> getContactList() {
        return contactService.getContactList();
    }

    @GetMapping("/contact/{id}")
    public ContactDTO getContactById(@PathVariable Long id) {
        return contactService.getContactById(id);
    }
}
