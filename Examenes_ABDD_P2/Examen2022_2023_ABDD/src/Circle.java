public class Circle extends Figure{
    public double radius = 0;

    public Circle(Builder builder){
        this.x = builder.x;
        this.y = builder.y;
        this.radius = builder.radius;
    }
}
