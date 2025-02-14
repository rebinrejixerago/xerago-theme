package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FeatureAreaModel {

	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@ValueMapValue
	private String featureReference;
	
	@Inject 
	private List<FeatureCard> featureCard;

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getFeatureReference() {
		return featureReference;
	}

	public List<FeatureCard> getFeatureCard() {
		return featureCard;
	}
}
