public class MyOwnAutoShop {
   
    public static void main(String[] args){
        Sedan sed = new Sedan(230,2500,"red",4);
        Ford for1 = new Ford(23,30000,"blue",2002,2000);
        Ford for2 = new Ford(54,67000,"white",1997,300);
        Car cr = new Car(500,4563.7,"lightblue");

        System.out.println( sed.getsaleprice());
        System.out.println(for1.getsaleprice());
        System.out.println( for2.getsaleprice());
        System.out.println( cr.getsaleprice());




    }

    
}
