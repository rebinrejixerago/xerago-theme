package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterModel {

	@ValueMapValue
	private String logoReference;
	
	@Inject
	private List<FooterMenu> footerMenus;
	
	@ValueMapValue
	private String contactTitle;
	
	@ValueMapValue
	private String addressTitle;
	
	@ValueMapValue
	private String address;
	
	@ValueMapValue
	private String emailTitle;
	
	@ValueMapValue
	private String emailId;
	
	@ValueMapValue
	private String phoneTitle;
	
	@ValueMapValue
	private String phoneNumber;
	
	@ValueMapValue
	private String faxTitle;
	
	@ValueMapValue
	private String fax;
	
	@ValueMapValue
	private String copyright;

	public String getLogoReference() {
		return logoReference;
	}

	public List<FooterMenu> getFooterMenus() {
		return footerMenus;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public String getAddressTitle() {
		return addressTitle;
	}

	public String getAddress() {
		return address;
	}

	public String getEmailTitle() {
		return emailTitle;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getPhoneTitle() {
		return phoneTitle;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFaxTitle() {
		return faxTitle;
	}

	public String getFax() {
		return fax;
	}

	public String getCopyright() {
		return copyright;
	}
}
