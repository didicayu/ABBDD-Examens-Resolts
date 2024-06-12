public class Rectangle extends Figure {
    private final double width, height;

    private Rectangle(RectangleBuilder builder) {
        super(builder);
        this.width = builder.width;
        this.height = builder.height;
    }

    public static RectangleBuilder create(){
        return new RectangleBuilder();
    }

    public static class RectangleBuilder extends Builder<RectangleBuilder>{
        private double width, height;

        public RectangleBuilder withDimensions(double width, double height){
            this.width = width;
            this.height = height;
            return this;
        }

        @Override
        public RectangleBuilder self() {
            return this;
        }

        @Override
        public Figure execute() {
            if (width <= 0 || height <= 0) throw new IllegalArgumentException();
            return new Rectangle(this);
        }
    }
}
