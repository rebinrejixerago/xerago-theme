package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PropertyMoneyMultiModel {
	
	@Inject
	private String subtitle;
	
	@Inject
	private String title;
	
	@Inject
	private List<MultiModel> features;

	public String getSubtitle() {
		return subtitle;
	}

	public String getTitle() {
		return title;
	}

	public List<MultiModel> getFeatures() {
		return features;
	}

}