package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MobileAppButtonList {

	@ValueMapValue
	private String buttonReference;
	
	@ValueMapValue
	private String buttonUrl;

	public String getButtonReference() {
		return buttonReference;
	}

	public String getButtonUrl() {
		return buttonUrl;
	}
}
