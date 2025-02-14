package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SubscriptionCard {

	@ValueMapValue
	private String iconReference;
	
	@ValueMapValue
	private String cardTitle;
	
	@ValueMapValue
	private String cardDescription;
	
	@ValueMapValue
	private String buttonName;
	
	@ValueMapValue
	private String buttonUrl;

	public String getIconReference() {
		return iconReference;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public String getButtonName() {
		return buttonName;
	}

	public String getButtonUrl() {
		return buttonUrl;
	}
}
