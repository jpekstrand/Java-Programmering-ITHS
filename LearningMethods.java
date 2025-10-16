import java.util.Scanner;


public class LearningMethods {
    public static void main(String[] args) {
       
        new LearningMethods().welcomeMessage();
        new LearningMethods().getName();
        new LearningMethods().getAge();
        new LearningMethods().getYear();
        
    }
        
    
public void welcomeMessage(){
System.out.println("Hello! I want to show you how to use methods! ");
}
 public static String name;
     public static   int age;
    public static  boolean indoorPerson = false;
       public static boolean outdoorPerson = false;
       public static Scanner sc = new Scanner (System.in);
public void getName(){
System.out.println("First off, what is your name?");
String name = sc.nextLine();
System.out.println("Nice to meet you " + name + "!");
}
public void getAge(){
    System.out.println("What is your age?");
    age = sc.nextInt();
}
public void getYear(){
    System.out.println("That means you where born in " + (2025 - age) + "!");
}


        /*System.out.println("Hello! I want to show you how to use methods!");
        System.out.println("First off, what is your name?");
        Scanner sc = new Scanner (System.in);
        name = sc.nextLine();
        System.out.println("Nice to meet you " + name + "!");
        System.out.println("What is your age?");
        age = sc.nextInt();
        System.out.println("That means you where born in " + (2025 - age) + "!");
        System.out.println("Are you an indoor or outdoor person?");
        sc.nextLine();
        String answer = sc.nextLine();
        if(answer.matches("indoor")|| answer.matches("Indoor")) {
            indoorPerson = true;
        }
        else if(answer.matches("outdoor") || answer.matches("Outdoor")){
            outdoorPerson = true;
        }
        else{
            System.out.println("That was an unexpected answer! O.o");
        }
        if(indoorPerson == true){
            System.out.println("Awesome! What is it that you do indoors?");
        }else if (outdoorPerson == true) {
            System.out.println("Wow cool! Thats unusual nowadays. What is it you like about the great outdoors?");
        }else{
            System.out.println("Lets start over!");
        }

        sc.close();
     */
}
