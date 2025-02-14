package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OverviewAreaModel {
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@ValueMapValue
	private String perButtonName;
	
	@ValueMapValue
	private String perButtonUrl;
	
	@ValueMapValue
	private String busButtonName;
	
	@ValueMapValue
	private String busButtonUrl;

	public String getPerButtonName() {
		return perButtonName;
	}

	public String getPerButtonUrl() {
		return perButtonUrl;
	}

	public String getBusButtonName() {
		return busButtonName;
	}

	public String getBusButtonUrl() {
		return busButtonUrl;
	}

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

}
