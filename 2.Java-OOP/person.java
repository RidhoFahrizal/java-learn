class Person {
    // Field atau atribut
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method atau fungsi
    
    //Constructor Overloading 
    //Harus Membuat parameter nya berbeda , nama constructornya sama tidak masalah
    public Person(String name) {
        this.name = name;
    }
    
    public Person() {
    }
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
    
}