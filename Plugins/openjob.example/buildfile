# Version number for this release
VERSION_NUMBER = "1.0.0-SNAPSHOT"

# Specify Maven 2.0 remote repositories here, like this:
repositories.remote << "http://jcenter.bintray.com"


DEP_JUNIT = ['junit:junit:jar:4.10','org.hamcrest:hamcrest-core:jar:1.1']
DEP_JBEHAVE = ['org.jbehave:jbehave-core:jar:4.0-beta-3','de.codecentric:jbehave-junit-runner:jar:1.0.1']
DEP_OTHERS =
['junit:junit:jar:4.10',
 'org.hamcrest:hamcrest-core:jar:1.1',
 'org.jbehave:jbehave-core:jar:4.0-beta-3',
 'junit:junit-dep:jar:4.8.2',
 'org.hamcrest:hamcrest-library:jar:1.1',
 'org.hamcrest:hamcrest-integration:jar:1.1',
 'commons-collections:commons-collections:jar:3.2.1',
 'commons-io:commons-io:jar:1.4',
 'commons-lang:commons-lang:jar:2.5',
 'org.codehaus.plexus:plexus-utils:jar:2.0.5',
 'org.freemarker:freemarker:jar:2.3.16',
 'com.thoughtworks.paranamer:paranamer:jar:2.4',
 'com.thoughtworks.xstream:xstream:jar:1.3.1',
 'xpp3:xpp3_min:jar:1.1.4c',
 'de.codecentric:jbehave-junit-runner:jar:1.0.1',
 'org.mockito:mockito-core:jar:1.9.0',
 'org.objenesis:objenesis:jar:1.0']
 
DEPS = [DEP_JUNIT, DEP_JBEHAVE, DEP_OTHERS]
# to find transitive dependencies, uncomment the next two lines. The result can then be used to explicitly
# pin the dependencies like shown in the third line. Alternatively, transitive(LOGBACK) adds all transitive
# dependencies directly (as shown in line 32).

#pp transitive(DEPS).map {|x| x.to_spec}
#exit


desc "JBehave Demo"
define "openjob" do

  
  define "example" do
    project.version = VERSION_NUMBER
    project.group = "de.openjobs"
  
    compile.using(:source => '1.6', :target => '1.6')
    compile.with transitive(DEPS)
   # test.compile.with transitive(DEPS)
    #test.using :jbehave
    #package(:jar)
    #package(:javadoc)
    #package(:sources)
    
  end

end
