public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    public  double square;

    public Calculation(double radius, double side, double area, double phi){
        this.radius = radius;
        this.side = side;
        this.area = area;
        this.phi = phi;
    }

    public void setSquare(double radius){
        double area = radius * radius;
        this.square = area;
    }

    public static double getSquare(){
        return area;
    }

    public void setCircle

    public void setCircle(double side)

    @Override
    public void run() {

    }
}