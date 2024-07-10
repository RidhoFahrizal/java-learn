public class Mathematics {
    public static void main(String[] args) {
        double angka1 = 89.989;
        double angka2 = 10;
        
        double minimal = Math.min(angka1, angka2);
        
        System.out.println("The minimum value is: " + minimal);
        System.out.println("The square root of angka1 is :"+ Math.sqrt(angka1));
        System.out.println("Power of angka1 with angka2 is:"+ Math.pow(angka2, 3));
        System.out.println("Logarithm of x is:" + Math.log(angka2));

        //return power of 2
        System.out.println("Exponent of angka2 is:" + Math.exp(angka2) );
        //return power of 2 -1
        System.out.println("Expm of angka 2 is:" + Math.expm1(angka2));

        double sisiMiring = Triangle.SisiMiring(3, 4);
        System.out.println("Sisi miring dari segitiga siku-siku adalah:" + sisiMiring);
    }    
}


class Triangle{
    
    static double SisiMiring(double sisiA,double sisiB ){
        
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
}