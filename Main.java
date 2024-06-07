


public class Main {
    
    /* 
    * 1. java hello.world
    * 2. java variable 
    * 3.0 java method sederhana
    * 3.1 Java method parameter
    * 3.2 Java method overloading 
    * 3.3 Java scope
    * 3.4 Java Rekursive Method
    * 
    */
    
    static int plusMethod(int x, int y){
            return x+y;
        }
    
    static double plusMethod(double x, double y){
            return x+y;
        }

            
    public static void main(String[] args) {
        
        //1.java hello world 
        System.out.println("hello world");
        
        //2.variable in java 
        String nama = "Sonny Kurniadi";
        int umur = 10;
        float tabungan = 5/4;
        double tinggi = 171.4;
        System.out.println( nama +" saat ini berumur " + umur);
        System.out.println(nama + " saat ini memiliki tabungan sebesar "+ tabungan);
        System.out.println("tinggi "+nama+" adalah " + tinggi);

        if (tinggi < 180){
            System.out.println("haahahaha "+ nama + " pendek");
        }else{
            System.out.println("uwoooogh sonny tinggi kevek 500 rizz");
        }

        //3.method in java 
        myFirstMethod.myMethod();      

        //3.1 method parameter
        NamaLengkap.inputNamaLengkap("Ridho");        

        //3.2 method overloading
        int mynum1 = plusMethod(4, 5);
        double mynum2 = plusMethod(7.2, 5.4);
        System.out.println("INT:" + mynum1);
        System.out.println("DOUBLE:" + mynum2);

        //3.3
        JavaScope.Scope();
        
        //3.4
        System.out.println("Ini adalah rekursive hitung mundur:" );
         countdown(3);
    }

    public static void countdown(int num) {
    if (num >= 0) {
        System.out.println(num);
        countdown(num - 1);
    }
}

}

class myFirstMethod{
            
        static void myMethod(){
            System.out.println("Hallo Ridho Fahrizal");
        }
    } 

class NamaLengkap{
        static void inputNamaLengkap(String fname){
               System.out.println("Hallo "+ fname+"pada baris ini kamu telah melakukan method parameter");
        }
    }
    
    //3.3 Java scope
class JavaScope{
    static void Scope(){
        // variable a tidak dapat di akses (tidak dikenal diatas sini)    
        int a=3;
            System.out.println("a");
    }
}

