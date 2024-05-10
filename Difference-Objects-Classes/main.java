/**
  This program demonstrates interactions between two classes and three objects.
*/

/**
  Declaration of class 'Dog'
  @param name the name of the dog
  @param breed the breed of the dog
  @param gender the gender (he/she) of the dog
  @param age the age of the dog
*/
class Dog {
    // instance variables of class 'Dog'
    private String name;
    private String breed;
    private String gender;
    private int age;

    // parameter variables of class 'Dog'
    public Dog(String n, String b, String g, int a) {
        name = n;
        breed = b;
        gender = g;
        age = a;
    }

    // providing toString() for the later System.out.println() calls
    public String toString() {
        return name + " is a " + breed +". " + gender + " is " + age + " years old."; 
    }
}

/**
  Declaration of class 'Stray'
  @param nickname the temporary name of the stray dog
  @param gender the gender (he/she) of the stray dog
  @param approximateAge the approximate age of the stray dog
  @param weight the weight of the stray dog
*/
class Stray {
    // instance variables of class 'Stray'
    private String nickname;
    private String gender;
    private int approximateAge;
    private double weight;

    // parameter variables of class 'Stray'
    public Stray(String n, String g, int a, double w) {
        nickname = n;
        gender = g;
        approximateAge = a;
        weight = w;
    }

    // providing toString() for the later System.out.println() calls
    public String toString() {
        return nickname + " is one of our rescues. " + gender + " is around " + approximateAge + " years old and weighs " + weight + " pounds.";
    }
}

public class main {

    public static void main(String[] args) {
        
        // introducing Dog object 'spots' with accurate variables
        Dog spots = new Dog("Spots", "Dalmation", "He", 3);

        //introducing Stray objects with accurate variables
        Stray rufus = new Stray("Rufus", "He", 7, 22.7);
        Stray patty = new Stray("Patty", "She", 11, 41.3);

        // example uses of relative toString() instructions in the objects
        System.out.println(spots);
        System.out.println(rufus);
        System.out.println(patty);
    }
}