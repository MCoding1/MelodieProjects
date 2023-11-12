import processing.core.*;

public class Win{

  PFont wat;
  PFont font;

  public Win(PApplet p) {
    this.p = p;

    wat = p.createFont("data/Win.otf", 50);

    font = p.createFont("data/Font.otf", 25);
  }

  public void display(){
    PImage win = p.loadImage("win.jpg");
    win.resize(1440, 790);
    p.image(win, 0, 0);

    p.textFont(wat);
    p.textSize(48);
    p.fill(255);
    p.text("You Have Passed the Trial, Congrats Valiant Archer!", 100, 340);

    p.textFont(font);
    p.textSize(23);
    p.text("You may now pass through the forest...", 100, 500);

    p.fill(151, 26, 30);
    p.textSize(25);
    p.rect(100, 570, 300, 55);
    p.fill(p.random(0, 255),p.random(0, 255),p.random(0, 255));
    p.text("Press Space to Exit", 135, 605);
  }



  private PApplet p;

}
