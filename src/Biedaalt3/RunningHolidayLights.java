package Biedaalt3;


import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {
	
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	public ArrayList<Light> lights;
	public int size;
	public int count = 0;
	
	public RunningHolidayLights(int length) {
		this.size = length;
		//throw new RuntimeException("RunningHolidayLights(length) not yet implemented!");
	}
	
	public List<Light> next() {
		lights = new ArrayList<Light>();
		for(int i=0; i<this.size; i++) {
			Light light = new Light();
			lights.add(light);
		}
		lights.get(count++).setOn(true);
		if(count >= this.size)
			count = 0;
		return lights;
		//throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		return size;
		//throw new RuntimeException("RunningHolidayLights.getLength() not yet implemented!");
	}
						
}