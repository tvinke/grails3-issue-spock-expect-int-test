package test


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class SpockWhereIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

	// either enabling this test 1 or the 2nd test's presence makes the 3rd succeed
	@Ignore
	def "just expect"() {
		expect:
		true
	}
	
	// either enabling this test 2 or the 1st test's presence makes the 3rd succeed
	@Ignore
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
