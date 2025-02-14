package com.theme.xerago.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FaqList {

	@ValueMapValue
	private String question;
	
	@ValueMapValue
	private String answers;

	public String getQuestion() {
		return question;
	}

	public String getAnswers() {
		return answers;
	}
}
