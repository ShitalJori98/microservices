package com.contact.service.services;

import java.util.List;

import com.contact.service.entities.Contact;

public interface ContactService {

	  public List<Contact> getContactsOfUser(Long userId);
}
