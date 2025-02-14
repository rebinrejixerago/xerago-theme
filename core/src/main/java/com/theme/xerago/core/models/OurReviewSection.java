package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OurReviewSection {

	@ValueMapValue
	private String review;
	
	@ValueMapValue
	private String reviewerReference;
	
	@ValueMapValue
	private String reviewerName;
	
	@ValueMapValue
	private String reviewerDesignation;

	public String getReview() {
		return review;
	}

	public String getReviewerReference() {
		return reviewerReference;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public String getReviewerDesignation() {
		return reviewerDesignation;
	}
}
