
public class Ships  {



	public static void createShip(String[][] drawMap,int size)
    {
       if(Math.random() < 0.5)
       {
          int col = (int)(Math.random()*5);
          int row = (int)(Math.random()*7);
          for(int i = 0; i<size; i++)
          {
             drawMap[row][col+i] = "~";
          }
       }
       else
       {
          int col = (int)(Math.random()*7);
          int row = (int)(Math.random()*5);
          for(int i = 0; i<size; i++)
          {
             drawMap[row+i][col] = "~";
          }
       }
    }


	
}

