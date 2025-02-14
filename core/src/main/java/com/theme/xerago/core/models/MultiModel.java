package com.theme.xerago.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class MultiModel {

	@Inject
	private String iconreference;
	
	@Inject
	private String icontitle;
	
	@Inject
	private String description;

	public String getIconreference() {
		return iconreference;
	}

	public String getIcontitle() {
		return icontitle;
	}

	public String getDescription() {
		return description;
	}
}
	
