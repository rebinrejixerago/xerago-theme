package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AdvisoryBoardModel {

	@Inject
	private String title;
	
	@Inject
	private String subTitle;
	
	@Inject
	private List<AdvisoryMembers> advisoryMembers;

	public String getTitle() {
		return title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public List<AdvisoryMembers> getAdvisoryMembers() {
		return advisoryMembers;
	}
}
