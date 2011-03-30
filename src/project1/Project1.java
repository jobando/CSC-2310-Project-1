package project1;

import processing.core.*;

/**
 *
 * @author Joel Obando
 */
public class Project1 extends PApplet {

    private int[] arguments; //Arg copy from the main method.
    private int width, height; //Dimensions for the window.
    private int big; //Location of the biggest integer on the list
    private Bar[] barAr;
    private Box barBox;
    final private int spacerH = 20, spacerW = 5;//Dimmetions of the spaces on top and between bars.

    /**
     * Setup function for all the items on the screen. Converts all of the items of the args array into integers while it looks for the biggest integer on the list.
     */
    @Override
    public void setup() {
        int cnts = 0;
        arguments = new int[args.length];
        int biggest = 2;
        for (int cnt = 0; cnt < args.length; cnt++) {
            arguments[cnts] = Integer.parseInt(args[cnt]);
            //Finds the biggest number in the array of integers arguments
            if (cnts > 1 && (arguments[biggest] < arguments[cnts])) {
                biggest = cnts;
            }
            cnts++;
        }
        big = biggest;
        //
        width = arguments[0];
        height = arguments[1];
        float lenght = this.lenght();//Calculated bar horizontal lenght
        size(width, height);
        smooth();
        barBox = new Box(this);
        barAr = new Bar[arguments.length - 2];
        float cnt = this.spacerW; //Space between bars
        //Initialises the bars
        for (int a = 0; a < barAr.length; a++) {
            float y = ((this.height) - this.barHeight(arguments[a + 2]));
            float h = this.barHeight(arguments[a + 2]);
            barAr[a] = new Bar(this, cnt, y, lenght, h, Integer.toString(arguments[a + 2]));
            cnt += (this.spacerW + lenght);
        }
    }

    /**
     * Draws all of the bars on the screen.
     */
    @Override
    public void draw() {
        this.background(210);
        for (int a = 0; a < barAr.length; a++) {
            barAr[a].draw();
            String m = ("Value:" + barAr[a].getValue());
            //Mouse collision detection. If the mouse is over a bar, it will display the value of the bar on a box
            if (barAr[a].getX() < this.mouseX && this.mouseX < (barAr[a].getW() + barAr[a].getX())) {
                if (barAr[a].getY() < this.mouseY && this.mouseY < (barAr[a].getH() + barAr[a].getY())) {
                    barBox.draw(this.mouseX, this.mouseY, m);
                }
            }
        }
    }

    /**
     * Calculates the relative bar length depending on the number of bars and width of window.
     * @return length.
     */
    private float lenght() {
        float nubrBars = arguments.length - 2;
        float nubrSpaces = nubrBars + 1;
        float lenght = (width - (nubrSpaces * 5)) / nubrBars;
        return lenght;
    }

    /**
     * Height of bars relative to the height of screen.
     * @param a Value of the bar.
     * @return
     */
    private float barHeight(int a) {
        float barHeight = (a * (this.height - this.spacerH)) / arguments[this.big];
        return barHeight;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] newArg = new String[args.length + 1];
        newArg[0] = "project1.Project1";
        System.arraycopy(args, 0, newArg, 1, args.length);
        PApplet.main(newArg);
    }
}
