package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AdvisoryMembers {

	@Inject
	private String memberReference;
	
	@Inject
	private String memberName;
	
	@Inject
	private String memberDesig;
	
	@ValueMapValue
	private String facebookUrl;
	
	@ValueMapValue
	private String twitterUrl;
	
	@ValueMapValue
	private String instagramUrl;
	
	@ValueMapValue
	private String linkedUrl;

	public String getMemberReference() {
		return memberReference;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberDesig() {
		return memberDesig;
	}

	public String getFacebookUrl() {
		return facebookUrl;
	}

	public String getTwitterUrl() {
		return twitterUrl;
	}

	public String getInstagramUrl() {
		return instagramUrl;
	}

	public String getLinkedUrl() {
		return linkedUrl;
	}
}
