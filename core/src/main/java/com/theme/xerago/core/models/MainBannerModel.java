package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MainBannerModel {

	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@ValueMapValue
	private String bannerReference;
	
	@ValueMapValue
	private String description;
	
	@ValueMapValue
	private String bannerButtonName;
	
	@ValueMapValue
	private String bannerButtonUrl;
	
	@Inject 
	private List<MainBannerTrustContent> trustContent;

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getBannerReference() {
		return bannerReference;
	}

	public String getDescription() {
		return description;
	}

	public String getBannerButtonName() {
		return bannerButtonName;
	}

	public String getBannerButtonUrl() {
		return bannerButtonUrl;
	}

	public List<MainBannerTrustContent> getTrustContent() {
		return trustContent;
	}
	
}
