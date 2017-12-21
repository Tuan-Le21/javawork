
public class Main {

	static String[][] twoDim = new String[8][8];

	public static void main(String[] args) {
		Map m = new Map();
		m.drawMap(twoDim);
		Ships.createShip(twoDim, 4);
		event.userFire(twoDim, 15, 0);
		Ships.createShip(twoDim, 3);
		
		int torps = 99;
		int hits = 0;

		while (torps > 0 && hits < 7) {
			m.showMap(twoDim);
			hits = event.userFire(twoDim, hits, torps);
			torps--;
		}
		finall.Final(hits, torps);
	}

}
