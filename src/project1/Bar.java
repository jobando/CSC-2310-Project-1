package project1;

import java.util.Random;
import processing.core.*;

/**
 *This class creates a small red car with and draws it on the screen.
 * @author Joel Obando
 */
public class Bar {

    private float locationX, locationY; //Coordenates on X and Y and
    private PApplet parent;
    private float height, width;  //
    private int r, b, g;
    private String value;

    /**
     * Constructor
     * @param papp
     * @param x X-axis position
     * @param y Y-axis position
     * @param w Width
     * @param h Hight
     * @param m Value
     */
    public Bar(PApplet papp, float x, float y, float w, float h, String m) {
        value = m;
        locationX = x;
        locationY = y;
        height = h;
        width = w;
        Random rand = new Random();
        r = rand.nextInt(255);
        b = rand.nextInt(255);
        g = rand.nextInt(255);
        parent = papp;
    }

    /**
     *Draws the bar with a random color
     */
    public void draw() {
        parent.smooth();
        parent.pushMatrix();
        parent.translate(locationX, locationY);
        parent.fill(r, b, g);
        parent.rect(0, 0, this.width, this.height);
        parent.popMatrix();
    }

    /**
     * Returns the X location
     * @return Float X Location
     */
    public float getX() {
        return this.locationX;
    }

    /**
     * Returns the Y location
     * @return Float Y Location
     */
    public float getY() {
        return this.locationY;
    }

    /**
     * Returns width
     * @return Float Width
     */
    public float getW() {
        return this.width;
    }

    /**
     *Return the hight
     * @return Float Hight
     */
    public float getH() {
        return this.height;
    }

    /**
     * Returns the value of the bar
     * @return String Value
     */
    public String getValue(){
        return this.value;
    }
}
