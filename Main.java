class Main 
{
  public static void main(String[] args) 
  {
    boolean morning = false;
    boolean monday = false;
    boolean hot = false; 
    if(!morning && !monday || hot)
    {
      System.out.print("I need to "); 
    }
    else
    {
      System.out.print("To early to "); 
    }
      System.out.println("wake up and workout.");
      System.out.println("I need to do 10 pushups."); 
  
  for (int count = 1; count <= 10;count++)
    {
     System.out.println(count + " pushups "); 
    }
    {
     System.out.println("Am done, now to do 10 situps.");
    }
    int count = 1; 
    while (count <= 10)
    {
     System.out.println(count + " situps");
     count++;
    }
    {
     System.out.println("Am done.");
    }
  }  
}