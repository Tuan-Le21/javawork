
public class Map {
	
	
	int[][] twoDim = new int[5][5];

	public void drawMap() {
		// TODO Auto-generated method stub
		for (int i = 0; i < twoDim.length; i++) {
			for (int j = 0; j < twoDim.length; j++) {

				twoDim[i][j] = 0;
			}
		}
		}
		public void showMap(Ships ship) {
			for (int i =0; i < twoDim.length; i ++) {
				for (int j = 0; j < twoDim.length; j++) {
					System.out.print(" " + twoDim[i][j]);
				}
				if (ship.getSize()< twoDim.length) {
					twoDim[1][1] =ship.size =1; 
					twoDim[1][2]=ship.size=1;
				}
				System.out.println(" ");
				
			}
		}
	}

