import org.code.neighborhood.*;
public class SunPainter extends PainterPlus {
  //makes a sun with the given color as a 3x3 square
  public void paintSun(String color) {
    setPaint(9);
    turnEast();
    paintmovex(2, color);
    turnSouth();
    paintmovex(1, color);
    turnWest();
    paintmovex(2, color);
    turnSouth();
    paintmovex(1, color);
    turnEast();
    paintmovex(3, color);

  }
}