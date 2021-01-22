package iHoover;

public class Grid {
	private int sizeX;
	private int sizeY;
	
	
	public Grid() {
		setSizeX(0);
		setSizeY(0);
	}
	public Grid(int x, int y)
	{
		sizeX = x;
		sizeY = y;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
}
