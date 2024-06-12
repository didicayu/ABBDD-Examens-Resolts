public class Rectangle extends Figure{
    public double width = 0;
    public double height = 0;

    public Rectangle(Builder builder){
        this.x = builder.x;
        this.y = builder.y;
        this.width = builder.width;
        this.height = builder.height;
    }
}
