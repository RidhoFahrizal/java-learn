public class Main {

    /* 
     * 1. java hello.world
     * 2. java variable 
     * 3. java method sederhana
     * 4. 
    */
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
    }
}

class myFirstMethod{
            
        static void myMethod(){
            System.out.println("Hallo Ridho Fahrizal");
        }
    }