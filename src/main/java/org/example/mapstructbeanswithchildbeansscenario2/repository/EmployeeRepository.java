package org.example.mapstructbeanswithchildbeansscenario2.repository;

import org.example.mapstructbeanswithchildbeansscenario2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
