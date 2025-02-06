package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderTopNavigation {

	@Inject
	private String topNavTitle;
	
	@Inject
	private String topNavUrl;

	public String getTopNavTitle() {
		return topNavTitle;
	}

	public String getTopNavUrl() {
		return topNavUrl;
	}
}
