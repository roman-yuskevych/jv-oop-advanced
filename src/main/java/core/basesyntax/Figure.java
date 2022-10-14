package core.basesyntax;

public abstract class Figure implements Drawing, AreaCalculator {
    private String color;

    public Figure() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}