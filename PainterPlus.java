import org.code.neighborhood.*;
public class PainterPlus extends Painter {
  //turn right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  //pick up all paint
  public void takeAllPaint() {
    while(isOnBucket()){
      takePaint();
    }
  }
  //move as far as possible
  public void moveFast() {
    while(canMove()){
      move();
    }
  }
  //move and paint as much as possible
  public void paintToEmpty(String color) {
    while(hasPaint()) {
      paint(color);
      move();
    }
  }
  //paint a donut
  public void paintDonut(String color) {
    int steps = 4;
    int currentstep = 0;
    int currentpaint = getMyPaint();
      if (currentpaint >= 8) {
        while (currentstep < steps) {
          currentstep = currentstep + 1;
          move();
          turnRight();
          paint(color);
          move();
          paint(color);
        }
     }
  }
  //move x times
  public void movex(int number) {
    int count = 0;
    while (count < number) {
      count = count + 1;
      move();
    }
  }
  //turn to face east
  public void turnEast() {
    while (!isFacingEast()) {
      turnLeft();
    }
  }
  //turn to face west
  public void turnWest() {
    while (!isFacingWest()) {
      turnLeft();
    }
  }
  //turn to face north
  public void turnNorth() {
    while (!isFacingNorth()) {
      turnLeft();
    }
  }
  //turn to face south
  public void turnSouth() {
    while (!isFacingSouth()) {
      turnLeft();
    }
  }
  //move x east
  public void movexEast(int number) {
    turnEast();
    int count = 0;
    while (count < number) {
      count = count + 1;
      move();
    }
  }
  //move x north
  public void movexNorth(int number) {
    turnNorth();
    int count = 0;
    while (count < number) {
      count = count + 1;
      move();
    }
  }
  //move x west
  public void movexWest(int number) {
    turnWest();
    int count = 0;
    while (count < number) {
      count = count + 1;
      move();
    }
  }
  //move x south
  public void movexSouth(int number) {
    turnSouth();
    int count = 0;
    while (count < number) {
      count = count + 1;
      move();
    }
  }
  //move without erroring when wall
  public void safeMove() {
    if (canMove()) {
      move();
    }
  }
  //paint move x times
  public void paintmovex(int number, String color) {
    int count = 0;
    while (count < number) {
      count = count + 1;
      paint(color);
      move();
    }
  }
}