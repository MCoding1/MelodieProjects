//Virtual Piano with Staff by: Melodie

import processing.sound.*;

//declare the soundfile object
SoundFile Cnote;
SoundFile Dnote;
SoundFile Enote;
SoundFile Fnote;
SoundFile Gnote;
SoundFile Anote;
SoundFile Bnote;
SoundFile Cnote2;
SoundFile Csharp;
SoundFile Eflat;
SoundFile Fsharp;
SoundFile Aflat;
SoundFile Bflat;

//declare PImage
PImage piano;
PImage staff;

void setup() {
  size(600, 450);

  piano = loadImage("piano.png");
  piano.resize(600, 300);
  staff = loadImage("staff.png");
  staff.resize(600, 150);

  Cnote = new SoundFile(this, "Cnote.mp3");
  Dnote = new SoundFile(this, "Dnote.mp3");
  Enote = new SoundFile(this, "Enote.mp3");
  Fnote = new SoundFile(this, "Fnote.mp3");
  Gnote = new SoundFile(this, "Gnote.mp3");
  Anote = new SoundFile(this, "Anote.mp3");
  Bnote = new SoundFile(this, "Bnote.mp3");
  Cnote2 = new SoundFile(this, "Cnote2.mp3");
  Csharp = new SoundFile(this, "Csharp.mp3");
  Eflat = new SoundFile(this, "Eflat.mp3");
  Fsharp = new SoundFile(this, "Fsharp.mp3");
  Aflat = new SoundFile(this, "Aflat.mp3");
  Bflat = new SoundFile(this, "Bflat.mp3");
}


