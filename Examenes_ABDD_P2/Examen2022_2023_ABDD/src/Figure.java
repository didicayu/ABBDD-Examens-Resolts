public abstract class Figure {
    public double x = 0;
    public double y = 0;

    public static Builder create(){
        return new Builder();
    }

    public static class Builder{
        public double x, y;
        public double width = 0;
        public double height = 0;
        public double radius = 0;

        public boolean hasAt = false;
        public boolean hasDimensions = false;
        public boolean hasRadius = false;

        public Builder at (double x, double y){
            if(!hasAt){
                this.x = x;
                this.y = y;
                this.hasAt = true;
                return this;
            }
            else{
                throw new IllegalStateException("Ya se ha realizado el at anteriormente");
            }
        }

        public Builder withDimensions(double width, double height){
            if(!hasRadius){
                this.width = width;
                this.height = height;
                this.hasDimensions = true;
                return this;
            }
            else{
                throw new IllegalStateException("No se puede hacer un withDimensions cuando anteriormente se ha hecho un withRadius");
            }
        }

        public Builder withRadius(double radius){
            if(!hasDimensions){
                this.radius = radius;
                this.hasRadius = true;
                return this;
            }
            else{
                throw new IllegalStateException("No se puede hacer un withRadius cuando anteriormente se ha hecho un withDimensions");
            }
        }

        public Figure execute(){
            if(!hasDimensions && !hasRadius){
                throw new IllegalStateException("Problema con 0 with...");
            }
            if(hasRadius && hasDimensions){
                throw new IllegalStateException("Problema con 2 with...");
            }
            if(!hasAt){
                throw new IllegalStateException("Problema con At");
            }
            else{
                if(hasDimensions){
                    return new Rectangle(this);
                }
                else{
                    return new Circle(this);
                }
            }
        }
    }
}
