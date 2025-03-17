package io.github.farrukhjon.experiment.java.dp.behavioral.observer.solution1;

/**
 * @author Farrukhjon SATTOROV
 */
public class User implements Observer {

    private String article;
    private Subject blog;

    public String getArticle() {
        return this.article;
    }

    public void setSubject(Subject subject) {
        this.blog = subject;
        this.article = "No New Article!";
    }

    public void update() {
        System.out.println("State change reported by Subject.");
        this.article = (String) blog.getUpdate();
		System.out.println("Reading: " + this.getArticle());
    }
}
