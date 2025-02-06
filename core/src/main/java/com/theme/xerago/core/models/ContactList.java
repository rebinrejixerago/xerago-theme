package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactList {

	@Inject 
	private String contactReference;
	
	@Inject 
	private String contactTitle;
	
	@Inject 
	private String address;
	
	@Inject 
	private List<ContactDetailsEmail> emailList;
	
	@Inject 
	private List<ContactDetailsPhone> phoneList;
	
	@Inject 
	private List<ContactDetailsFax> faxList;

	public String getContactReference() {
		return contactReference;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public String getAddress() {
		return address;
	}

	public List<ContactDetailsEmail> getEmailList() {
		return emailList;
	}

	public List<ContactDetailsPhone> getPhoneList() {
		return phoneList;
	}

	public List<ContactDetailsFax> getFaxList() {
		return faxList;
	}
}
