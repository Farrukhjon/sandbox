package io.github.farrukhjon.experiment.java.dp.structural.composite.solution1;

public class Client {

    public static void main(String[] args) {

        IGraphic ellipse1 = new Ellipse();
        IGraphic ellipse2 = new Ellipse();
        IGraphic ellipse3 = new Ellipse();

        IGraphic circle1 = new Circle();
        IGraphic circle2 = new Circle();
        IGraphic circle3 = new Circle();


        CompositeGraphic compositeGraphic1 = new CompositeGraphic();
        compositeGraphic1.add(ellipse1);
        compositeGraphic1.add(ellipse2);

        CompositeGraphic compositeGraphic2 = new CompositeGraphic();
        compositeGraphic2.add(ellipse3);

        compositeGraphic2.add(circle1);
        compositeGraphic2.add(circle2);
        compositeGraphic2.add(circle3);

        CompositeGraphic compositeGraphic0 = new CompositeGraphic();
        compositeGraphic0.add(compositeGraphic1);
        compositeGraphic0.add(compositeGraphic2);

        compositeGraphic0.print();
        compositeGraphic2.remove(ellipse3);
        System.out.println("------------");
        compositeGraphic0.print();

    }
}
