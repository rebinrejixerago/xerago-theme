package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AboutUsPageNav {

	@Inject
	private String pageName;
	
	@Inject
	private String pageUrl;

	public String getPageName() {
		return pageName;
	}

	public String getPageUrl() {
		return pageUrl;
	}
	
}
