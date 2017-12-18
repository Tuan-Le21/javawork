import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

	Player player = new Player( 2, 2);
	Map map = new Map();
	boolean closeGame = false;
	
	map.refreshMap(player);
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);

while (closeGame ==false) {
	System.out.println("Enter Direction");
	String strInput = scan.nextLine();
	if (strInput.equals("QUIT")) {
		closeGame=true;
		
	} else {
		player.event(strInput);
		map.refreshMap(player);
		
		
	}
}
//	public static void playerMovement() {
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter direction");
//		event(scan.nextLine());

	}

	

}

