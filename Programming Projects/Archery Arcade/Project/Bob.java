import processing.core.*;
import processing.sound.*;


public class Bob{


  SoundFile chomp;

  public Bob(PApplet p) {
    this.p = p;

    x = 0;
    y = 0;
    vx =p.width*0.4f/1440;
    vy =p.height*3/900;
    //size = 5*y;
    roll = (int) p.random(0,3);

  //bobImage = p.loadImage("Bob.png");
   bob1Image = p.loadImage("Bob.png");
   bob2Image = p.loadImage("Bob2.png");
   bobImage = bob1Image;
   //bobImage.resize((int)size, (int)size/2);
   //bobImage.resize(125, 62);
   bob1Image.resize(125, 62);
   bob2Image.resize(125, 62);

   chomp = new SoundFile(p, "chomp.mp3");
  }

  public void display(int AmberX, int AmberY){
    //scale the image here for size change, push and pop

      p.pushMatrix();
      p.translate(x,y);
      p.scale (0.005f*y);
      p.image(bobImage, 0,0);
      p.popMatrix();

      if(p.frameCount%30==0){
        //== comparison, = assignment
        if(bobImage == bob2Image){
          bobImage = bob1Image;
        } else if (bobImage == bob1Image){
          bobImage = bob2Image;
        }
      }

    /*  if(gameState==2){
      //  birds.play();
      //  scary.play();
      scary.play();
    }else if(gameState==1){
        //scary.play();
        scary.stop();
      } */

      y+=vy;
        //System.out.println(x + y);
      if (roll==0){
        x = 620;
        x=y*(-vx);
        x+=620;
        //System.out.println("1");
      } else if (roll==1){
        x = 640;
        //x+=vx;
        //System.out.println("2");
      } else {
        x = 730;
        x=y*(vx);
        x+=730;
        //System.out.println("3");
      }
      //amber starts at 200, 400
      //400 800 for bob
      //730 0 730.8 2.0
      //offScreen() == false &&
}
//395+31
    public boolean hit(int AmberX, int AmberY){
      if(y+31>395 && y+31<790){
        if(p.dist(x+63, y+31, AmberX+350, AmberY+250)>313 && p.dist(x+63, y+31, AmberX+350, AmberY+250)<314) {
         chomp.play();
         /* System.out.println("true");
         System.out.println("AmberX: " + AmberX);
         System.out.println("AmberY: " + AmberY);
         System.out.println(" ");
         System.out.println("x: " + x);
         System.out.println("y: " + y);
         System.out.println(" ");
         System.out.println("distance: " + p.dist(x+63, y+426, AmberX+350, AmberY+250));
         System.out.println("*"); */
         return true;
       }else{
        /* System.out.println("false");
         System.out.println("AmberX: " + AmberX);
         System.out.println("AmberY: " + AmberY);
         System.out.println(" ");
         System.out.println("x: " + x);
         System.out.println("y: " + y);
         System.out.println(" ");
         System.out.println("distance: " + p.dist(x+63, y+31, AmberX+350, AmberY+250));
         System.out.println("*"); */
         return false;
       }
     }else{
       return false;
     }
    }

/*
  public void moveReg() {
    if(x>1440 || x<0){
      x=0;
      y=p.random(500);
    }
    else if(y>790 || y<0){
    //  p.delay(1000);
      x=0;
      y=p.random(500);
    }
}
  //vectors and arrow class for firing with velocity and - vectors
  public void moveTarget(){
    if(p.dist(x+45,y+58,p.mouseX,p.mouseY) < 10){
      x=0;
      y=p.random(500);
    }
  }
*/

public boolean offScreen() {
  if(x>1440 || x<0){
        //System.out.println("oofschrean");
    return true;
  }
  else if(y>790 || y<0){
        //System.out.println("oofschrean");
    return true;
  }
        //System.out.println("notoofschrean");
  return false;
}


  private PApplet p;
  float x;
  float y;
  float vx;
  float vy;
  int size;
  int roll;
  //int bobNumber =1;

  PImage bobImage, bob1Image;
  PImage bob2Image;
}
