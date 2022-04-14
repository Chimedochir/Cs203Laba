package Biedaalt3;



import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

public class MyHolidayLights extends RunningHolidayLights{

	public MyHolidayLights(int length) {
		super(length);
	}
	
	@Override
	public List<Light> next() {
		lights = new ArrayList<Light>();
		Color c = Color.black;
		for(int i=0;i<this.size;i++) {
			Light light = new ColoredLight(c);
			light.setOn(false);
			lights.add(light);
		}
		lights.get(count++).setOn(true);
		lights.get(count).randomChange();
		if(count >= this.size)
			count = 0;
		nextLvl2();
		return lights;
	}
	
	public List<Light> nextLvl2() {
		lights = new ArrayList<Light>();
		Color c = Color.black;
		for(int i=0;i<this.size;i++) {
			Light light = new ColoredLight(c);
			light.randomChange();
			lights.add(light);
		}
		return lights;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHolidayLights hl = new MyHolidayLights(32);
		
		// Create and show HolidayLightsWindow
		MyHolidayLightsWindow frame = new MyHolidayLightsWindow(hl);
		frame.pack();
		frame.setVisible(true);
	}

}
