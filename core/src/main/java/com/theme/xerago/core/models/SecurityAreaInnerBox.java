package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SecurityAreaInnerBox {

	@ValueMapValue
	private String innerReference;
	
	@ValueMapValue
	private String innerSecurityContent;

	public String getInnerReference() {
		return innerReference;
	}

	public String getInnerSecurityContent() {
		return innerSecurityContent;
	}
}
