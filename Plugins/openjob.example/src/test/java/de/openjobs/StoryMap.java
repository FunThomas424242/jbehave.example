package de.openjobs;

import java.util.ArrayList;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStoryMaps;
import org.jbehave.core.reporters.StoryReporterBuilder;

public class StoryMap extends JUnitStoryMaps {

	public StoryMap() {
		configuredEmbedder().useMetaFilters(metaFilters());
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration()
				.useStoryReporterBuilder(new StoryReporterBuilder()
						.withCodeLocation(new StoryPfadBuilder().getStartURL()));
	}

	@Override
	protected List<String> metaFilters() {
		final ArrayList<String> filters = new ArrayList<String>();
		filters.add("+author *");
		filters.add("+theme *");
		filters.add("-skip");
		return filters;
	}

	@Override
	protected List<String> storyPaths() {

		List<String> stories = new StoryFinder().findPaths(new StoryPfadBuilder().getStartURL(),
				"**/*.story", "");
		return stories;

	}

	

}
