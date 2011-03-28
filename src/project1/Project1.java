package project1;

import java.util.Enumeration;
import java.util.Hashtable;
import processing.core.*;

/**
 *
 * @author eltico
 */
public class Project1 extends PApplet {

    private static int[] arguments; //Arg copy from the main method.
    private int width, height, big; //Dimensions for the window.
    private Bar[] barAr;

    //Finds the biggest number in the array of integers arguments
    private void biggest() {
        int biggest = 2;
        for (int i = 2; i < (arguments.length); i++) {
            if (arguments[biggest] < arguments[i]) {
                biggest = i;
            }
        }
        this.big = biggest;
    }

    @Override
    public void setup() {
        width = arguments[0];
        height = arguments[1];
        float lenght = this.lenght();
        biggest();
        size(width, height);
        smooth();
        barAr = new Bar[arguments.length - 2];
        float cnt = 5;
        for (int a = 0; a < barAr.length; a++) {
            float y = ((this.height) - this.barHeight(arguments[a+2]));
            float h = this.barHeight(arguments[a+2]);
            barAr[a] = new Bar(this, cnt, y, lenght, h);
            cnt += (5 + lenght);
        }
    }

    @Override
    public void draw() {
        this.background(210);
        for (int a = 0; a < barAr.length; a++) {
            barAr[a].draw();
        }
    }

    private float lenght() {
        float nubrBars = arguments.length - 2;
        float nubrSpaces = nubrBars + 1;
        float lenght = (width - (nubrSpaces * 5)) / nubrBars;
        return lenght;
    }

    private float barHeight(int a) {
        float barHeight = (a * (this.height - 5)) / arguments[this.big];
        return barHeight;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cnt = 0;
        arguments = new int[args.length];
        for (String i : args) {
            arguments[cnt] = Integer.parseInt(i);
            cnt++;
        }
        PApplet.main(new String[]{"project1.Project1"});
    }
}
