//Matt Lynn
package co.gc;

import java.util.Scanner;

public class JavaClassInfo {

	public static void main(String[] args) {
		String input;
		int numInput = -1;
		Boolean check = false, keepGoing = true;
		String checkString;
		Scanner scan = new Scanner(System.in);
		String[] pokemon = { "Sean", "Bulbasaur", "Ivysaur", "Venasaur", "Charmander", "Charmeleon", "Charizard",
				"Squirtle", "Wartortle", "Blastoise" };
		String[] type = { "", "Grass-Poison-type, weak to flying, fire, psychic, and ice",
				"Grass-Poison-type, weak to flying, fire, psychic, and ice",
				"Grass-Poison-type, weak to flying, fire, psychic, and ice",
				"Fire-type, weak to ground, rock, and water", "Fire-type, weak to ground, rock, and water",
				"Fire-Flying-type, weak to electric, rock, and water", "Water-type, weak to grass and electric.",
				"Water-type, weak to grass and electric.", "Water-type, weak to grass and electric." };
		String[] entry = { "",
				"A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokémon",
				"When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.",
				"The plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.",
				"Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.",
				"When it swings its burning tail, it elevates the temperature to unbearably high levels.",
				"Spits fire that is hot enough to melt boulders. Known to cause forest fires unintentionally.",
				"After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.",
				"Often hides in water to stalk unwary prey. For swimming fast, it moves its ears to maintain balance.",
				"A brutal Pokémon with pressurized water jets on its shell. They are used for high speed tackles." };

		do {
			System.out.print("Which pokemon would you like to learn more about? (enter an integer 0-9): ");
			do {
				input = scan.nextLine();

				if (input.equalsIgnoreCase("0")) {
					numInput = Integer.parseInt(input);
					System.out.println(" Pokedex entry 0: Sean");
					System.out.println("Wait what... Sean isn't a pokemon... Sean did YOU do this?");
					System.out.println("Please just exit by typing exit");
					break;

				}
				try {
					numInput = Integer.parseInt(input);
					System.out.println(" Pokedex entry " + numInput + ": " + pokemon[numInput]);
					System.out.print("What would you like to know about " + pokemon[numInput]
							+ "? (enter \"type\" or \"entry\"): ");
					check = true;
				}

				catch (NumberFormatException e) {
					System.out.println(
							"Nah Nah Nah, outta here with that not entering another number $*%&. OH I BET YOU THINK YOU'RE SO CLEVER.");
					System.out.print("I said pick a INTEGER from 0 - 9. GOT IT. Good, what is it? :");
					continue;
				}

				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("YO. REALLY.");
					System.out.println("...");
					System.out.println("What part of 0 - 9 was hard for you?!?");
					System.out.println(
							"I'M USING A STRING ARRAY, if you say something besides the outide of the array, IT BREAKS.");
					System.out.print("Try again: ");
					continue;
				}
				catch (IllegalArgumentException e)	{
					System.out.println("To be honest, I'm not even sure how you got here.");
					System.out.println("Just uhh, just put in the right stuff.");
					continue;
				
				}
				
				catch (Exception e)
				{
					System.out.println("Wow you really broke this huh. Wellllll just try one more time.");
					continue;
				}
			} while (!check);
			do {
				input = scan.nextLine();

				if (input.equalsIgnoreCase("entry") && numInput == 0) {
					System.out.println(
							"Did I say you could input entry? I told you Sean isn't a pokemon, \nyou can't just type something and expect me to bend over backwards for you.");
					continue;
				} else if (input.equalsIgnoreCase("type") && numInput == 0) {
					System.out.println("Sean is a nor --WAIT. I SAID HE WASN'T A PO --STOP IT! GET OUT OF HERE");
					continue;
				} else if (input.equalsIgnoreCase("type")) {
					System.out.println("\nEntry number " + numInput + ". " + pokemon[numInput] + "\n" + type[numInput]);
					check = true;
				}

				else if (input.equalsIgnoreCase("entry")) {
					System.out
							.println("\nEntry number " + numInput + ". " + pokemon[numInput] + "\n" + entry[numInput]);
					check = true;

				}

				else if (input.equalsIgnoreCase("exit")) {
					System.out.println("Good Riddance");
					System.exit(0);
				} else {
					check = false;
					System.out.println("Get Out.");
					scan.nextLine();
					System.out.println("I said get out");
					scan.nextLine();
					System.out.println("...");
					scan.nextLine();
					scan.nextLine();
					scan.nextLine();
					scan.nextLine();
					System.out.println("I won't continue until you say pretty please.");
					do {
						checkString = scan.nextLine();
					} while (!checkString.equals("pretty please"));
					System.out.print("Fine! Enter \"type\" or \"entry\" or \"exit\": ");
				}
			} while (!check);

			System.out.print("Would you like to know more? (enter \"yes\" or \"no\"): ");
			checkString = scan.nextLine();
			if (checkString.equalsIgnoreCase("no") || checkString.equalsIgnoreCase("n")) {
				keepGoing = false;
			}

		} while (keepGoing);
		scan.close();
		System.out.println("goodbye!");

	}

}
