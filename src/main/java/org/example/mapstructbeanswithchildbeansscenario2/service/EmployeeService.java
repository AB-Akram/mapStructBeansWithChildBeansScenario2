package org.example.mapstructbeanswithchildbeansscenario2.service;

import org.example.mapstructbeanswithchildbeansscenario2.dto.EmployeeDTO;
import org.example.mapstructbeanswithchildbeansscenario2.entity.Employee;
import org.example.mapstructbeanswithchildbeansscenario2.mapper.EmployeeMapper;
import org.example.mapstructbeanswithchildbeansscenario2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        return employeeRepository.save(employeeMapper.toEntity(employeeDTO));
    }

    public EmployeeDTO getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .map(employeeMapper::toDto)
                .orElse(new EmployeeDTO());
    }
}
