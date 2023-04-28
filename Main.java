import java.util.Scanner;
public class Main 
{   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      while(true) {
        System.out.print("Enter quarts needed >> ");
        try{
          quartsNeeded = Integer.parseInt(input.next());
          }
        catch(Exception e){
          System.out.print("You need to input an actual number");
          continue;
        }
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
      }
      
   }
}
