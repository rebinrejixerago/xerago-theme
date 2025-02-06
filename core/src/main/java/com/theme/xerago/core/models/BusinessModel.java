package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BusinessModel {
	
	@Inject
	private String title;
	
	@Inject
	private List<BusinessPartnerList> partnerList;
	
	@Inject
	private String description;
	
	@Inject
	private String buttonName;
	
	@Inject
	private String buttonUrl;

	public String getTitle() {
		return title;
	}

	public List<BusinessPartnerList> getPartnerList() {
		return partnerList;
	}

	public String getDescription() {
		return description;
	}

	public String getButtonName() {
		return buttonName;
	}

	public String getButtonUrl() {
		return buttonUrl;
	}

}
