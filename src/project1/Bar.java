package project1;

import java.awt.Color;
import java.util.Random;
import processing.core.*;

/**
 *This class creates a small red car with and draws it on the screen.
 * @author Joel Obando
 */
public class Bar {

    private float locationX, locationY; //Coordenates on X and Y and
    private PApplet parent;
    private float height, width;
    int r, b, g;

    public Bar(PApplet papp, float x, float y, float w, float h) {
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
     * This method draws the figures for the car
     */
    public void draw() {
        parent.pushMatrix();
        parent.translate(locationX, locationY);
        parent.fill(r, b, g);
        //   parent.rectMode(PApplet.CORNERS);
        parent.rect(0, 0, this.width, this.height);
        parent.popMatrix();
    }
}
