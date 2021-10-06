package com.contact.service.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.service.entities.Contact;
import com.contact.service.services.ContactService;

@RestController
@RequestMapping("/contact")
public final class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable Long userId)
	{
		return contactService.getContactsOfUser(userId);
	}
}
