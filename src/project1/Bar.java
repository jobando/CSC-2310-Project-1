package project1;

import java.awt.Color;
import processing.core.*;

/**
 *This class creates a small red car with and draws it on the screen.
 * @author Joel Obando
 */
public class Bar {

    private float locationX, locationY; //Coordenates on X and Y and
    private PApplet parent;
    private float height, width;

    public Bar(PApplet papp, int x, int y, float w, float h) {
        locationX = x;
        locationY = y;
        height = h;
        width = w;
        parent = papp;
    }

    /**
     * This method draws the figures for the car
     */
    public void draw() {
        parent.pushMatrix();
        parent.translate(locationX, locationY);
        parent.fill(255, 255, 255);
     //   parent.rectMode(PApplet.CORNERS);
        parent.rect(0, 0, this.width, this.height);
        parent.popMatrix();
    }
}
