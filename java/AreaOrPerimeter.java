/**
 * 8 kyu Area or Perimeter
 */
public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        if (l == w) {
          return l * w;
        } else {
          return (l + w) * 2;
        }
    }
}