package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CoverageCardList {

	@ValueMapValue
	private String coverageReference;
	
	@ValueMapValue
	private String cardTitle;
	
	@ValueMapValue
	private String cardDescription;

	public String getCoverageReference() {
		return coverageReference;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public String getCardDescription() {
		return cardDescription;
	}
}
