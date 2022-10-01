public class ShapeMaker {
    private Shape circle;
    private Shape rcircle;
    private Shape gcircle;

    private Shape rectangle;
    private Shape square;

    private static ShapeMaker instance=null;
    private ShapeMaker() {
        ShapeCache.loadCache();

        rcircle = (Shape) ShapeCache.getShape("1");
        gcircle = (Shape) ShapeCache.getShape("2");
        rectangle = (Shape) ShapeCache.getShape("3");
        square = (Shape) ShapeCache.getShape("4");
    }

    public static ShapeMaker getInstance() {
        if (instance == null)
            instance = new ShapeMaker();

        return instance;
    }
    public void drawRedCircle(){
        rcircle.draw();
    }public void drawGreenCircle(){
        gcircle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
