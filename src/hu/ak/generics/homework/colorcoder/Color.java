package hu.ak.generics.homework.colorcoder;

public class Color {

	private int red;
	private int green;
	private int blue;
	
	public Color() {
		red = 0;
		green = 0;
		blue = 0;
	}
	
	public Color(int red, int green, int blue) {

		this.red = red;
		this.green = green;
		this.blue = blue;
		
		if(red < 0) {
			red = 0;
		}
		if(green < 0) {
			green = 0;
		}
		if(blue < 0) {
			blue = 0;
		}
		if(red > 255) {
			red = 255;
		}
		if(green > 255) {
			green = 255;
		}
		if(blue > 255) {
			blue = 255;
		}
		
	}
	
	@Override
	public String toString() {
		return "(" + red + ", " + green + ", " + blue + ")";
	}
	
	public void mix(Color color) {
		
		this.red = (int)((color.red + this.red)/2);
		this.green = (int)((color.green + this.green)/2);
		this.blue = (int)((color.blue + this.blue)/2);
		
		
	}
	
	public int getBrightness() {
		
		int luminance = (this.red * 299 + this.green * 587 + this.blue * 114)/1000 ;
		
		return luminance;
		
	}
	
}
