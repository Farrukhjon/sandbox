package io.github.farrukhjon.experiment.java.dp.behavioral.memento.solution2;

public class EditorMemento {

	private final String	editorState;

	public EditorMemento(String state) {
		editorState = state;
	}

	public String getSavedState() {
		return editorState;
	}
}
