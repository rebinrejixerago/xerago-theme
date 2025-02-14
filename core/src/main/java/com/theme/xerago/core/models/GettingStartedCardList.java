package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class GettingStartedCardList {

	@ValueMapValue
	private String cardReference;
	
	@ValueMapValue
	private String cardTitle;
	
	@ValueMapValue
	private String cardDescription;

	public String getCardReference() {
		return cardReference;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public String getCardDescription() {
		return cardDescription;
	}
	
}
