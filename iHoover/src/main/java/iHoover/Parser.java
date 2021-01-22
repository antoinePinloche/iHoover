package iHoover;

public class Parser {
	
	public Parser() {}
	
	public boolean CheckArgumentsNumber(String[] args) {
		  if (args.length != 6 || args.length == 1) {
			  if (args.length == 1 && (args[0].compareTo("-h") == 0))
				  System.out.println("Help :\nUse arguments : GridX GridY HooverX HooverY HooverOrientation Sequence\n"
				  		  + "HooverOrientation posibility N, E, S, W\n"
						  + "Sequence posibility D, G, A\n"
						  + "(Example : 10 10 5 5 N DAGA)\n");
			  else
				  System.out.println("Error arguments problems -h can help you");
			  return false;
		  }
		  return true;
	}
	
	public boolean ParseSentence (String sentence) {
		if (sentence.matches("[AGD]*") == false) {
			System.out.println("Error : Hoover's direction incorrect you can only use A, D, G characters");
			return false;
		}
		return true;
	}
	
	public boolean ParseArgs(String[] args) {
		if (args[0].matches("[0123456789]*") != true || args[1].matches("[0123456789]*") != true
				|| args[2].matches("[0123456789]*") != true || args[3].matches("[0123456789]*") != true) {
			System.out.println("Error : Position argument can only be a number");
			return false;
		}
		if (Integer.parseInt(args[0]) <= 0 || Integer.parseInt(args[2]) > Integer.parseInt(args[0]) ||
				Integer.parseInt(args[1]) <= 0 || Integer.parseInt(args[3]) > Integer.parseInt(args[1])) {
			System.out.println("Error: Grid or Hoover position are incorrect");
			return false;
		}
		if (args[4].matches("[NESW]") != true) {
			System.out.println("Error : Hoover's direction incorrect you can only use N, E, S, W characters");
			return false;
		}
		return true;
	}
}
