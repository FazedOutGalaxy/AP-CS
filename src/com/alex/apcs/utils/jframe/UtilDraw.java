package com.alex.apcs.utils.jframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.alex.apcs.instantiatables.Graphics2DLocation;
import com.alex.apcs.instantiatables.Graphics2DPolygon;
import com.alex.apcs.instantiatables.Graphics2DSize;

public class UtilDraw {
	
	private Graphics graphics;
	
	/* Declare one */
	public static final UtilDraw forGraphics(Graphics graphics) {
		return new UtilDraw(graphics);
	}
	
	/* Constructor */
	private UtilDraw(Graphics graphics) {
		this.graphics = graphics;
	}
	
	/* Draw with last set color. */
	public void drawCircle(Graphics2DLocation location, int radius, boolean fill) {
		drawOval(location, Graphics2DSize.forSize(radius, radius), fill);
	}
	
	public void drawOval(Graphics2DLocation location, Graphics2DSize size, boolean fill) {
		if (fill) {
			graphics.fillOval(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		} else {
			graphics.drawOval(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		}
	}
	
	public void drawString(String str, Graphics2DLocation location) {
		graphics.drawString(str, location.getX(), location.getY());
	}
	
	public void drawString(Font font, String str, Graphics2DLocation location) {
		Font cF = getFont();
		setNextTextFont(font);
		drawString(str, location);
		setNextTextFont(cF);
	}
	
	public void drawArc(Graphics2DLocation loc, Graphics2DSize size, int startAngle, int arcAngle, boolean fill) {
		if (fill) {
			graphics.fillArc(loc.getX(), loc.getY(), size.getWidth(), size.getHeight(), startAngle, arcAngle);
		} else {
			graphics.drawArc(loc.getX(), loc.getY(), size.getWidth(), size.getHeight(), startAngle, arcAngle);
		}
	}
	
	public void drawRect(Graphics2DLocation location, Graphics2DSize size, boolean fill) {
		if (fill) {
			graphics.fillRect(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		} else {
			graphics.drawRect(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		}
	}
	
	public void drawPolygon(Graphics2DPolygon polygon, boolean fill) {
		if (fill) {
			graphics.fillPolygon(polygon.getPolygon());
		} else {
			graphics.drawPolygon(polygon.getPolygon());
		}
	}
	
	public void drawLine(Graphics2DLocation firstLocation, Graphics2DLocation secondLocation) {
		graphics.drawLine(firstLocation.getX(), firstLocation.getY(), secondLocation.getX(), secondLocation.getY());
	}
	
	/* Draw with param color. */
	public void drawCircle(Color color, Graphics2DLocation location, long l, boolean fill) {
		drawOval(color, location, Graphics2DSize.forSize((int) l, (int) l), fill);
	}
	
	public void drawOval(Color color, Graphics2DLocation location, Graphics2DSize size, boolean fill) {
		Color c = graphics.getColor();
		setNextDrawColor(color);
		if (fill) {
			graphics.fillOval(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		} else {
			graphics.drawOval(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		}
		setNextDrawColor(c);
	}
	
	public void drawString(Color color, String str, Graphics2DLocation location) {
		Color c = graphics.getColor();
		setNextDrawColor(color);
		graphics.drawString(str, location.getX(), location.getY());
		setNextDrawColor(c);
	}
	
	public void drawString(Color color, Font font, String str, Graphics2DLocation location) {
		Color c = graphics.getColor();
		setNextDrawColor(color);
		Font cF = getCurrentTextFont();
		setNextTextFont(font);
		graphics.drawString(str, location.getX(), location.getY());
		setNextTextFont(cF);
		setNextDrawColor(c);
	}
	
	public void drawArc(Color color, Graphics2DLocation loc, Graphics2DSize size, int startAngle, int arcAngle, boolean fill) {
		Color c = graphics.getColor();
		setNextDrawColor(color);
		if (fill) {
			graphics.fillArc(loc.getX(), loc.getY(), size.getWidth(), size.getHeight(), startAngle, arcAngle);
		} else {
			graphics.drawArc(loc.getX(), loc.getY(), size.getWidth(), size.getHeight(), startAngle, arcAngle);
		}
		setNextDrawColor(c);
	}
	
	public void drawRect(Color color, Graphics2DLocation location, Graphics2DSize size, boolean fill) {
		Color c = graphics.getColor();
		setNextDrawColor(color);
		if (fill) {
			graphics.fillRect(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		} else {
			graphics.drawRect(location.getX(), location.getY(), size.getWidth(), size.getHeight());
		}
		graphics.setColor(c);
		setNextDrawColor(c);
	}
	
	public void drawPolygon(Color color, Graphics2DPolygon polygon, boolean fill) {
		Color c = graphics.getColor();
		setNextDrawColor(color);
		if (fill) {
			graphics.fillPolygon(polygon.getPolygon());
		} else {
			graphics.drawPolygon(polygon.getPolygon());
		}
		setNextDrawColor(c);
	}
	
	public void drawLine(Color color, Graphics2DLocation firstLocation, Graphics2DLocation secondLocation) {
		Color c = graphics.getColor();
		setNextDrawColor(color);
		graphics.drawLine(firstLocation.getX(), firstLocation.getY(), secondLocation.getX(), secondLocation.getY());
		setNextDrawColor(c);
	}
	
	/* Set next draw color. */
	public Color setNextDrawColor(Color color) {
		Color ret = graphics.getColor();
		graphics.setColor(color);
		return ret;
	}
	
	public void setNextColor(Color color) {
		setNextDrawColor(color);
	}
	
	public void setColor(Color color) {
		setNextDrawColor(color);
	}
	
	/* Set next text font. */
	public Font setNextTextFont(Font font) {
		Font ret = graphics.getFont();
		graphics.setFont(font);
		return ret;
	}
	
	public void setNextFont(Font font) {
		setNextTextFont(font);
	}
	
	public void setFont(Font font) {
		setNextTextFont(font);
	}
	
	/* Return Statements */
	public Graphics getGraphics() { return graphics; }
	
	public Color getCurrentDrawColor() { return graphics.getColor(); }
	public Color getCurrentColor() { return getCurrentDrawColor(); }
	public Color getDrawColor() { return getCurrentColor(); }
	public Color getColor() { return getDrawColor(); }
	
	public Font getCurrentTextFont() { return graphics.getFont(); }
	public Font getCurrentFont() { return getCurrentTextFont(); }
	public Font getTextFont() { return getCurrentTextFont(); }
	public Font getFont() { return getCurrentTextFont(); }
	
	/* Finalize */
	/**
	 * Do not attempt to use any methods after this method has been called.
	 */
	public void discard() throws Exception, Throwable, Error { graphics.dispose(); }


}
