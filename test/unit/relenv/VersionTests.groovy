package relenv

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class VersionTests {

    void setUp() {
        // Setup logic here
    }

    void tearDown() {
        // Tear down logic here
    }

    void testPersist() {
        def versions = [
			new Version(appName: "app1", tag: "1.0.0", createdDate:new Date(), partOf:new Release()),
			new Version(appName: "app2", tag: "1.0.0", createdDate:new Date(), partOf:new Release()),
			new Version(appName: "app3", tag: "1.0.0", createdDate:new Date(), partOf:new Release()),
			new Version(appName: "app4", tag: "1.0.0", createdDate:new Date(), partOf:new Release()),
			new Version(appName: "app5", tag: "1.0.0", createdDate:new Date(), partOf:new Release())]
		versions*.save(flush: true)
		
		assertEquals 5, Version.list().size()
		def actualVersion = Version.findByAppName("app1")
		assert actualVersion
		assertEquals "app1", actualVersion.appName
    }
	
	void testToString() {
		def version = new Version(appName: "Orca", tag: "v1.0.0")
		assertEquals version.toString(), "Orca:v1.0.0"
	}
}
