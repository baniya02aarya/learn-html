import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;
public class KeyEventExample {
    
    public static void main(String[]args){
        JFrame frame=new JFrame("KeyEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e){
                System.out.println("Key pressed "+e.getKeyChar());
            }
           
            @Override
             public void keyReleased(KeyEvent e){
                System.out.println("Key released :"+e.getKeyChar());
            }
        }
        );
        frame.setSize(400,300);
        frame.setVisible(true);

    }
}


