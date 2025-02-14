package com.theme.xerago.core.models;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.sling.models.annotations.Model;

@Model (adaptables=Resource.class)
public class DemoNewModel {

	@Inject
	private String text;

	public String getDescriptionText() {
		return text;
	}
}
