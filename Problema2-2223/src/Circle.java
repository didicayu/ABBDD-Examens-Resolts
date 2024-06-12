public class Circle extends Figure {
    private final double radius;

    private Circle(CircleBuilder builder) {
        super(builder);
        this.radius = builder.radius;
    }

    public static CircleBuilder create(){
        return new CircleBuilder();
    }

    public static class CircleBuilder extends Builder<CircleBuilder> {
        private double radius;

        public CircleBuilder withRadius(double radius) {
            this.radius = radius;
            return this;
        }

        @Override
        public CircleBuilder self() {
            return this;
        }

        @Override
        public Figure execute() {
            if (radius <= 0) { throw new IllegalArgumentException("Radius must be greater than 0"); }
            return new Circle(this);
        }
    }
}
