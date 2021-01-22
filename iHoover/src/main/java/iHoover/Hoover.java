package iHoover;

public class Hoover {
	private int x;
	private int y;
	private Orientation orientation;
	private Grid grid;
	
	public Hoover() {
		x = 0;
		y = 0;
		orientation = Orientation.N;
		grid = null;
	}
	
	public Hoover(int x, int y, Orientation o, Grid grid) {
		this.x = x;
		this.y = y;
		this.orientation = o;
		this.grid = grid;
	}
	
	public boolean moove() {
		switch (this.orientation) {
			case N :
				if (this.y == grid.getSizeY() - 1)
					return false;
				this.y += 1;
				break;
			case E :
				if (this.x == grid.getSizeX() - 1)
					return false;
				this.x += 1;
				break;
			case S :
				if (this.y == 0)
					return false;
				this.y -= 1;
				break;
			case W :
				if (this.x == 0)
					return false;
				this.x -= 1;
				break;
		}
		return true;
	}
	
	public void changeOrientation(char orientation) {
		if (orientation == 'D') {
			switch (this.orientation) {
			case N :
				this.orientation = Orientation.E;
				break;
			case E :
				this.orientation = Orientation.S;
				break;
			case S :
				this.orientation = Orientation.W;
				break;
			case W :
				this.orientation = Orientation.N;
				break;
			default:
				break;
			}
		} 
		else {
			switch (this.orientation) {
				case N :
					this.orientation = Orientation.W;
					break;
				case E :
					this.orientation = Orientation.N;
					break;
				case S :
					this.orientation = Orientation.E;
					break;
				case W :
					this.orientation = Orientation.S;
					break;
				default:
					break;
			}
		}
	}
	
	public boolean input(char input) {
		if (input == 'A')
			return this.moove();
		if (input == 'D' || input == 'G')
			this.changeOrientation(input);
		return true;
	}
	
	public boolean sequence(String c) {
		for (int i = 0; i < c.length(); i++) {
			if (input(c.charAt(i)) == false)
				return false;
		}
		return true;
	}
	
	public String getPosition() {
		String ret = "x=" + this.getX() + 
				" y=" + this.getY() +
				" orientation=";
		switch (this.orientation) {
		case N :
			ret += "N";
			break;
		case E :
			ret += "E";
			break;
		case S :
			ret += "S";
			break;
		case W :
			ret += "W";
			break;
		default :
			ret += "Error";
		}
		return ret;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
}
