public class Sedan extends Car{
    private int length;
    public Sedan(int speed, double regularprice, String color,int length){
        super(speed,regularprice,color);
        this.length = length;
    }
    public double getsaleprice(){
        if (length > 20){
            return super.getsaleprice() - (0.05 * super.getsaleprice());
        }
        else{
            return super.getsaleprice() - (0.1 * super.getsaleprice());
        }
    }
    
    
}
