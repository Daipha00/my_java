public class Truck extends Car{
    private int weight;

    public Truck(int speed, String color, double regularprice,int weight){
        super(speed, color, regularprice);
        this.weight = weight;
    }
    public double getsaleprice(){
        if (weight > 2000){
           return  super.getsaleprice() - (0.1 * super.getsaleprice());
        }
        else{
           return super.getsaleprice() - (0.2 * super.getsaleprice());
        }
    }
    
}
