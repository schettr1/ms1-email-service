package com.sbc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbc.entity.Email;
import com.sbc.exception.InvalidRequestException;
import com.sbc.repository.EmailRepository;

@Service
@Transactional
public class EmailService {

	@Autowired
	EmailRepository erepository;
	
	public void sendEmail(Email email) {
		erepository.save(email);
	}

	public Email getEmail(int id) {
		return erepository.findById(id)
				.orElseThrow(
						() -> new InvalidRequestException("id=" + id + " cannot be found."));	
		
	}
}
