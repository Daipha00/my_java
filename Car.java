public class Car {
    private int speed;
    private double regularprice;
    private String color;
    public Object getsaleprice;

    public Car(int speed, String color, double regularprice){
        this.speed = speed;
        this.regularprice = regularprice;
        this.color = color;
    }
public Car(int speed2, double regularprice2, String color2) {
    }
public double getsaleprice(){
    return regularprice;
}

}
