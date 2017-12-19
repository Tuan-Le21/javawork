public class Main {

	public static void main(String[] args) {

		int[] array = new int[24];

		array[0] = 100;
		array[1] = 120;
		array[2] = 297;
		array[3] = 90;
		array[4] = 66;
		array[5] = 110;
		array[6] = 257;
		array[7] = 113;
		array[8] = 276;
		array[9] = 191;
		array[10] = 280;
		array[11] = 129;
		array[12] = 219;
		array[13] = 163;
		array[14] = 254;
		array[15] = 193;
		array[16] = 86;
		array[17] = 153;
		array[18] = 206;
		array[19] = 147;
		array[20] = 71;
		array[21] = 137;
		array[22] = 104;
		array[23] = 40;

		String[] arrayS = new String[24];

		arrayS[0] = "100";
		arrayS[1] = "120";
		arrayS[2] = "297";
		arrayS[3] = "90";
		arrayS[4] = "66";
		arrayS[5] = "110";
		arrayS[6] = "257";
		arrayS[7] = "113";
		arrayS[8] = "276";
		arrayS[9] = "191";
		arrayS[10] = "280";
		arrayS[11] = "129";
		arrayS[12] = "219";
		arrayS[13] = "163";
		arrayS[14] = "254";
		arrayS[15] = "193";
		arrayS[16] = "86";
		arrayS[17] = "153";
		arrayS[18] = "206";
		arrayS[19] = "147";
		arrayS[20] = "71";
		arrayS[21] = "137";
		arrayS[22] = "104";
		arrayS[23] = "40";

		// for (int i = 2; i < 63; i += 2) {

		// array[i] = Integer.parseInt(String.valueOf((Math.random() * 100)));
		// array[i + 1] = Integer.parseInt(String.valueOf((Math.random() * 100)));

		// }

		Logic log = new Logic();

		log.calculate(array);

		log.calculate2(arrayS);

		// TODO Auto-generated method stub

	}

}
