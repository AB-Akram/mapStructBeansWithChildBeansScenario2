package org.example.mapstructbeanswithchildbeansscenario2.repository;

import org.example.mapstructbeanswithchildbeansscenario2.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
