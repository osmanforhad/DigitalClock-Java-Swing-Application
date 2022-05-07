import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.GridLayout;
import java.util.Date;

public class AppWindow extends JFrame{

    //__Define variables__//
    private JLabel heading;
    private JLabel clock;
    private Font font = new Font("", Font.BOLD, 35);

    //__Constructor Method__//
    AppWindow(){
        super.setTitle("Digital Clock by osman forhad");
        super.setSize(620, 620);
        setLocation(300, 50);
        //Calling the User Interface Method
        this.createGUI();
          //Calling the digitalClock Method
          digitalClock();
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

    //__Digital Clock Method__//
    public void digitalClock(){
        Timer timer = new Timer(1000, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String dateTime = new Date().toString();
                clock.setText(dateTime);
            }
        });
        timer.start();
    }

}
