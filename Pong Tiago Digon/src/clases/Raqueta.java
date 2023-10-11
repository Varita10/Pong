package clases;

import java.awt.geom.Rectangle2D;

public class Raqueta {
	private int x,y;
    static final int ancho = 10, alto = 25;
	
	public Raqueta(int x, int y) {
		this.y=y;
		this.x=x;
	}
	
	public Rectangle2D getRaqueta() {
		return new Rectangle2D.Double(x, y, ancho, alto);
	}
}
