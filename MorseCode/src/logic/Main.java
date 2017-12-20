package logic;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	

	private HashMap<Character, String> alphaToCode = new HashMap<>();
	private HashMap<String, Character> codeToAlpha = new HashMap<>();
	
	public Main() {
		setup();
	}

	public static void main(String[] args) {
		Main convert = new Main();
		Scanner scan = new Scanner(System.in);
		
		String mode;
		
		do {
		
			System.out.print("Which translator ('Alpha' or 'Morse')? ");
			mode = scan.nextLine(); 
			
			if (mode.equalsIgnoreCase("Alpha")) {
				System.out.print("Enter a word: ");
				String userInput = scan.nextLine();
				System.out.println(convert.alphaToMorse(userInput.toLowerCase()));
				
			}
			else if (mode.equalsIgnoreCase("Morse")) {
				System.out.print("Enter a word: ");
				String userInput = scan.nextLine();
				System.out.println(convert.morseToAlpha(userInput.toLowerCase()));
			}
			else if (!mode.equalsIgnoreCase("quit"))
				System.out.println("Please enter valid translator");
	
		} while(!mode.equalsIgnoreCase("quit"));
		
		System.out.println("Bye!");
		
		scan.close();
	}
	
	public void setup() {

		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };

		String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
				".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "/" };
		

		//Matches alphabet to morseCode
		for (int i = 0; i < alphabet.length; i++) {
			alphaToCode.put(alphabet[i], morseCode[i]);
			codeToAlpha.put(morseCode[i], alphabet[i]);
		}
	}

	public String alphaToMorse(String userInput) {

		String temp = "";
		//grabs the character in alphabet and translates it to the matching position in morseCode
		for (int j = 0; j < userInput.length(); j++) {
			char c = userInput.charAt(j);
			if (alphaToCode.containsKey(c))
				temp += alphaToCode.get(c) + " ";
			else
				temp += "?" + c + "? ";

		}

		return temp.trim();
		
	}
	public String morseToAlpha(String userInput) {
		
		String temp = "";
	
		String[] parts = userInput.split(" "); 
		
		for (int j = 0; j < parts.length; j++) {
			if (codeToAlpha.containsKey(parts[j])) {
				temp += codeToAlpha.get(parts[j]); 
			}
			else {
				temp += "?" + parts[j] + "?";
			}
		}
			
		return temp;
	}

}
