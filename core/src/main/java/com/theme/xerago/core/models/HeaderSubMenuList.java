package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderSubMenuList {

	@Inject
	private String subMenuTitle;
	
	@Inject
	private String subMenuUrl;

	public String getSubMenuTitle() {
		return subMenuTitle;
	}

	public String getSubMenuUrl() {
		return subMenuUrl;
	}
}
