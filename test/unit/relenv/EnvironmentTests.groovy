package relenv

import static org.junit.Assert.*

import grails.test.mixin.*
import grails.test.mixin.support.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class EnvironmentTests {

    void setUp() {
        // Setup logic here
    }

    void tearDown() {
        // Tear down logic here
    }
	
	void testPersist() {
		def envs = [
			new Environment(hostname: "host1", testTier: "Development", lastRefresh:new Date(), ownedBy: new Release(), partOf: new Stack()),
			new Environment(hostname: "host2", testTier: "Development", lastRefresh:new Date(), ownedBy: new Release(), partOf: new Stack())]
		envs*.save(flush: true)
		
		assertEquals 2, Environment.count()
		def actualEnv = Environment.findByHostname("host1")
		assert actualEnv
		assertEquals "host1", actualEnv.hostname
	}

    void testToString() {
		def env = new Environment(hostname: "whyldeap42", testTier: "Development")
		assertEquals env.toString(), "whyldeap42:Development"
	}
}
