package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FeatureCard {

	@ValueMapValue
	private String cardReference;
	
	@ValueMapValue
	private String cardTitle;
	
	@Inject 
	private List<FeatureCardContent> cardContent;

	public String getCardImage() {
		return cardReference;
	}

	public String getCardTitle() {
		return cardTitle;
	}

	public List<FeatureCardContent> getCardContent() {
		return cardContent;
	}
}
