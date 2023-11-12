import processing.core.*;

public class Lose{

  PFont lat;
  PFont font;

  public Lose(PApplet p) {
    this.p = p;

    lat = p.createFont("data/Lose.otf", 50);

    font = p.createFont("data/Font.otf", 20);
  }

  public void display(){
    PImage lose = p.loadImage("lose.png");
    lose.resize(1440, 790);
    p.image(lose, 0, 0);

    p.textFont(lat);
    p.textSize(48);
    p.fill(151, 26, 30);
    p.text("Not So Courageous After All It Seems...", 100, 240);

    p.textFont(font);
    p.textSize(18);
    p.text("Reload to try again, this task is not for the faint-hearted...", 100, 300);

    p.fill(0);
    p.textSize(25);
    p.rect(100, 570, 300, 55);
    p.fill(p.random(0, 255),p.random(0, 255),p.random(0, 255));
    p.text("Press Space to Exit", 140, 605);
  }



  private PApplet p;

}
