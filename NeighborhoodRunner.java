import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    FramePainter frame = new FramePainter();
    //make a border
    frame.makeFrame("LightSlateGray");

    SkyPainter sky = new SkyPainter();
    //move off the border
    sky.move();
    sky.turnRight();
    sky.move();
    //fill in the area with blue
    sky.makeSky("SkyBlue");
    //move to corner
    sky.moveFast();

    SunPainter sun = new SunPainter();
    //move to where sun will be
    sun.move();
    sun.movexSouth(1);
    //make the sun with the color yellow
    sun.paintSun("Yellow");
    //move to corner
    sun.moveFast();
    sun.turnLeft();
    sun.moveFast();

    PainterPlus artist = new PainterPlus();
    
    artist.setPaint(999);
    //move to where the ground will go
    artist.movexSouth(14);
    artist.movexEast(1);
    //make the ground
    artist.paintmovex(13, "SaddleBrown");
    artist.turnLeft();
    artist.paintmovex(1, "SaddleBrown");
    artist.turnLeft();
    artist.paintmovex(13, "SaddleBrown");
    artist.turnRight();
    artist.paintmovex(1, "SaddleBrown");
    artist.turnRight();
    artist.paintmovex(4, "Green");
    artist.paintmovex(3, "SaddleBrown");
    artist.paintmovex(7, "Green");
    artist.movexNorth(1);
    artist.movexWest(1);
    artist.paintmovex(14, "Green");
    artist.movexNorth(1);
    artist.movexEast(4);
    artist.paintmovex(5, "Green");
    artist.move();
    //treecolors
    String treeColor = "RosyBrown";
    String leafColor = "LimeGreen";
    //height of the tree - 1
    int count = 7;
    artist.turnNorth();
    artist.paintmovex(count, treeColor);
    artist.turnSouth();
    artist.paintmovex(count - 2, leafColor);
    artist.movexEast(1);
    artist.movexNorth(2);
    artist.paintmovex(count - 4, leafColor);
    artist.movexWest(2);
    artist.movexSouth(1);
    artist.paintmovex(count - 4, leafColor);
    //move to corner
    artist.moveFast();
    artist.turnRight();
    artist.moveFast();
    


  }
}