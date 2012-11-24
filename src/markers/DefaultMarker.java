/**
 * 
 */
package markers;

import Util.Colors;
import Util.Pos;
import Util.Utilities;
import processing.core.PApplet;
import markers.AbstractMarker;

/**
 * @author joysword
 *
 */
public class DefaultMarker extends AbstractMarker {

	public DefaultMarker(PApplet p, float x, float y, int pid, int hour, int min, String text, String keywords, int loc) {
		super(p, x, y, pid, hour, min, text, keywords, loc);
	}
	
	@Override
	public void draw() {
		p.pushStyle();
		p.noStroke();
		p.fill(Colors.LIGHT_BLUE);
		p.ellipse(x+Pos.mapX, y+Pos.mapY, Utilities.Converter(2), Utilities.Converter(2));
		p.popStyle();
	}
}