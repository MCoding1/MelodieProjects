//It’s time to start planning and prototyping your coding project!

//Your project can be any interactive animation or video game using the Processing libraries.

//Your goals for the week:

//Start your project! Make a folder, and get some code running, even if it’s just
// a title screen and a bouncing ball.

//Make sure you understand how to use the Processing libraries in your program.
//In particular, you will need to understand how to write classes that call the
//Processing functions via a PApplet reference.

//Play around with some ideas.

// -- -- - - - - -- - - - - -- - - - - - - - --  -- - - - - - - - - -- -- --

//*Project Idea* Jump on the platforms coming towards you first person view,
//use bow to bow down flying objects while jumping (bow follows mouse)

//falling objects make Jan 10

/*Priorities for celebration of innovation:
!!add timer working[Y] !!add health[Y] !!chomp with collision detection[Y]
!!make sure heath decreases[Y] !!red transparent rectangle adds each time[Y]
!! score changes[Y];
!!dead lose screen and win screen based on health/score/time[Y]
!!no scary music win screen, add happy music[Y]
!!when health is very low add a sound file says (watch) out[Y]
!!when time is low say you got it (encourage)[Y]
!!make timer start on game screen[Y]
!!fix collision detection[Y]
check C
!!check music for win/lose screen[Y] !!check all functionality[Y]
!!add some cool fonts[Y]
*/

//Archery Arcade By: Melodie
import processing.core.*;
import java.util.*;
import processing.sound.*;

public class Project extends PApplet {

  SoundFile scary;
  SoundFile birds;
  SoundFile doom;
  SoundFile won;

  int currentGameState = 0;

    public void settings() {
        size(1440, 790); // must be in settings(), not setup()


    }

    public void setup() {
      scary = new SoundFile(this, "data/scary.mp3");

      birds = new SoundFile(this, "data/birds.wav");

      doom = new SoundFile(this, "data/doom.mp3");

      won = new SoundFile(this, "data/won.wav");
      //gameStates = new ArrayList<GameState>();

      //GameState gs0 = new GameState(this, 0);
      //gameStates.add(gs0);

      //gameStates.add(new GameState(this, 1));

      gameState1 = new Intro(this);
      gameState = 1;
      gameState2 = new Level1(this);
      gameState3 = new Win(this);
      gameState4 = new Lose(this);
      //scary
      scary.loop();

    }

    public void draw() {

      //GameState current = gameStates.get(currentGameState);

      //current.display();

      if(gameState == 1) {
        gameState1.display();
      }else if(gameState == 2) {
          gameState2.display();
          gameState=gameState2.results();
  //        System.out.println("Cat");
      }else if(gameState == 3) {
          gameState3.display();
          won.play();
          birds.stop();
          scary.stop();
      }else if(gameState == 4) {
          gameState4.display();
          doom.play();
          birds.stop();
          scary.stop();
      }

    }
      //private ArrayList <GameState> gameStates;

    //private float x;

   public void mouseClicked(){

     if(gameState == 2){
       gameState2.mouseClicked();
     }
    }

    public void keyPressed() {
      if (keyCode == ' ') {
        if(gameState == 1){
          //scary.stop();
          //loop
          birds.loop();
          gameState=2;
          gameState2.startTimer();
        }
        if(gameState == 2) {
        }
        if(gameState == 3) {
          won.stop();
          exit();
        }
        if(gameState == 4) {
          doom.stop();
          exit();
        }
      }
}
    public static void main(String[] args) {
        PApplet.main("Project");
    }

    Intro gameState1;
    Level1 gameState2;
    Win gameState3;
    Lose gameState4;
    int gameState;
}
