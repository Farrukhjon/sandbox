package io.github.farrukhjon.experiment.groovy.closure

class TestTwoTypeDefOfClosure {
	
	def static closure = {}

	static Closure closure1 = {}

	static main(args) {
		assert (closure instanceof Closure) == true
		assert (closure1 instanceof Closure) == true
	}
}
