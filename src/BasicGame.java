
public class BasicGame {

	public static void main(String[] args) throws InterruptedException {
		String[][] level = new String[10][10];
		String playerMark = " ";
		int row = 2;
		int column = 2;
		Directions direction = Directions.RIGHT;

		// pálya létrehozás
		for (int i = 0; i < level.length; i++) {
			for (int j = 0; j < level[i].length; j++) {
				level[i][j] = "O";
			}

		}

		for (int k = 0; k < 10; k++) {

			switch (direction) {
			case UP:
				row--;
				break;
			case DOWN:
				row++;
				break;
			case LEFT:
				column--;
				break;
			case RIGHT:
				column++;
				break;
			}
			// pálya és játékos kirajzolása
			for (int i = 0; i < level.length; i++) {
				for (int j = 0; j < level[i].length; j++) {
					if (i == row && j == column) {
						System.out.print(level[i][j]);
					} else {
						System.out.print(playerMark);
					}
				}
				System.out.println();
			}
			System.out.println("---------------");
			Thread.sleep(1000L);
		}

	}

}
