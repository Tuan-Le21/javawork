
public class Player  {

		 int x;
		 int y;
		public Player(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public  int getX() {
			return x;
		}
	
		public  int getY() {
			return y;
		}
	
		public  void event(String playerInput) {
			if (playerInput.equalsIgnoreCase("North")) {
				movePlayerNorth();

				if (playerInput.equalsIgnoreCase("South")) {
					movePlayerSouth();
				}

				if (playerInput.equalsIgnoreCase("East")) {
					movePlayerEast();
				}

				if (playerInput.equalsIgnoreCase("West")) {
					movePlayerWest();
				}
				else {
					System.out.println("Please use viable command");
				}
			}
		}

		private  void movePlayerNorth() {
			if (x >0 == true){
				x += -1;
			} else {
				System.out.println("Cannot go anymore");
			}
				
		}

		private  void movePlayerSouth() {
			if (x < 4 == true){
				x += 1;
			} else {
				System.out.println("Cannot go anymore");
			}
		}

		private  void movePlayerEast() {
			if (y < 4 == true){
				y+= -1;
			} else {
				System.out.println("Cannot go anymore");
			}
		}

		private  void movePlayerWest() {
			if (x < 0 == true){
				y+=1;
			} else {
				System.out.println("Cannot go anymore");
			}
		}

	


}
