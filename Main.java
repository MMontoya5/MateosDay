import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    boolean morning = false; //is it morning  
    boolean monday = false;  //is it monday
    boolean hot = false;     //is it hot
    if(!morning && !monday || hot) // will determine if Mateo will wake up or not
    {
      System.out.print("I need to "); 
    }
    else
    {
      System.out.print("To early to "); 
    }
      System.out.println("wake up and workout.");
      System.out.println("I need to do 10 pushups."); 
  
  for (int count = 1; count <= 10;count++) //For loop to show how many push ups he does
    {
      System.out.println(count + " pushups "); 
    }
    {
      System.out.println("Am done, now to do 10 situps.");
    }
    int count = 1; 
    while (count <= 10) //While loop to show how many sit ups he has done 
    {
      System.out.println(count + " situps");
      count++;
    }
    {
      System.out.println("Am done.");
    }
    {
      System.out.println("Now to check instagram.");
    }
    {
      Scanner scan = new Scanner(System.in); //Added scanner so Mateo can login into instagram
      System.out.println("Type your username");
      String username = scan.next();
      System.out.println("Password");
      String password = scan.next();
      System.out.println("Welcome back, " + username); 
      System.out.println("Your password is, " + password);
    }
    {
      System.out.println("Today was a productive day. Can't wait for tommorow :) :)"); 
    }
  } 
}