public class Ford extends Car{
    private int year;
    private int manufacturerdiscount;

    public Ford(int speed, double regularprice, String color,int year, 
    int manufacturerdiscount){
        super(speed,regularprice,color);
        this.year = year;
        this.manufacturerdiscount = manufacturerdiscount;
    }
    public double getsaleprice(){
             return super.getsaleprice()-(manufacturerdiscount);
    }
    
}
