package com.theme.xerago.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FooterMenu {

	@ValueMapValue
	private String sectionTitle;

	@Inject
	private List<FooterRelatedPages> relatedPages;

	public String getSectionTitle() {
		return sectionTitle;
	}

	public List<FooterRelatedPages> getRelatedPages() {
		return relatedPages;
	}
}
