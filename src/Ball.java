import java.awt.*;

/**
 Created by Brian on 5/28/2015.
 */
public class Ball extends Rectangle {

    private static final int REVERSE_DIRECTION = -1;

    private int xVelocity;
    private int yVelocity;
    private int leftEdge;
    private int rightEdge;
    private int topEdge;
    private int bottomEdge;


    public Ball(int xStartPos, int yStartPos, int width, int height, int xStartVel, int yStartVel) {
        super(xStartPos, yStartPos, width, height);
        xVelocity = xStartVel;
        yVelocity = yStartVel;
        leftEdge = x;
        rightEdge = x +
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
        checkForCollision();
    }

    private void checkForCollision() {
        if (x <= Constants.WINDOW_LEFT_EDGE || x >= Constants.WINDOW_RIGHT_EDGE) {
            xVelocity *= REVERSE_DIRECTION;
        }
        if (y <= Constants.WINDOW_TOP_EDGE || y >= Constants.WINDOW_BOTTOM_EDGE) {
            yVelocity *= REVERSE_DIRECTION;
        }
    }

}
