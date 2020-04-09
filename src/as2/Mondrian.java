package as2;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class Mondrian {

    Random rng = new Random();
    int RandomDivide;

    ArrayList<Rectangle> painting = new ArrayList<>();

    //0 is vertical, 1 is horizontal
    int direction=0;

    Rectangle baseRectangle;


    public Mondrian(Rectangle rectangle){

        baseRectangle=rectangle;

    }

    public void makeRectangle(Rectangle rectangle){

        if((rectangle.width*rectangle.height)<= 110000){
            painting.add(rectangle);
        }else {

            direction = rng.nextInt(2);
            
            RandomDivide=rng.nextInt(5)+2;


            if (direction == 0) {

                makeRectangle(new Rectangle(rectangle.x, rectangle.y, (rectangle.width)/RandomDivide, rectangle.height));

                makeRectangle(new Rectangle(rectangle.x + (rectangle.width)/RandomDivide, rectangle.y, rectangle.width - rectangle.width/RandomDivide, rectangle.height));

            }else if (direction == 1) {


                makeRectangle(new Rectangle(rectangle.x, rectangle.y, rectangle.width, (rectangle.height)/RandomDivide));

                makeRectangle(new Rectangle(rectangle.x, rectangle.y + (rectangle.height)/RandomDivide, rectangle.width, rectangle.height - (rectangle.height)/RandomDivide));

            }



        }

    }

    public Rectangle getBaseRectangle() {
        return baseRectangle;
    }

    public ArrayList<Rectangle> getPainting(){
        return painting;
    }

}