package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderLangSelector {

	@Inject
	private String language;
	
	@Inject
	private String langIconReference;

	public String getLanguage() {
		return language;
	}

	public String getLangIconReference() {
		return langIconReference;
	}
}
