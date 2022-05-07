import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AppWindow extends JFrame {

  //__Define variables__//
  private JLabel heading;
  private JLabel clock;
  private Font font = new Font("", Font.BOLD, 35);

  //__Constructor Method__//
  AppWindow() {
    super.setTitle("Digital Clock by osman forhad");
    super.setSize(400, 400);
    setLocation(300, 50);
    //Calling the User Interface Method
    this.createGUI();
    //Calling the digitalClock Method
    digitalClock();
    super.setVisible(true);
  }

  //__All User interface method__//
  public void createGUI() {
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

  //__Digital Clock Method Using Thread Programming__//
  public void digitalClock() {
    Thread thread = new Thread() {
      public void run() {
        try {
          while (true) {
            //Time Formating by SimpleDateFormat class
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
              "hh : mm : ss a"
            );
            String dateTime = simpleDateFormat.format(date);
            //set date time inside the clock label
            clock.setText(dateTime);

            //Thread.sleep(1000);
            Thread.currentThread().sleep(1000);
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
    thread.start();
  }
}
