package com.course.structure;

import java.util.*;

public class Building {

	float sqft;
	int stories;

	public void setFeet (float sqft) {
		this.sqft = sqft;
	}

	public void setStories(int stories) {
		this.stories = stories;
	}

	public int getStories() {
		return stories;
	}

	public float getFeet() {
		return sqft;
	}

	public String toString()
	{
		return ("Building has "+sqft+" sq.feet rooms in "+stories+" stories.");
	}

}
