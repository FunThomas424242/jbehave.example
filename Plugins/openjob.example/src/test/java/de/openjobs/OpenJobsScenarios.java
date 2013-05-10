package de.openjobs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import de.openjobs.step.BewerbenSteps;
import de.openjobs.step.StackSteps;

@RunWith(JUnitReportingRunner.class)
public class OpenJobsScenarios extends JUnitStories {

	public OpenJobsScenarios() {
		EmbedderControls embedderControls = configuredEmbedder()
				.embedderControls();
		embedderControls.doBatch(false);
		embedderControls.doGenerateViewAfterStories(true);
		embedderControls.doIgnoreFailureInStories(false);
		embedderControls.doIgnoreFailureInView(false);
		embedderControls.doSkip(false);
		embedderControls.doVerboseFailures(false);
		embedderControls.doVerboseFiltering(false);
		embedderControls.useStoryTimeoutInSecs(300);
		embedderControls.useThreads(1);

		JUnitReportingRunner.recommandedControls(configuredEmbedder());

	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new BewerbenSteps(),
				new StackSteps());
	}

	@Override
	public Configuration configuration() {
		// see http://blog.codecentric.de/en/2012/06/jbehave-configuration-tutorial/
		MostUsefulConfiguration configuration= new MostUsefulConfiguration();
		Keywords keywords = new LocalizedKeywords(Locale.GERMAN);
		configuration.useKeywords(keywords);
		
		
//				configuration.doDryRun(false); "no dry run" is implicit by using
//				default StoryControls
//		 
//				configuration.useDefaultStoryReporter(new ConsoleOutput());
//				deprecated -- rather use StoryReportBuilder
		 
//				configuration.useFailureStrategy(new RethrowingFailure());
//				configuration.useKeywords(new LocalizedKeywords(Locale.ENGLISH));
//				configuration.usePathCalculator(new AbsolutePathCalculator());
//				configuration.useParameterControls(new ParameterControls());
//				configuration.useParameterConverters(new ParameterConverters());
//				configuration.useParanamer(new NullParanamer());
//				configuration.usePendingStepStrategy(new PassingUponPendingStep());
//				configuration.useStepCollector(new MarkUnmatchedStepsAsPending());
//				configuration.useStepdocReporter(new PrintStreamStepdocReporter());
//				configuration.useStepFinder(new StepFinder());
//				configuration.useStepMonitor(new SilentStepMonitor());
//				configuration
//						.useStepPatternParser(new RegexPrefixCapturingPatternParser());
//				configuration.useStoryControls(new StoryControls());
//				configuration.useStoryLoader(new LoadFromClasspath());
//				configuration.useStoryParser(new RegexStoryParser(configuration
//						.keywords()));
//				configuration.useStoryPathResolver(new UnderscoredCamelCaseResolver());
//				configuration.useStoryReporterBuilder(new StoryReporterBuilder());
//				configuration.useViewGenerator(new FreemarkerViewGenerator());
//		 
				
				return configuration;
	}

	@Override
	protected List<String> storyPaths() {

		URL storyURL = null;
		try {
			// This requires you to start Maven from the project directory
			storyURL = new URL("file://" + System.getProperty("user.dir")
					+ "/src/test/resources/stories/");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		List<String> stories = new StoryFinder().findPaths(storyURL,
				"**/*.story", "");
		return stories;
	}

	
	
	
}
