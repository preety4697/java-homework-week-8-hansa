package programme_24_method_overriding;

public class Test2 {
    //Test class to create objects and call the methods
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest : " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Inteest : " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest : " + a.getRateOfInterest());
    }
}
