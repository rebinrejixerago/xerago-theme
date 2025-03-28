package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PricingMultiModel {
	
	@Inject
	private String boxtitle;
			
	@Inject
	private String planfee;
	
	@Inject
	private String planperiod;
	
	@Inject
	private String buttonText;
	
	@Inject
	private String linkPath;
			
	@Inject
	private List<PricingPlanFeatureList> featureList;

	@Inject
	private String enableFeature;

	public String getBoxtitle() {
		return boxtitle;
	}
	
	public String getPlanfee() {
		return planfee;
	}

	public String getPlanperiod() {
		return planperiod;
	}

	public String getButtonText() {
		return buttonText;
	}
	
	
	
	public String getLinkPath() {
		return linkPath;
	}

	public List<PricingPlanFeatureList> getFeatureList() {
		return featureList;
	}

	public String getEnableFeature() {
		return enableFeature;
	}

	

}
