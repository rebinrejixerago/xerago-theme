package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PricingPlanModel {
	
	@Inject
	private String subtitle;
	
	@Inject
	private String title;
	
	@Inject
	private List<PricingMultiModel> boxfeatures;

	public String getSubtitle() {
		return subtitle;
	}

	public String getTitle() {
		return title;
	}

	public List<PricingMultiModel> getBoxfeatures() {
		return boxfeatures;
	}

}
