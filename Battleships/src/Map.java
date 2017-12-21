
public class Map {

	public void drawMap(String[][] twoDim) {
		// TODO Auto-generated method stub
		for (int i = 0; i < twoDim.length; i++) {
			for (int j = 0; j < twoDim.length; j++) {

				System.out.print(twoDim[i][j] = "0");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	

	public void showMap(String[][] twoDim) {
		for (int i = 0; i < twoDim.length; i++) {
			for (int j = 0; j < twoDim.length; j++) {
				if (twoDim[i][j].equals("~"))
				{
					System.out.print(" "+"0");
				}
				else
				{
					System.out.print(" " + twoDim[i][j]);
					System.out.print("");
				}
				
			}
			System.out.println(" ");
		}
	}
}

	




	
	



