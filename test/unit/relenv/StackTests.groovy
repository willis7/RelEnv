package relenv



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Stack)
class StackTests {

	void testPersist() {
		def stack = [
			new Stack(number: "1"),
			new Stack(number: "2"),
			new Stack(number: "3")]
			stack*.save(flush: true)
		
		assertEquals 3, Stack.count()
		def actualStk = Stack.findByNumber("1")
		assert actualStk
		assertEquals "1", actualStk.number
	}
	
	void testToString() {
		def stack = new Stack(number: 1)
		assertEquals stack.toString(), "Stack: 1"
	}
}
