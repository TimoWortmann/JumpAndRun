package graphics;

import java.awt.image.BufferedImage;
import graphics.Spritesheet;

/**
 * Creator of the Spritesheet.
 * 
 * @author Carina Fenn
 * @since 14.12.2018
 * @version 1.0
 */

	/**
	 * This class can either load an image file or it can load a sprite from a sprite sheet.
	 * 
	 */

public class Sprite {

	public Spritesheet sheet;
	public BufferedImage image;

	public Sprite(Spritesheet sheet, int x, int y, int width, int height) {
		image = sheet.getSprite(x, y, width, height);
	}

	public BufferedImage getBufferedImage() {
		return image;
	}
}
