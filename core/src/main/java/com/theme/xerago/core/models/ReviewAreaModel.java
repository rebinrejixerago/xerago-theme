package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ReviewAreaModel {
	
	@Inject
	private String title;
	
	@Inject
	private String subtitle;
	
	
	@Inject
	private List<ReviewAreaMultiModel> review;
	
	@Inject
	private String content;

	public String getTitle() {
		return title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public List<ReviewAreaMultiModel> getReview() {
		return review;
	}

	public String getContent() {
		return content;
	}
	
	
	
	
	

}
