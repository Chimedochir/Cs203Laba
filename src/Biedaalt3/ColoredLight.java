package Biedaalt3;



import java.awt.Color;

public class ColoredLight extends Light{
	
	private Color color;
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	public ColoredLight(Color color) {
		super(true);
		this.color= color;
		//throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		return this.color;
		//throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		this.color = c;
		//throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		Color Color_Blue = Color.blue;
		Color Color_Green = Color.green;
		Color Color_Pink = Color.pink;
		Color Color_Yellow = Color.yellow;
		Color Color_Orange = Color.orange;
		Color Color_Cyan = Color.cyan;
		Color Color_Red = Color.red;
		
		if(Math.random()*10 < 2) {
			this.setColor(Color_Blue);
		}else if(Math.random()*10 < 3 && Math.random()*10 >=2) {
			this.setColor(Color_Green);
		}else if(Math.random()*10 < 4 && Math.random()*10 >=3) {
			this.setColor(Color_Orange);
		}else if(Math.random()*10 < 5 && Math.random()*10 >=4) {
			this.setColor(Color_Cyan);
		}else if(Math.random()*10 < 6 && Math.random()*10 >=5) {
			this.setColor(Color_Pink);
		}else if(Math.random()*10 < 7 && Math.random()*10 >=6) {
			this.setColor(Color_Yellow);
		}else 
			this.setColor(Color_Red);
	}
	
}
