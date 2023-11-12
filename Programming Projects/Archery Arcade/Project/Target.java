import processing.core.*;

public class Target{

  public Target(PApplet p) {
    this.p = p;

    tx = p.random(400);
    ty = p.random(400);
    xv = 3;
    yv = 0;

   targetImage = p.loadImage("target.png");
   targetImage.resize(100, 100);
  }

  public void display(){

      p.image(targetImage, tx, ty);
      tx+=xv;
      ty+=yv;

}


  public void moveReg() {
    if(tx>1440 || tx<0){
      tx=0;
      ty=p.random(500);
    }
    else if(ty>790 || ty<0){
    //  p.delay(1000);
      tx=0;
      ty=p.random(500);
    }
}
  //vectors and arrow class for firing with velocity and - vectors
  public boolean moveTarget(){
    if(p.dist(tx+45,ty+58,p.mouseX,p.mouseY) < 10){
      tx=0;
      ty=p.random(500);
      return true;
    }else{
      return false;
    }
  }


  private PApplet p;
  float tx;
  float ty;
  float xv;
  float yv;

  PImage targetImage;
}
