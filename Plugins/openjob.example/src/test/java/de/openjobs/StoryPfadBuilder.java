package de.openjobs;

import java.net.MalformedURLException;
import java.net.URL;

import org.jbehave.core.io.CodeLocations;

public class StoryPfadBuilder {

	
	
	
	protected URL getStartURL() {
		return getURLofStoryDir();
	}

	protected URL getURLofClass() {
		return CodeLocations.codeLocationFromClass(this.getClass());
	}

	protected URL getURLofStoryDir() {
		URL storyURL = null;
		try {
			// This requires you to start Maven from the project directory
			storyURL = new URL("file://" + System.getProperty("user.dir")
					+ "/src/test/resources/stories/");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return storyURL;
	}
	
}
