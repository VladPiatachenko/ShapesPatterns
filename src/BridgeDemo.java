public class BridgeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = ShapeMaker.getInstance();

        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        shapeMaker.drawRedCircle();
        shapeMaker.drawGreenCircle();

    }
}
