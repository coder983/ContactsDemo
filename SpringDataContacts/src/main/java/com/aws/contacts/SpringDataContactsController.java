/**
 * 
 */
package com.aws.contacts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aws.contacts.domain.ContactRepository;
import com.aws.contacts.domain.Contact;

/**
 * @author coder983
 *
 */

@Controller
@RequestMapping("/")
public class SpringDataContactsController {
	
	@Autowired
	ContactRepository contactRepo;
	
	@RequestMapping
	public String viewContacts(ModelMap model) {
		
		List<Contact> contacts = new ArrayList<Contact>(); 
		
		contacts = (List<Contact>) contactRepo.findAll();
		
		model.put("contacts", contacts);
				
		return "mainview";
	}

}
