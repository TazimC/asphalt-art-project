import org.code.neighborhood.*;
public class SkyPainter extends PainterPlus {
  /*
  makes a sky in a 14 wide area with the given color(height must be even, use after makeFrame)
  */
  public void makeSky(String color) {
    setPaint(999);
    while (!isOnPaint()) {     
      paintmovex(13, color);
      turnLeft();
      paintmovex(1, color);
      turnLeft();
      paintmovex(13, color);
      turnRight();
      paintmovex(1, color);
      turnRight();
    }
    
  }
}