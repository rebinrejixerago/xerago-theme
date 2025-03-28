package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PaymentServicesModel {
	@Inject
	private String subtitle;
	
	@Inject
	private String title;
	
	@Inject
	private String description;
	
	@Inject
	private List<PaymentServicesFeatureList> featuresList;

	@Inject
	private String servicesImage;
	
	public String getSubtitle() {
		return subtitle;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
	
	public List<PaymentServicesFeatureList> getFeaturesList() {
		return featuresList;
	}

	public String getServicesImage() {
		return servicesImage;
	}
	


}

