package com.alex.apcs.projects.ifs;

import com.alex.apcs.project.mathclass.MathLocation;
import com.alex.apcs.utils.params.UtilParams;

/**
 * 
 * @author Alex Chiang <agentleader1@gmail.com>
 *
 */
public class Distance {

	private MathLocation loc1, loc2;
	private String closest = "";
	private boolean calculated = false;
	
	public Distance(int x1, int y1, int x2, int y2) {
		this.loc1 = MathLocation.forCoords(x1, y1);
		this.loc2 = MathLocation.forCoords(x2, y2);
	}
	
	public Distance(MathLocation loc1, MathLocation loc2) {
		this.loc1 = loc1;
		this.loc2 = loc2;
	}
	
	public Distance(UtilParams params, boolean locs) throws IllegalArgumentException {
		if (locs) {
			try {
				this.loc1 = (MathLocation) params.read(0);
				this.loc2 = (MathLocation) params.read(1);
			} catch (ClassCastException ex) { 
				throw new IllegalArgumentException("Invalid parameters!");
			}
		} else {
			try {
				this.loc1 = MathLocation.forCoords((double) params.read(0), (double) params.read(1));
				this.loc2 = MathLocation.forCoords((double) params.read(2), (double) params.read(3));
			} catch (ClassCastException ex) { 
				throw new IllegalArgumentException("Invalid parameters!");
			}
		}
	}
	
	public String determineClosest() {
		MathLocation origin = MathLocation.forCoords(0.0D, 0.0D);
		double a = loc1.distance(origin);
		double b = loc2.distance(origin);
		this.calculated = true;
		if (a > b) {
			return this.closest = "B is closer to (0,0).";
			//return this.closest = "(" + loc2.getX() + "," + loc2.getY() + ")";
		} else {
			return this.closest = "A is closer to (0,0).";
			//return this.closest = "(" + loc1.getX() + "," + loc1.getY() + ")";
		}
	}
	
	@Override
	public String toString() {
		if (calculated) {
			return this.closest;
		} else {
			return determineClosest();
		}
	}
}
