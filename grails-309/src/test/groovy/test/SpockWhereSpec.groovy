package test

import grails.test.mixin.TestMixin
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.*

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */
@TestMixin(GrailsUnitTestMixin)
class SpockWhereSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	def "just expect"() {
		expect:
		true
	}
	
	def "maximum of two numbers with then and where"(int a, int b, int c) {
		when: ""
				
		then:
		Math.max(a, b) == c

		where:
		a | b | c
		1 | 3 | 3
		7 | 4 | 7
		0 | 0 | 0
	}

	
    def "maximum of two numbers with expect and where"(int a, int b, int c) {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        7 | 4 | 7
        0 | 0 | 0
    }
}