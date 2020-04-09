package as2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class As2 {

    public static void main(String[] Args){

        JFrame frame = new JFrame();
        frame.setSize(1100,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Rectangle base = new Rectangle(0,0,1000,500);

        Mondrian painting = new Mondrian(base);
        painting.makeRectangle(painting.baseRectangle);
        rectangle comp= new rectangle(painting.getPainting());

        frame.add(comp);
        frame.setVisible(true);


        class SpacebarListener implements KeyListener {

            public void keyReleased(KeyEvent e) {

                int keybind = e.getKeyCode();

                if (keybind == KeyEvent.VK_SPACE) {
                    Mondrian painting1 = new Mondrian(base);
                    painting.makeRectangle(painting1.baseRectangle);
                    rectangle comp = new rectangle(painting1.getPainting());

                    frame.add(comp);
                    frame.setVisible(true);

                }

            }

            public void keyPressed(KeyEvent e){ }

            public void keyTyped(KeyEvent e){ }

        }

        SpacebarListener spacebarListener = new SpacebarListener();
        frame.addKeyListener(spacebarListener);
    }

}