import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        redCircle.setId("1");
        shapeMap.put(redCircle.getId(),redCircle);

        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());;
        greenCircle.setId("2");
        shapeMap.put(greenCircle.getId(),greenCircle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("4");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
