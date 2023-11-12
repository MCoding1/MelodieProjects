import processing.core.*;
import java.util.*;
import processing.sound.*;
public class Level1{

  SoundFile encourage;
  SoundFile watch;
  PFont regular;

  public Level1(PApplet p) {
    this.p = p;
    score = 0;
    health = 100;
    timer = 0;
    interval = 1000;
    x = 0;
    y = 0;
    vx = 10;
    vy = 0;

   encourage = new SoundFile(p, "encourage.wav");
   watch = new SoundFile(p, "watch.mp3");

   amber = p.loadImage("amber.png");

   dark = p.loadImage("dark.jpg");

  regular = p.createFont("data/Regular.ttf", 25);

    targets = new ArrayList<Target>();
    for(int i = 0; i < 1; i++) {
      Target t = new Target(this.p);
      targets.add(t);
    }

    arrows = new ArrayList<Arrow>();
    //for(int i = 0; i < 1; i++) {

    //}

    bobs = new ArrayList<Bob>();
    for(int i = 0; i < 2; i++) {
      Bob b = new Bob(this.p);
      bobs.add(b);
    }

  }

  public int amberX() {
    return x;
  }

  public int amberY() {
    return y;
  }



  public void display(){
    String[] highScores = new String[1];
    String[] result1 = p.loadStrings(fileName);
    highScore = result1[0];

    dark.resize(1440, 790);
    p.image(dark, 0, 0);

      //p.background(50,64,66);

    /*  PImage dark = p.loadImage("dark.jpg");
      dark.resize(1440, 790);
      p.image(dark, 0, 0); */
      p.fill(255);
      p.rect(0, 0, 590, 45);

      p.fill(0);
    p.textFont(regular);
      p.textSize(25);
      p.text(p.millis()-timer, 30, 30);
      p.text("Health: " + health, 106, 30);
      p.text("Score: " + score, 260, 30);
      p.text("High Score: " + highScore, 370, 30);
//if(millis() > timer+10000
      p.fill(16, 24, 19);
      p.triangle(200, 790, 1220, 790, 710, -100);

      //340 difference
      p.strokeWeight(2);
      p.stroke(0);
      p.line(540, 790, 710, -100);
      p.line(880, 790, 710, -100);

      for(Target t: targets) {
        t.display();
        t.moveReg();
      }

      //**
      if(score > Integer.parseInt(highScore)) {
        highScores[0] = "" + score;
        p.saveStrings(fileName, highScores);
        String[] result = p.loadStrings(fileName);
        highScore = result[0];
      }


    for(Arrow a: arrows) {
    a.display();
    }
      //  a.moveReg(x, y);
  /*   if(a.offScreen()){
        arrows.remove(a);
      System.out.println("Irene");
    } */
    //(int a =)

    for (int i = arrows.size()-1; i>0; i--) {
      if(arrows.get(i).offScreen()){
        arrows.remove(i);
        //System.out.println(arrows.size());
      }
    }

    for(Bob b: bobs) {
      //b.display(x,y);
    b.display(x,y);
    if(b.hit(x,y)==true){
      health = health-25;
      for(int i = 0; i<3; i++){
        p.fill(255, 33, 33, 50);
        p.rect(0,0,1440, 790);
      }
    }
  //  System.out.println("I have displayed a bob");
  }

  for (int i = bobs.size()-1; i>0; i--) {
    if(bobs.get(i).offScreen()){
      bobs.remove(i);
      //System.out.println("bob removed");

      Bob b = new Bob(this.p);
      bobs.add(b);
      //System.out.println("bob added");
    }
  }



    //  for (int i = 0; i < 5; i++) {
    //    target b = new target();
    //    target.add(b);
    //  }
      //p.stroke(255, 41, 248, 100);
      p.noStroke();
      p.fill(255, 41, 248, 100);
      p.rect(p.mouseX-13, p.mouseY-4, 26, 8);
      p.rect(p.mouseX-4, p.mouseY-13, 8, 26);

      amber.resize(700, 500);
      p.image(amber, x+200, y+400);

      p.noCursor();

        if (p.keyPressed) {
        if (x<770 && x>-50 && p.key == 'd' ||p.key == 'D' && x<770 && x>-50) {
          x+=vx;
        } else if (x<770 && x>-50 && p.key == 'a' ||p.key == 'A' && x<770 && x>-50) {
          x-=vx;
        } else if (x>=770){
          x-=10;
        }else if (x<=-50){
          x+=10;
        }
        /* else if (p.key == ' ') {
          y-=100;
          y+=50;
          y+=50;
        } */
    }

    if(health==25){
      //text watch out
      p.fill(255, 34, 18);
      p.textSize(25);
      p.text("Health: " + health, 106, 30);
      p.text("Watch Out!", 1240, 395);
    }
    if(health ==25 && p.millis()-timer<49000 && p.millis()-timer>46000){
      watch.play();
    }

    if(p.millis()-timer<60000 && p.millis()-timer>50000){
      //text encourage
      if(score>=10){
        p.fill(135, 255, 143);
        p.textSize(25);
        p.text("Score: " + score, 260, 30);
      }else{
        p.fill(255, 34, 18);
        p.text("Score: " + score, 260, 30);
      }
      p.fill(135, 255, 143);
      p.text("You Got This!", 200, 395);
    }
    if(p.millis()-timer<59000 && p.millis()-timer>57000){
      encourage.play();
    }

  }

  public void startTimer(){
    timer = p.millis();
  }

  public int results(){
    if(p.millis()-timer>=60000 && health>0){
      if(score>=10){
        return 3;
      }else{
        return 4;
      }
    }
    if(health<=0){
      return 4;
    }

    return 2;
  }

  public void mouseClicked() {
    for(Target t: targets) {
      if(t.moveTarget()==true){
        score++;
      }
    }
  //  for(Arrow a: arrows) {
  //    a.moveArrow();
  //  }
    Arrow a = new Arrow(this.p, amberX(), amberY());
    arrows.add(a);

  }

  private PApplet p;
  int score;
  int timer;
  int health;
  int interval;
  int x;
  int y;
  int vx;
  int vy;
  Target t1;
  Target t2;
  Target t3;
  ArrayList<Target> targets;
  ArrayList<Arrow> arrows;
  ArrayList<Bob> bobs;
  private PImage amber;
  private PImage dark;
  private String highScore = "";
  private String fileName = "high_scores.txt";
  private String[] highScores;
}
