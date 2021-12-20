import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.MouseReleasedEvent;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class S06ClickableCircle extends GraphicsApp {

    private Circle circle;

    @Override
    public void initialize() {
        setCanvasSize(500, 500);
        circle = new Circle(getWidth() / 2, getHeight() / 2, 50, Colors.RED);
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
        circle.draw();
    }

    @Override
    public void onMouseReleased(MouseReleasedEvent event) {
        boolean circleWasClicked = circle.hitTest(event.getXPos(), event.getYPos());
        if (circleWasClicked) {
            circle.setColor(Colors.getRandomColor());
        }
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("S06ClickableCircle");
    }
}
