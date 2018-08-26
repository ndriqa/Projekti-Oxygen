import java.awt.*;
import javax.swing.*;

public class ViewClass extends JPanel {
	private int number = 0;
	private int qelluar = 0;
	private int fiksuar = 0;
	private int njesi = 40;
	private boolean fituar = false;
	
	public void setNumber(int ABC) {
		number = ABC;
	}
	public void setQelluar(int q) {
		qelluar = q;
	}
	public void setFiksuar(int f) {
		fiksuar = f;
	}
	public void setFituar() {
		fituar = true;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.BLACK);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRoundRect(njesi/2, njesi/2, 4*njesi, 4*njesi + njesi/2, njesi/2, njesi/2);
		vizatoFormat(g);
		vizatoTekstin(g);
		if (fituar) { keniFituar(g); }
		repaint();
	}
	
	public void vizatoFormat(Graphics g) {
		g.setColor(Color.PINK);
		g.fillRoundRect(njesi, njesi, 3*njesi, njesi, 10, 10);
		g.fillRoundRect(njesi, 3*njesi, njesi, njesi, 10, 10);
		g.fillRoundRect(3*njesi, 3*njesi, njesi, njesi, 10, 10);
		g.setColor(Color.BLACK);
		g.drawRoundRect(njesi, njesi, 3*njesi, njesi, 10, 10);
		g.drawRoundRect(njesi, 3*njesi, njesi, njesi, 10, 10);
		g.drawRoundRect(3*njesi, 3*njesi, njesi, njesi, 10, 10);
	}
	public void vizatoTekstin(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("" + number, njesi/4 + njesi, 2*njesi - njesi/4);
		g.drawString("" + qelluar, njesi + njesi/3, 4*njesi - njesi/3);
		g.drawString("" + fiksuar, 3*njesi + njesi/3, 4*njesi - njesi/3);
		g.setColor(Color.BLACK);
		g.drawString("Q", njesi + njesi/3, 5*njesi - njesi/3);
		g.drawString("F", 3*njesi + njesi/3, 5*njesi - njesi/3);
	}
	public void keniFituar(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 6*njesi, 7*njesi);
		
		g.setColor(Color.WHITE);
		g.drawString("Urime, keni fituar!", njesi, njesi);
		
		int [ ] xPoints = {njesi - njesi/2, 2*njesi - njesi/2, 3*njesi - njesi/2, 4*njesi - njesi/2, 5*njesi - njesi/2, 5*njesi - njesi/2, njesi - njesi/2};
		int [ ] yPoints = {2*njesi, 3*njesi, 2*njesi, 3*njesi, 2*njesi, 4*njesi, 4*njesi};
		g.fillPolygon(xPoints, yPoints, 7);
	}
}
