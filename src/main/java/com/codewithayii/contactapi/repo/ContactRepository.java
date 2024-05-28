package com.codewithayii.contactapi.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codewithayii.contactapi.domain.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}