void draw() {
  image(piano, 0, 0); 
  image(staff, 0, 300); 
  fill(255);
  rect(161, 1.5, 27, 156);
  rect(198, 1.5, 22, 156);
  rect(228, 1.5, 27, 156);
  rect(255, 1.5, 26, 156);
  rect(288, 1.5, 27, 156);
  rect(324, 1.5, 27, 156);
  rect(360, 1.5, 27, 156);
  rect(387, 1.5, 25, 156);
  fill(0);  
  rect(188, 1.5, 10, 90); 
  rect(220, 1.5, 10, 90); 
  rect(280, 1.5, 10, 90); 
  rect(314, 1.5, 12, 90); 
  rect(350, 1.5, 12, 90); 
  fill(225, 0);
  //C
  ellipse(25, 415, 18, 22);
  //Csharp
  ellipse(68, 415, 18, 22);
  //D
  ellipse(111, 405, 18, 22);
  //Eflat
  ellipse(152, 405, 18, 22);
  //E
  ellipse(214, 397, 18, 22);
  //F
  ellipse(254, 387, 18, 22);
  //Fsharp
  ellipse(294, 387, 18, 22);
  //G
  ellipse(338, 377, 18, 22);
  //Aflat
  ellipse(406, 377, 18, 22);
  //A
  ellipse(444, 367, 18, 22);
  //Bflat
  ellipse(482, 367, 18, 22);
  //B
  ellipse(522, 357, 18, 22);
  //C
  ellipse(588, 347, 18, 22);

  if (Cnote.isPlaying()) {
    fill(#FF3E3E);
    rect(161, 1.5, 27, 156);
    ellipse(25, 415, 18, 22);
  } else {
    fill(255);
    rect(161, 1.5, 27, 156);
    fill(225, 0);
    ellipse(25, 415, 18, 22);
  }
  if (Dnote.isPlaying()) {
    fill(#FFB51F);
    rect(198, 1.5, 22, 156);
    ellipse(111, 405, 18, 22);
  } else {
    fill(255);
    rect(198, 1.5, 22, 156);  
    fill(255, 0);
    ellipse(111, 405, 18, 22);
  }
  if (Enote.isPlaying()) {
    fill(#FBFF34);
    rect(228, 1.5, 27, 156);
    ellipse(214, 397, 18, 22);
  } else {
    fill(255);
    rect(228, 1.5, 27, 156);
    fill(255, 0);
    ellipse(214, 397, 18, 22);
  }
  if (Fnote.isPlaying()) {
    fill(#95FF34);
    rect(255, 1.5, 26, 156);
    ellipse(254, 387, 18, 22);
  } else {
    fill(255);
    rect(255, 1.5, 26, 156);
    fill(255, 0);
    ellipse(254, 387, 18, 22);
  }
  if (Gnote.isPlaying()) {
    fill(#67FFFE);
    rect(288, 1.5, 27, 156);
    ellipse(338, 377, 18, 22);
  } else {
    fill(255);
    rect(288, 1.5, 27, 156);
    fill(255, 0);
    ellipse(338, 377, 18, 22);
  }
  if (Anote.isPlaying()) {
    fill(#224FED);
    rect(324, 1.5, 27, 156);
    ellipse(444, 367, 18, 22);
  } else {
    fill(255);
    rect(324, 1.5, 27, 156);
    fill(255, 0);
    ellipse(444, 367, 18, 22);
  }
  if (Bnote.isPlaying()) {
    fill(#5800FF);
    rect(360, 1.5, 27, 156);
    ellipse(522, 357, 18, 22);
  } else {
    fill(255);
    rect(360, 1.5, 27, 156);
    fill(255, 0);
    ellipse(522, 357, 18, 22);
  }
  if (Cnote2.isPlaying()) {
    fill(#FF6CD6);
    rect(387, 1.5, 25, 156);
    ellipse(588, 347, 18, 22);
  } else {
    fill(255);
    rect(387, 1.5, 25, 156);
    fill(255, 0);
    ellipse(588, 347, 18, 22);
  }  
  if (Csharp.isPlaying()) {
    fill(#BCBCBC);
    rect(188, 1.5, 10, 90);
    ellipse(68, 415, 18, 22);
  } else {
    fill(0);
    rect(188, 1.5, 10, 90);
    fill(255, 0);
    ellipse(68, 415, 18, 22);
  }
  if (Eflat.isPlaying()) {
    fill(#BCBCBC);
    rect(220, 1.5, 10, 90);
    ellipse(152, 405, 18, 22);
  } else {
    fill(0);
    rect(220, 1.5, 10, 90);
    fill(255, 0);
    ellipse(152, 405, 18, 22);
  }
  if (Fsharp.isPlaying()) {
    fill(#BCBCBC);
    rect(280, 1.5, 10, 90);
    ellipse(294, 387, 18, 22);
  } else {
    fill(0);
    rect(280, 1.5, 10, 90);
    fill(255, 0);
    ellipse(294, 387, 18, 22);
  }
  if (Aflat.isPlaying()) {
    fill(#BCBCBC);
    rect(314, 1.5, 12, 90);
    ellipse(406, 377, 18, 22);
  } else {
    fill(0);
    rect(314, 1.5, 12, 90);
    fill(255, 0);
    ellipse(406, 377, 18, 22);
  }
  if (Bflat.isPlaying()) {
    fill(#BCBCBC);
    rect(350, 1.5, 12, 90);
    ellipse(482, 367, 18, 22);
  } else {
    fill(0);
    rect(350, 1.5, 12, 90);
    fill(255, 0);
    ellipse(482, 367, 18, 22);
  }
}

void keyPressed() {
  if (key == 'a') {
    Cnote.play();
  } else if (key == 's') {
    Dnote.play();
  } else if (key == 'd') {
    Enote.play();
  } else if (key == 'f') {
    Fnote.play();
  } else if (key == 'j') {
    Gnote.play();
  } else if (key == 'k') {
    Anote.play();
  } else if (key == 'l') {
    Bnote.play();
  } else if (key == ';') {
    Cnote2.play();
  } else if (key == 'w') {
    Csharp.play();
  } else if (key == 'e') {
    Eflat.play();
  } else if (key == 'u') {
    Fsharp.play();
  } else if (key == 'i') {
    Aflat.play();
  } else if (key == 'o') {
    Bflat.play();
  }
}


void mouseClicked() {
  //  rect(161, 1.5, 27, 156);
  if (mouseX > 161 && mouseX < 188 && mouseY > 1.5 && mouseY < 156) {
    Cnote.play();
  }
  //rect(198, 1.5, 22, 156);
  else if (mouseX > 198 && mouseX < 220 && mouseY > 1.5 && mouseY < 156) {
    Dnote.play();
  }
  // rect(228, 1.5, 27, 156);
  else if (mouseX > 228 && mouseX < 255 && mouseY > 1.5 && mouseY < 156) {
    Enote.play();
  }
  // rect(255, 1.5, 26, 156);
  else if (mouseX > 255 && mouseX < 281 && mouseY > 1.5 && mouseY < 156) {
    Fnote.play();
  }
  // rect(288, 1.5, 27, 156);
  else if (mouseX > 288 && mouseX < 315 && mouseY > 1.5 && mouseY < 156) {
    Gnote.play();
  }
  //rect(324, 1.5, 27, 156);
  else if (mouseX > 324 && mouseX < 351 && mouseY > 1.5 && mouseY < 156) {
    Anote.play();
  }
  // rect(360, 1.5, 27, 156);
  else if (mouseX > 360 && mouseX < 387 && mouseY > 1.5 && mouseY < 156) {
    Bnote.play();
  }
  //rect(387, 1.5, 25, 156);
  else if (mouseX > 387 && mouseX < 412 && mouseY > 1.5 && mouseY < 156) {
    Cnote2.play();
  }
  //rect(188, 1.5, 10, 90); 
  else if (mouseX > 188 && mouseX < 198 && mouseY > 1.5 && mouseY < 90) {
    Csharp.play();
  }  //rect(220, 1.5, 10, 90);
  else if (mouseX > 220 && mouseX < 230 && mouseY > 1.5 && mouseY < 90) {
    Eflat.play();
  }  //rect(280, 1.5, 10, 90);
  else if (mouseX > 280 && mouseX < 290 && mouseY > 1.5 && mouseY < 90) {
    Fsharp.play();
  }  //rect(314, 1.5, 12, 90);
  else if (mouseX > 314 && mouseX < 326 && mouseY > 1.5 && mouseY < 90) {
    Aflat.play();
  }  //rect(350, 1.5, 12, 90);
  else if (mouseX > 350 && mouseX < 362 && mouseY > 1.5 && mouseY < 90) {
    Bflat.play();
  }
}
