import processing.core.*;

public class Arrow{

  public Arrow(PApplet p, int amberX, int amberY) {
    this.p = p;
    x = amberX + 400;
    y = amberY + 600;
    scale = 50;
    vx = (p.mouseX-x)/scale;
    vy = (p.mouseY-y)/scale;
    //mouse = new PVector();
    PVector v = new PVector(vx, vy);
    heading = v.heading()+p.PI/2;
    //mouse = new PVector(p.mouseX, p.mouseY);
   arrowImage = p.loadImage("arrow.png");
   arrowImage.resize(50, 50);
  }

  //you can't command + z on your life decisions
  public void display(){
    //stack data matrix, push or pop trays off cafeteria stack, last in stack first out
    p.pushMatrix();
    p.translate(x,y);
    //p.translate(p.mouseX,p.mouseY);

    //rotate to mouse decision
    //p.rotate(p.radians((x+p.mouseX)*(y+p.mouseY)));
    p.rotate(heading);
  //  p.rotate(p.mouseHeading(mouse));
    //no p.rotate(p.mouseX,p.mouseY);
    p.image(arrowImage,0,0);
    p.popMatrix();
//    p.image(arrowImage, x, y);
    x+=vx;
    y+=vy;
  }

  public void moveArrow(){
      //    for(x = 25; x < 1440; x+=50){
      //    for(y = 25; y < 790; y+=50) {
//      mouse = new PVector(p.mouseX-x, p.mouseY-y);


          //        p.pushMatrix();
    //  p.translate(x, y);

    //      p.popMatrix();
    //  }
    //}
  }

//remove arrow from last index
  public boolean offScreen() {
    if(x>1440 || x<0){
      return true;
    }
    else if(y>790 || y<0){
      return true;
    }
    return false;
} 

  //vectors and arrow class for firing with velocity and - vectors
  //public void moveArrow(){
  /*  if(p.dist(tx+45,ty+58,p.mouseX,p.mouseY) < 10){
      tx=0;
      ty=p.random(500);
    } */
//  }


  protected PApplet p;
  float x;
  float y;
  float vx;
  float vy;
  float scale;
  float heading;
  //private PVector mouse;
  PImage arrowImage;

}
