package io.github.farrukhjon.experiment.groovy.closure

class ClosureDefaultItemParam {

	def static square = { it * it }

	static main(args){
		def result =  square(3)
		println result
	}
}
