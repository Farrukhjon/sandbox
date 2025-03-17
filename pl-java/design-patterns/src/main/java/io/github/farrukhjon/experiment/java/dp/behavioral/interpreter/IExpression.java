package io.github.farrukhjon.experiment.java.dp.behavioral.interpreter;

import java.util.Map;

public interface IExpression {

	public int interpret(Map<String, IExpression> variables);
}
