
import java.util.ArrayList;

public class Logic {

	public String calculate(int[] arrayX) {

		int goldiWeight = arrayX[0];

		int goldiTemp = arrayX[1];

		int chairNumber;

		String tempString = "";

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 2; i < arrayX.length; i += 2) {

			int chairCap = arrayX[i];

			int currentTemp = arrayX[i + 1];

			if ((chairCap > goldiWeight)) {

				// she can sit down

				if (!(currentTemp > goldiTemp)) {

					// she can eat it

					chairNumber = i / 2;

					arrayList.add(chairNumber);

					tempString += chairNumber;

					System.out.println(chairNumber);

				}

			}

		}
		return tempString;

	}

	public String calculate2(String[] arrayX) {

		int goldiWeight = Integer.parseInt(arrayX[0]);

		int goldiTemp = Integer.parseInt(arrayX[1]);

		int chairNumber;

		String tempString = "";

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 2; i < arrayX.length; i += 2) {

			int chairCap = Integer.parseInt(arrayX[i]);

			int currentTemp = Integer.parseInt(arrayX[i + 1]);
			if ((chairCap > goldiWeight)) {

				// she can sit down

				if (!(currentTemp > goldiTemp)) {

					// she can eat it

					chairNumber = i / 2;

					arrayList.add(chairNumber);

					tempString += chairNumber;

					System.out.println(chairNumber);

				}

			}

		}
		return tempString;

	}

}
