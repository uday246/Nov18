package Nov10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

//smiley class
class Smiley extends JPanel {
	// declare required variable
	int sad = 0, happy = 180;
	// set the width of window
	public static final int w = 400;
	// set the height of window
	public static final int h = 400;
	// assign face diameter
	public static final int fd = 180;
	// initializes the face of x position
	public static final int xp = 10;
	// initializes the face of y position
	public static final int yp = 10;
	// initializes the width of eye
	public static final int we = 20;
	// initializes the height of eye
	public static final int he = 20;
	// set the Right eye's position on the x and y
	public static final int xre = xp + 40;
	public static final int yre = yp + 60;
	// set the left eye's position on the x and y
	public static final int xle = xp + 120;
	public static final int yle = yp + 60;
	// initialzes the width and height of the mouth
	public static final int mw = 80;
	public static final int mh = 50;
	// initializes the x and y position of mouth on the face
	public static final int xm = xp + 50;
	public static final int ym = yp + 90;
	// define the class variables of type Color
	public Color profile, nface, fsmile, eye;

	// smiley constructor with four parameters
	public Smiley(Color profile, Color nface, Color fsmile, Color eye) {
		// set the layout
		setLayout(new BorderLayout());
		// initialize the parameters
		this.profile = profile;
		this.nface = nface;
		this.fsmile = fsmile;
		this.eye = eye;
		setVisible(true);
		// call paint() method
		repaint();
	}

	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);
		// set the color of profile of the face
		gr.setColor(profile);
		// draw the face
		gr.fillOval(xp, yp, fd + 7, fd + 7);
		// fill the color of face
		gr.setColor(nface);
		gr.fillOval(xp + 3, yp + 3, fd, fd);
		// fill the eye color
		gr.setColor(eye);
		// for draw right eye
		gr.fillOval(xre, yre, we, he);
		gr.setColor(eye);
		// for draw left eye
		gr.fillOval(xle, yle, we, he);
		// for smile color
		gr.setColor(fsmile);
		gr.drawArc(xm, ym, mw, mh, happy, 180);
	}
}

// class for SmileyGrid
public class SmileyGrid extends JFrame implements ActionListener {
	// object for SmileGrid class
	static SmileyGrid gs = new SmileyGrid();

	// main function
	public static void main(String[] args) {

		// call createFace function()
		gs.createFace();

	}

	// constructor
	public SmileyGrid() {
	}

	// function definition for createFace()
	void createFace() {

		// create array of colors and store as number of colors you wish
		Color color[] = new Color[] { Color.BLUE, Color.RED, Color.YELLOW, Color.black, Color.BLUE, Color.GREEN,
				Color.GRAY };
		// run task in background so app does not freeze
		Runnable r = new Runnable() {
			public void run() {

				try {
					Random random = new Random();// random number generator
													// class
					gs = new SmileyGrid();
					gs.setSize(400, 400);
					// set grid layout for 3 rows and 3 colums
					gs.setLayout(new GridLayout(3, 3));
					for (int a = 0; a < 9; a++) {
						// generate any integer random number between color
						// array size
						// set color of this generated number to smiley face
						Smiley sp = new Smiley(color[random.nextInt(color.length)], color[random.nextInt(color.length)],
								color[random.nextInt(color.length)], color[random.nextInt(color.length)]);

						// add
						gs.add(sp);
					}
					// let thread sleep for 1 second and then continue again you
					// can change time
					Thread.sleep(1000);

				} catch (InterruptedException ex) {
					// do stuff
				}

				gs.setVisible(true);
				gs = null;// remove grid and again initialize when function call

				createFace();// call recursively
			}
		};

		new Thread(r).start();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae) {
	}
}
