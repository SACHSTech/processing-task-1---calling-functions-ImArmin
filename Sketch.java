import processing.core.PApplet;

public class Sketch extends PApplet {

  // Called once at the beginning of execution. Size Is Set
  public void settings() {

	// Size Of House Picture
    size(400, 400);
  }

  // Called once at the beginning of execution. Background Of House Is Set
  public void setup() {
    background(51, 153, 255);
  }

  // Drawing The House
  public void draw() {
	  
    // Sun
    fill(255, 255, 0);
    ellipse(50, 50, 80, 80);

    // Hill
    fill(0, 153, 0);
    ellipse(330, 350, 200, 200);

    // Hill
    fill(0, 153, 0);
    ellipse(100, 370, 200, 200);

    // Hill
    fill(0, 153, 0);
    ellipse(30, 380, 200, 200);

    // Hill
    fill(0, 153, 0);
    ellipse(370, 380, 200, 200);

    // Grass
    fill(102, 255, 102);
    rect(0, 340, 400, 400);

    // Cloud
    fill(255, 255, 255);
    ellipse(240, 30, 140, 40);

    // Cloud
    fill(255, 255, 255);
    ellipse(290, 40, 140, 40);

    // Cloud
    fill(255, 255, 255);
    ellipse(190, 37, 140, 40);

    // House Bricks
    fill(255, 204, 51);
    rect(100, 155, 200, 200);

    // Door
    fill(153, 102, 0);
    rect(175, 280, 50, 75);

    // Window
    fill(255, 255, 255);
    rect(112, 280, 50, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(107, 280, 60, 5);

    // Window
    fill(255, 255, 255);
    rect(238, 280, 50, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(233, 280, 60, 5);

    // Window
    fill(255, 255, 255);
    rect(112, 200, 75, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(107, 200, 85, 5);

    // Window
    fill(255, 255, 255);
    rect(213, 200, 75, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(208, 200, 85, 5);

    // Door Handle
    fill(255, 204, 0);
    ellipse(215, 315, 10, 10);

    // House Chimny
    fill(255, 204, 51);
    rect(250, 80, 25, 70);

    // Chimny Exit
    fill(51, 0, 0);
    rect(245, 80, 35, 5);

    // House Roof
    fill(51, 0, 0);
    triangle(200, 75, 325, 175, 75, 175);

    // Tree Leaves
    fill(0, 102, 0);
    ellipse(65, 220, 100, 100);

    // Tree Trunk
    fill(102, 51, 0);
    rect(55, 270, 20, 100);

    // Bush
    fill(0, 102, 0);
    ellipse(315, 330, 60, 60);

    // Bush
    fill(0, 102, 0);
    ellipse(340, 350, 60, 60);

    // Bush
    fill(0, 102, 0);
    ellipse(300, 350, 60, 60);
  }
  
  // define other methods down here.
}