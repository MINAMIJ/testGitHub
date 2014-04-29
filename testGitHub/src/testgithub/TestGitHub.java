package testgithub;

import processing.core.PApplet;


public class TestGitHub extends PApplet {
	myClass mc;
	int step;
	
	public void setup() {
		mc = new myClass(this);
		step = 1;
	}

	public void draw() {
	}
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { testgithub.TestGitHub.class.getName() });
	}
}
