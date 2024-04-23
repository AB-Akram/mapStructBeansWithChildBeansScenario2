package org.example.mapstructbeanswithchildbeansscenario2.mapper;

import org.example.mapstructbeanswithchildbeansscenario2.dto.EmployeeDTO;
import org.example.mapstructbeanswithchildbeansscenario2.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {DepartmentMapper.class})
public interface EmployeeMapper {
    @Mappings({
            @Mapping(source = "empId", target = "id"),
            @Mapping(source = "empName", target = "name"),
            @Mapping(source = "departmentDTO", target = "department")
    })
    Employee toEntity(EmployeeDTO employeeDTO);

    @Mappings({
            @Mapping(target = "empId", source = "id"),
            @Mapping(target = "empName", source = "name"),
            @Mapping(target = "departmentDTO", source = "department")
    })
    EmployeeDTO toDto(Employee employee);
}
