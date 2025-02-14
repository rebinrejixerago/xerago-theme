package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BlogDetailsModel {

	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String articleImageReference;
	
	@ValueMapValue
	private String authorImageReference;
	
	@ValueMapValue
	private String authorName;
	
	@ValueMapValue
	private String authorRole;
	
	@Inject 
	private List<AdvisoryBoardSocial> socialMediaProfiles;

	public String getTitle() {
		return title;
	}

	public String getArticleImageReference() {
		return articleImageReference;
	}

	public String getAuthorImageReference() {
		return authorImageReference;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getAuthorRole() {
		return authorRole;
	}

	public List<AdvisoryBoardSocial> getSocialMediaProfiles() {
		return socialMediaProfiles;
	}
}
