import org.code.neighborhood.*;
public class FramePainter extends PainterPlus {
  /*
  makes a border with the given color
  */
  public void makeFrame(String color) {
      setPaint(999);
      while (!isOnPaint()) {
      paintmovex(15, color);
      turnRight();
    }
  }
}