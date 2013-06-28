package relenv

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class ReleaseTests {

    void setUp() {
        // Setup logic here
    }

    void tearDown() {
        // Tear down logic here
    }

    void testPersist() {
        def releases = [
			new Release(name: "1", status: "Active", startDate:new Date()),
			new Release(name: "2", status: "Active", startDate:new Date()),
			new Release(name: "3", status: "Active", startDate:new Date()),
			new Release(name: "4", status: "Active", startDate:new Date()),
			new Release(name: "5", status: "Active", startDate:new Date())]
		releases*.save(flush: true)
		
		assertEquals 5, Release.list().size()
		def actualRel = Release.findByName("1")
		assert actualRel
		assertEquals "1", actualRel.name
    }
	
	void testToString() {
		def release = new Release(name: "Release 1")
		assertEquals release.toString(), "Release 1"
	}
}
