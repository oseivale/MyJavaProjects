import java.util.Scanner; //importing a library that accepts user input (particular library)
import java.util.*; //import all libraries

public class Animal {

  public static final double FAVNUMBER = 1.6180;

  private String name;
  private int weight;
  private boolean hasOwner = false;
  private byte age;
  private long uniqueID;
  private char favoriteChar;
  private double speed;
  private float height;

  protected static int numberOfAnimals = 0;

  static Scanner userInput = new Scanner(System.in);
  //stating that we are creating a new scanner to obtain user input from the key board --> System.in states that we want to get data from the keyboard

  public Animal(){
      numberOfAnimals++;

      int sumOfNumbers = 5 + 1;
      System.out.println("5 + 1 =" + sumOfNumbers);

      int diffOfNumbers = 5 - 1;
      System.out.println("5 - 1 =" + diffOfNumbers);

      int multOfNumbers = 5 * 1;
      System.out.println("5 * 1 =" + multOfNumbers);

      int divOfNumbers = 5 / 1;
      System.out.println("5 / 1 =" + divOfNumbers);

      int modOfNumbers = 5 % 3;
      System.out.println("5 % 3 =" + modOfNumbers);

      System.out.print("Enter the name: \n");
      //returns 'true' if they enter the right data type
      if(userInput.hasNextLine()){
        this.setName(userInput.nextLine())
      }

      this.setFavoriteColor();
      this.setUniqueID();
  }

  public static void main(String[] args){
    Animal theAnimal = new Animal();
  }
  //this is where the code is going to be executed --> whenever we call our code to be run, this line with be run first
  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public long getUniqueID(){
    return uniqueID;
  }

  public void setUniqueID(long uniqueID){
    this.uniqueID = uniqueID;
  }

  public char getFavoriteChar(){
    return favoriteChar;
  }

  public void setFavoriteChar(char favoriteChar){
    this.favoriteChar = favoriteChar;

  }

  public long getAge(){
    return age;
  }


  public void setAge(long age){
    this.age = age;
  }

  public long getUniqueID(){
    return uniqueID;
  }

  public void setUniqueID(long uniqueID){
    this.uniqueID = uniqueID;
  }

}
