import processing.core.*;

//data folder import
import data.*;


public class MyPApplet extends PApplet {

	private String URL = "palmTrees.jpg";
	private PImage backgroundImg;
	private float hour;
	//function executed once
	public void setup(){
		size(200, 200);
		backgroundImg = loadImage(URL);
	}
	
	//function looped often
	public void draw(){
		//0 means we don't want to calculate de width.
		//height is a PApplet variable. it tells that the image height should be the same with the canvas
		backgroundImg.resize(0,height);
		image(backgroundImg, 0, 0);
		hour = hour();
		if(hour<12){
			fill(255,250,0);
		}else{
			fill(25,150,200);
		}
		text("heure"+hour, 100, 150);
		ellipse(width/4, height/5, width/5, height/5);
		
	}
}
