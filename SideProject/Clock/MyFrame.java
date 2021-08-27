
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;

public class MyFrame extends JFrame{
	
	//Calendar calendar;
	SimpleDateFormat timeFormat;
	//concrete class for formatting and parsing dates in a locale-sensitive manner. It allows for formatting (date → text), parsing (text → date), and normalization.
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Clock Program");
		this.setLayout(new FlowLayout());
		this.setSize(350,150);
		this.setResizable(true);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		//Time will be 04:33:41 PM a will let you know am or pm
		dayFormat = new SimpleDateFormat("EEEE");
		//EEEE format will write whole date
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		//This line will show AUG 26 2021
		
		timeLabel = new JLabel();//Create the time label Object
		timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
		timeLabel.setForeground(new Color(0X00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();//Create the day label Object
		dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
		
		dateLabel = new JLabel();//Create the date label Object
		dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));
		
		this.add(timeLabel);
		this.add(dateLabel);
		this.add(dayLabel);

		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime(){
		while(true){
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
