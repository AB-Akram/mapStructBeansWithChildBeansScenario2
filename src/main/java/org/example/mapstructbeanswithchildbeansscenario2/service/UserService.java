package org.example.mapstructbeanswithchildbeansscenario2.service;

import org.example.mapstructbeanswithchildbeansscenario2.dto.UserDTO;
import org.example.mapstructbeanswithchildbeansscenario2.entity.User;
import org.example.mapstructbeanswithchildbeansscenario2.mapper.UserMapper;
import org.example.mapstructbeanswithchildbeansscenario2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public User saveUser(UserDTO userDTO) {
        return userRepository.save(userMapper.toEntity(userDTO));
    }

    public UserDTO getUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::toDTO)
                .orElse(new UserDTO());
    }

    public List<UserDTO> getUserList() {
        List<User> users = userRepository.findAll();
        return userMapper.toDTOList(users);
    }
}
