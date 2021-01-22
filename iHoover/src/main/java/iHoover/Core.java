package iHoover;

public class Core {

	  public static void main(String[] args) {
		  Hoover ihoover;
		  Grid grid;
		  Parser parser  = new Parser();;
		  if (parser.CheckArgumentsNumber(args) == false)
			  return ;
		  else {
			  if (parser.ParseSentence(args[5]) == false)
				  return ;
			  if (parser.ParseArgs(args) == false)
				  return ;
			  grid = new Grid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			  ihoover = new Hoover(Integer.parseInt(args[2]), Integer.parseInt(args[3]), Orientation.N, grid);
			  ihoover.sequence(args[5]);

			  System.out.println(ihoover.getPosition());
		  }
	  }

}
