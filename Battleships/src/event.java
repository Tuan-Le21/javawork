import java.util.Scanner;

public class event extends Main {

	public static int userFire(String[][] twoDim, int hits, int torps)
	   {
		
	      @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	      int row,col;
	      System.out.println("You have: "+ torps +" torpedos left!");
	      System.out.println("Select a row to fire in: ");
	      row = input.nextInt();
	      while(row > 8 || row < 1) // Error checking for row
	      {
	         System.out.println("Enter a valid row (1 -> 8)");
	         row = input.nextInt();
	      }
	      System.out.println("Select a column to fire in: ");
	      col = input.nextInt();
	      while(col > 8 || col < 1) // Error checking for column
	      {
	         System.out.println("Enter a valid col (1 -> 8)");
	         col = input.nextInt();
	      }
	      if(twoDim[row-1][col-1].equals("~"))
	      {
	         hits ++;
	         System.out.println("~~~~~~~ HIT ~~~~~~~");
	         twoDim[row-1][col-1] = "!";
	      }
	      else
	      {
	         System.out.println("~~~~~~~ MISS ~~~~~~~");
	         twoDim[row-1][col-1] = "M";
	      }
	      return hits;
	   }
}
