
public class Map {

	
	int[][] twoDim = new int[5][5];
	
	public void drawMap() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(twoDim[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
	}
	}
	public void refreshMap(Player player) {
	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				twoDim[i][j] =0;
			}
			twoDim[player.getX()][player.getY()] = 1;
			drawMap();
	}
	
	}
}
