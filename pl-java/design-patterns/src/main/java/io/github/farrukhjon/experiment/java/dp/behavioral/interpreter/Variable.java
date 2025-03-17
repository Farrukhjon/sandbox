package io.github.farrukhjon.experiment.java.dp.behavioral.interpreter;

import java.util.Map;

public class Variable implements IExpression {

	private String	name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public int interpret(Map<String, IExpression> variables) {
		if (variables == null)
			return 0;
		return variables.get(name).interpret(variables);
	}

}
