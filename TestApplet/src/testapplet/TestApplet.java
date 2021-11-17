
import java.awt.*;
import java.applet.Applet;

public class TestApplet extends Applet implements Runnable {
	int xR = 0;
	int xOL = 20;
	int xOR = 130;
	int i;

	public void init() {
		setSize(600, 400);
		setBackground(Color.LIGHT_GRAY);
	}

	public void start() {
		Thread th = new Thread(this);
		th.start();
	}

	public void stop() {

	}

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(xR, 110, 200, 140);
		g.fillOval(xOL, 250, 50, 50);
		g.fillOval(xOR, 250, 50, 50);
	}

	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while (true) {
			while (i<= 600) {
				xR = xR + 1;
				xOL = xOL + 1;
				xOR = xOR + 1;
				repaint();
				try {
					Thread.sleep(5);
				} catch (InterruptedException ie) {

				}
				i++;
			}
			while (i>= 0) {
				xR = xR - 1;
				xOL = xOL - 1;
				xOR = xOR - 1;
				repaint();
				try {
					Thread.sleep(5);
				} catch (InterruptedException ie) {

				}
				i--;
			}
		}
	}
}

