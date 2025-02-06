package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderMainMenuList {
	
	@Inject
	private String mainMenuTitle;
	
	@Inject
	private String mainMenuUrl;
	
	@Inject 
	private List<HeaderSubMenuList> subMenuMulti;

	public String getMainMenuTitle() {
		return mainMenuTitle;
	}

	public String getMainMenuUrl() {
		return mainMenuUrl;
	}

	public List<HeaderSubMenuList> getSubMenuMulti() {
		return subMenuMulti;
	}
	

}
