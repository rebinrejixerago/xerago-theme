package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BusinessPartnerList {

	@Inject
	private String partnerReference;
	
	@Inject
	private String partnerUrl;

	public String getPartnerReference() {
		return partnerReference;
	}

	public String getPartnerUrl() {
		return partnerUrl;
	}
}
