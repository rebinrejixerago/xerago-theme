package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AdvisoryMembers {

	@Inject
	private String memberReference;
	
	@Inject
	private String memberName;
	
	@Inject
	private String memberDesig;
	
	@Inject
	private List<AdvisoryBoardSocial> socialMediaProfiles;

	public String getMemberReference() {
		return memberReference;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberDesig() {
		return memberDesig;
	}

	public List<AdvisoryBoardSocial> getSocialMediaProfiles() {
		return socialMediaProfiles;
	}
}
