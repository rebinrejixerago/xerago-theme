package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SubscriptionModel {

	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@Inject 
	private List<SubscriptionCard> cardSection;

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public List<SubscriptionCard> getCardSection() {
		return cardSection;
	}
}
