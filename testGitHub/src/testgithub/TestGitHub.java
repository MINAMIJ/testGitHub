package testgithub;

import processing.core.PApplet;


public class TestGitHub extends PApplet {
	myClass mc;
	
	public void setup() {
		mc = new myClass(this);
	}

	public void draw() {
	}
	
	public static void main(String _args[]) {
		PApplet.main(new String[] { testgithub.TestGitHub.class.getName() });
	}
}
