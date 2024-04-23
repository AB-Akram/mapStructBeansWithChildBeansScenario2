package org.example.mapstructbeanswithchildbeansscenario2.mapper;

import org.example.mapstructbeanswithchildbeansscenario2.dto.EmployeeDTO;
import org.example.mapstructbeanswithchildbeansscenario2.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(source = "empId", target = "id")
    @Mapping(source = "empName", target = "name")
    @Mapping(source = "departmentName", target = "department.deptName")
    Employee toEntity(EmployeeDTO employeeDTO);

    @Mapping(target = "empId", source = "id")
    @Mapping(target = "empName", source = "name")
    @Mapping(target = "departmentName", source = "department.deptName")
    EmployeeDTO toDto(Employee employee);
}
