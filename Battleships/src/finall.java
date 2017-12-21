
public class finall {

	 public static void Final(int hits, int torps)	{
	      if(hits < 4)
	         System.out.println("Sorry, but you lost because you didn't sink the ship.");
	      if(torps < 1)
	         System.out.println("You have lost all your torpedos");
	      else
	         if(hits >= 7)
	         {
	            System.out.println("You have beaten the game battleship, Thanks for playing!");
	         }
	      System.out.println("Good game, well played!");
	   }
}

