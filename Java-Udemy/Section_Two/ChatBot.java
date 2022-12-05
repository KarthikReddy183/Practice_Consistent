
import java.util.Scanner;

public class ChatBot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Hello! Your good name please: ");
    String name = sc.nextLine();

    System.out.println("\nHi " + name + " Where are you from: ");
    String place = sc.nextLine();
    
    System.out.println("\n" + place + "!!" + " That's a great place to live!!");
    System.out.println("How old are you: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.println("\nSo you are " + age + " cool! I am 400 years old!!" );
    sc.nextLine();
    System.out.println("I mean, I am " + 400/age);
    System.out.println("what is your favourite programming language: ");
    String language = sc.nextLine();

    System.out.println("\n" + language + " Great!! That's great chatting with you " + name + "." + " I have to take rest now. Bye!!");

    sc.close();
 


  }
}
