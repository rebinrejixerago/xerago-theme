package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ReviewAreaMultiModel {
	
	@Inject
	private String description;
	
	@Inject
	private String Icon;
	
	@Inject
	private String reviewername;
	
	@Inject
	private String designation;

	public String getDescription() {
		return description;
	}

	public String getIcon() {
		return Icon;
	}

	public String getReviewername() {
		return reviewername;
	}

	public String getDesignation() {
		return designation;
	}
	
	
	

}
