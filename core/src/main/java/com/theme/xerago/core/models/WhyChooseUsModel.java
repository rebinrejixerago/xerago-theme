package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WhyChooseUsModel {

	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@ValueMapValue
	private String description;
	
	@Inject 
	private List<WhyChooseUsList> chooseUs;
	
	@ValueMapValue
	private String leftReference;
	
	@ValueMapValue
	private String rightTopReference;

	@ValueMapValue
	private String rightBottomReference;

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public String getDescription() {
		return description;
	}

	public List<WhyChooseUsList> getChooseUs() {
		return chooseUs;
	}

	public String getLeftReference() {
		return leftReference;
	}

	public String getRightTopReference() {
		return rightTopReference;
	}

	public String getRightBottomReference() {
		return rightBottomReference;
	}
}
