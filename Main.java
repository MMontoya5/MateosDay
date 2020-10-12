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
    System.out.println("wake up" );
  }
}