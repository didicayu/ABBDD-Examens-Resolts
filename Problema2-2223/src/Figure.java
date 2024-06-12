public abstract class Figure {

    private final double x, y;

    protected Figure(Builder<?> builder){
        this.x = builder.x;
        this.y = builder.y;
    }

    public abstract static class Builder<T extends Builder<T>> {
        private double x, y;
        private boolean atCalled;

        public T at(double x, double y){
            if(atCalled) return self();
            this.x = x;
            this.y = y;
            atCalled = true;
            return self();
        }

        public abstract T self();

        public abstract Figure execute();

    }


}
