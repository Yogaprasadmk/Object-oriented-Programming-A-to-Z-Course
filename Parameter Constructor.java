/ constructor
class Constructors{
    int id;
    int age;
    
    Constructors(int id,int age){
        this.id = id;
        this.age = age;
        System.out.println("Hello");
    }
}


public class Main{

    public static void main (String[] args) {
        
        Constructors A = new Constructors(23,5);
    }
}
