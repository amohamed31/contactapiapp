package com.codewithayii.contactapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.codewithayii.contactapi.domain.Contact;
import com.codewithayii.contactapi.repo.ContactRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
public class ContactService {
    private final ContactRepository contactRepo;

    public Page<Contact> getAllContacts(int page, int size) {
        return contactRepo.findAll(PageRequest.of(page, size, Sort.by("name")));
    }

    public Contact getContact(String id) {
        return contactRepo.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    public Contact createContact(Contact contact) {
        return contactRepo.save(contact);
    }

    public void deleteContact(Contact contact) {
        // Assignment
    }

}
