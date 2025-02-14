package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MainBannerTrustContent {

	@ValueMapValue
	private String trustReference;
	
	@ValueMapValue
	private String imageDes;

	public String getTrustReference() {
		return trustReference;
	}

	public String getImageDes() {
		return imageDes;
	}
}
