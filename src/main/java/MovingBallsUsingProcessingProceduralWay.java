import processing.core.PApplet;

public class MovingBallsUsingProcessingProceduralWay extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int DIAMETER = 30;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;

    public static void main(String[] args) {
        PApplet.main("MovingBallsUsingProcessingProceduralWay", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    public void drawCircle() {
        ellipse(a, HEIGHT / 5, DIAMETER, DIAMETER);
        a += 1;
        ellipse(b, 2 * HEIGHT / 5, DIAMETER, DIAMETER);
        b += 2;
        ellipse(c, 3 * HEIGHT / 5, DIAMETER, DIAMETER);
        c += 3;
        ellipse(d, 4 * HEIGHT / 5, DIAMETER, DIAMETER);
        d += 4;
    }
}
