import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class AppWindow extends JFrame{

    //__Define variables__//
    private JLabel heading;
    private JLabel clock;
    private Font font = new Font("", Font.BOLD, 35);

    //__Constructor Method__//
    AppWindow(){
        super.setTitle("Digital Clock by osman forhad");
        super.setSize(400, 400);
        setLocation(300, 50);
        //Calling the User Interface Method
        this.createGUI();
        super.setVisible(true);
    }

    //__All User interface method__//
    public void createGUI(){
        //create heading object
        heading = new JLabel("Digital Clock");
        //create clock object
        clock = new JLabel("Clock");

        //Font setup
        heading.setFont(font);
        clock.setFont(font);

        //put heding and clock inside the application frame by using grid layout
        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clock);

    }

}
