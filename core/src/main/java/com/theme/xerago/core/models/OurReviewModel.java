package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OurReviewModel {
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String subTitle;
	
	@Inject 
	private List<OurReviewSection> reviewSection;
	
	@ValueMapValue
	private String quoteReference;
	
	@ValueMapValue
	private String optionalContent;

	public String getOptionalContent() {
		return optionalContent;
	}

	public String getQuoteReference() {
		return quoteReference;
	}

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public List<OurReviewSection> getReviewSection() {
		return reviewSection;
	}

}
