public abstract class Shape implements Measurable {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea(double area) {
        return area;
    }

    @Override
    public double getPerimeter(double perimeter) {
        return perimeter;
    }
}
