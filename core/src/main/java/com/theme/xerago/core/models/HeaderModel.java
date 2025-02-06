package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {

	@Inject 
	private String phoneNumber;
	
	@Inject 
	private String email;
	
	@Inject
	private List<HeaderTopNavigation> topNavMulti;
	
	@Inject
	private List<HeaderLangSelector> langMulti;
	
	@Inject 
	private String logoReference;
	
	@Inject 
	private String logoUrl;
	
	@Inject
	private List<HeaderPageType> typeMulti;
	
	@Inject 
	private String loginButtonName;
	
	@Inject 
	private String loginButtonUrl;
	
	@Inject 
	private String registerButtonName;
	
	@Inject 
	private String registerButtonUrl;
	
	@Inject
	private List<HeaderMainMenuList> mainMenuMulti;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	public List<HeaderTopNavigation> getTopNavMulti() {
		return topNavMulti;
	}	

	public List<HeaderLangSelector> getLangMulti() {
		return langMulti;
	}

	public String getLogoReference() {
		return logoReference;
	}

	public String getLogoUrl() {
		return logoUrl;
	}
	
	public List<HeaderPageType> getTypeMulti() {
		return typeMulti;
	}
	
	public String getLoginButtonName() {
		return loginButtonName;
	}

	public String getLoginButtonUrl() {
		return loginButtonUrl;
	}

	public String getRegisterButtonName() {
		return registerButtonName;
	}

	public String getRegisterButtonUrl() {
		return registerButtonUrl;
	}
	
	public List<HeaderMainMenuList> getMainMenuMulti() {
		return mainMenuMulti;
	}

}
