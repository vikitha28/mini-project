package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Contact;

public interface AdminRepository extends JpaRepository<Contact, Integer> {

}
