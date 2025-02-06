package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AboutUsModel {

	@Inject
	private String title;
	
	@Inject
	private List<AboutUsPageNav> pageNav;
	
	@Inject
	private String bannerReference;
	
	@Inject
	private String animatedReference;

	public String getTitle() {
		return title;
	}

	public List<AboutUsPageNav> getPageNav() {
		return pageNav;
	}

	public String getBannerReference() {
		return bannerReference;
	}

	public String getAnimatedReference() {
		return animatedReference;
	}
	
}
