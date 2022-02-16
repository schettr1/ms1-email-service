package com.sbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbc.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Integer>{

}
