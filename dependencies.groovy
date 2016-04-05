grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
	inherits "global"
	log "warn"

	repositories {
		grailsHome()
		grailsCentral()
		mavenCentral()
	}

	dependencies {
		// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
		if (grailsVersion.startsWith("1.")) {
			compile('org.hibernate:hibernate-core:3.3.1.GA', "org.quartz-scheduler:quartz:2.1.5") {
				excludes 'ehcache', 'xml-apis', 'commons-logging', 'slf4j-api'
			}

		} else {
			compile('org.hibernate:hibernate-core:3.6.10.Final', "org.quartz-scheduler:quartz:2.1.5") {
				excludes 'ehcache', 'xml-apis', 'commons-logging', 'slf4j-api'
			}
			runtime "hsqldb:hsqldb:1.8.0.10"

		}
		// the following library makes accomodations for quartz2 but this is not packaged with Grails yet
		//compile('org.springframework:org.springframework.context.support:3.2.0.RELEASE')
	}


}
