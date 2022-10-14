package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        final Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}