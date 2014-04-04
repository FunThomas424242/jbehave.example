package de.openjobs;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.ParameterConverters.DateConverter;
import org.jbehave.core.steps.ParameterConverters.ExamplesTableConverter;
import org.jbehave.core.steps.SilentStepMonitor;
import org.junit.runner.RunWith;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import de.openjobs.steps.StackSteps;
import de.openjobs.steps.VermittlungsSteps;

@RunWith(JUnitReportingRunner.class)
public class RunScenarios extends JUnitStories {

	private final CrossReference xref = new CrossReference();

	public RunScenarios() {
		configuredEmbedder().embedderControls()
				.doGenerateViewAfterStories(true)
				.doIgnoreFailureInStories(false).doIgnoreFailureInView(true)
				.doVerboseFailures(true).useThreads(2)
				.useStoryTimeoutInSecs(60);
	}

	@Override
	public Configuration configuration() {
		Class<? extends Embeddable> embeddableClass = this.getClass();
		Properties viewResources = new Properties();
		viewResources.put("decorateNonHtml", "true");
		viewResources.put("reports", "ftl/jbehave-reports-with-totals.ftl");
		// Start from default ParameterConverters instance
		ParameterConverters parameterConverters = new ParameterConverters();
		// factory to allow parameter conversion and loading from external
		// resources (used by StoryParser too)
		ExamplesTableFactory examplesTableFactory = new ExamplesTableFactory(
				new LocalizedKeywords(),
				new LoadFromClasspath(embeddableClass), parameterConverters);
		// add custom converters
		parameterConverters.addConverters(new DateConverter(
				new SimpleDateFormat("yyyy-MM-dd")),
				new ExamplesTableConverter(examplesTableFactory));
		return new MostUsefulConfiguration()
				.useStoryLoader(new LoadFromClasspath(embeddableClass))
				.useStoryParser(new RegexStoryParser(examplesTableFactory))
				.useStoryReporterBuilder(
						new StoryReporterBuilder()
								.withCodeLocation(
										CodeLocations
												.codeLocationFromClass(embeddableClass))
								.withDefaultFormats()
								.withViewResources(viewResources)
								.withFormats(Format.HTML, Format.TXT,
										Format.XML)
								// , Format.CONSOLE)
								.withFailureTrace(true)
								.withFailureTraceCompression(true)
								.withCrossReference(xref))
				.useParameterConverters(parameterConverters)
				// use '%' instead of '$' to identify parameters
				.useStepPatternParser(
						new RegexPrefixCapturingPatternParser("%"))
				.useStepMonitor(new SilentStepMonitor());
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new StackSteps(),
				new VermittlungsSteps());
	}

	@Override
	protected List<String> storyPaths() {

		List<String> stories = new StoryFinder().findPaths(
				new StoryPfadBuilder().getStartURL(), "**/*.story", "");
		return stories;

	}

}