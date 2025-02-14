package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FaqModel {

	@ValueMapValue
	private String imageReference;
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@Inject
	private List<FaqList> quesAndAnswers;

	public String getImageReference() {
		return imageReference;
	}

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public List<FaqList> getQuesAndAnswers() {
		return quesAndAnswers;
	}
}
