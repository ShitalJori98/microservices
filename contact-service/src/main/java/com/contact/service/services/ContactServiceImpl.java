package com.contact.service.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.service.entities.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	//fake contact List
	List<Contact> list = List.of(
			new Contact(1L,"shital@gmail.com" ,"Shital" ,11L),
			new Contact(2L,"rasika@gmail.com" ,"Rasika" ,12L),
			new Contact(3L,"neha@gmail.com" ,"Neha" ,11L)
	);


	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	

}
