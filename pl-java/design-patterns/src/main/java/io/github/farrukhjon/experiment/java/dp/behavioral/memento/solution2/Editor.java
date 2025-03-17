package io.github.farrukhjon.experiment.java.dp.behavioral.memento.solution2;

public class Editor {

	private String	editorContents;

	public void setState(String contents) {
		this.editorContents = contents;
	}

	public String getState() {
		return editorContents;
	}

	public EditorMemento save() {
		return new EditorMemento(editorContents);
	}

	public void restoreToState(EditorMemento memento) {
		editorContents = memento.getSavedState();
	}
}
