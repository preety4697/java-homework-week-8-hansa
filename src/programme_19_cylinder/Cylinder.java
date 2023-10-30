package programme_19_cylinder;

public class Cylinder extends Circle{
    private double height;

     Cylinder(double radius,double height){
        super(radius);// Call the constructor of the parent class (Circle)
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea() * height;
    }
}
