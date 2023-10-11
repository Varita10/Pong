package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;


public class TableroJuego extends JPanel{
	Pelota pelota = new Pelota(0,0);
	Raqueta raqueta1 = new Raqueta(10, 200);
	Raqueta raqueta2 = new Raqueta(884-10-Raqueta.ancho, 200);
	public TableroJuego() {
		
		setBackground(Color.BLACK);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.WHITE);
		dibujar(g2);
		actualizar();
	}
	
	public void dibujar(Graphics2D g) {
		g.fill(pelota.getPelota());
		g.fill(raqueta1.getRaqueta());
		g.fill(raqueta2.getRaqueta());
		System.out.println("x: " + getBounds().getMaxX());
		System.out.println("y: " + getBounds().getMaxY());
	}
	
	public void actualizar() {
		pelota.mover(getBounds()); 
	}
	
	public void iterarjuego() {
		while(true) {
			repaint();
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
