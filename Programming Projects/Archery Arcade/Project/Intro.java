import processing.core.*;

public class Intro{

  PFont intro;
  PFont font;

  public Intro(PApplet p) {
    this.p = p;

    intro = p.createFont("data/Intro.otf", 50);

    font = p.createFont("data/Font.otf", 18);
  }

  public void display(){
    p.background(148, 113, 75);
    p.textFont(intro);
    p.textSize(55);
    p.fill(50,64,66);
    p.rect(0, 0, 840, 900);
    p.noStroke();
    p.fill(148, 113, 75);
    p.text("Archery Arcade", 100, 250);

    p.textSize(12);
    p.textFont(font);
    p.fill(151, 26, 30);
    p.text("You are an archer lost in a spooky forest.\nYou have one minute or sixty thousand milliseconds to hit ten targets and escape.\nHowever, you only have one hundred health left from the greuling climb.\nAvoid the Bobs at all costs.\nIf you are bitten by a Bob you loose 25 health and your vision will be impaired.\nClick on targets to hit them. Use the A and D keys to move Amber away from Bobs.\nGood luck, and may you prove to be a valiant archer.", 100, 300);
    p.textSize(25);
    p.rect(100, 520, 300, 55);
    p.fill(p.random(0, 255),p.random(0, 255),p.random(0, 255));
    p.text("Click space to start", 135, 555);
    PImage bow = p.loadImage("bow.png");
    bow.resize(200, 200);
    p.image(bow, 500, 550);

    PImage red = p.loadImage("red.png");
    red.resize(600, 800);
    p.image(red, 840, 0);
  }



  private PApplet p;

}
