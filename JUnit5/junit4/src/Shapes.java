public class Shapes {

    public double areaOfSquare(double length){
        return length*length;
    }

    public double areaOfCircle(double radius){
        return Math.round(3.14*radius*radius * 100.0)/100.0;
    }


    public double areaOfRectangle(double length,double breath){
        return length*breath;
    }

}
