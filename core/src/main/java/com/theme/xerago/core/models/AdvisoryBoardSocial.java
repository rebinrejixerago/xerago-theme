package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AdvisoryBoardSocial {

	@Inject
	private String socialReference;
	
	@Inject
	private String socialMediaUrl;

	public String getSocialReference() {
		return socialReference;
	}

	public String getSocialMediaUrl() {
		return socialMediaUrl;
	}
}
