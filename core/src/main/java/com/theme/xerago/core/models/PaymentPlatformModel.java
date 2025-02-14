package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PaymentPlatformModel {
	
	@Inject
	private String firstImage;
	
	@Inject
	private String secondImage;
	
	@Inject
	private String thirdImage;
	
	@Inject
	private String fourthImage;
	
	@Inject
	private String fifthImage;
	
	@Inject
	private String subtitle;
	
	@Inject
	private String title;
	
	@Inject
	private String description;

	
	public String getFirstImage() {
		return firstImage;
	}

	public String getSecondImage() {
		return secondImage;
	}

	public String getThirdImage() {
		return thirdImage;
	}

	public String getFourthImage() {
		return fourthImage;
	}

	public String getFifthImage() {
		return fifthImage;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
		
}
