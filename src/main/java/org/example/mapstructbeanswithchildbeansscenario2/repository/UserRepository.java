package org.example.mapstructbeanswithchildbeansscenario2.repository;

import org.example.mapstructbeanswithchildbeansscenario2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
