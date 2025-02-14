package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MobileAppModel {

	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@ValueMapValue
	private String description;
	
	@ValueMapValue
	private String imageReference;
	
	@Inject 
	private List<MobileAppButtonList> buttonList;

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getDescription() {
		return description;
	}

	public String getImageReference() {
		return imageReference;
	}

	public List<MobileAppButtonList> getButtonList() {
		return buttonList;
	}
}
