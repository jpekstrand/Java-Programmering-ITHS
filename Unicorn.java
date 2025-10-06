<<<<<<< HEAD
public class Unicorn{
    public int age;
    String color, mood;
    boolean horn, alive;

    Unicorn(int age, String color, boolean horn, String mood, boolean alive) {
        this.age = age;
        this.color = color;
        this.mood = mood;
        this.horn = horn;
        this.alive = alive;


    

    }

    void setAge(int age){
        this.age=age;
    
 }
 int getAge(){
    return age;
 }

 void runWild() {}

=======
public class Unicorn {
    private int age;
    String colour, mood;
    boolean horn, alive;

    Unicorn(int age, String colour, String mood, boolean alive, boolean horn) {
        this.age = age;
        this.colour = colour;
        this.mood = mood;
        this.horn = horn;
        this.alive = alive;
    }

    void setAge(int age) {
        this.age = age;
    }
    
    int getAge(){
        return age;
    }

    void runWild() {}
>>>>>>> e4ae8c770eff8545e69527e453e5c8400cdf2c0c
}