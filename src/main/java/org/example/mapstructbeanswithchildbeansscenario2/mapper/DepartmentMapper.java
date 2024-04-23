package org.example.mapstructbeanswithchildbeansscenario2.mapper;

import org.example.mapstructbeanswithchildbeansscenario2.dto.DepartmentDTO;
import org.example.mapstructbeanswithchildbeansscenario2.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toEntity(DepartmentDTO departmentDTO);
    DepartmentDTO toDto(Department department);
}
