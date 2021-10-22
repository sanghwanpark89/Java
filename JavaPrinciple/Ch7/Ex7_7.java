package ch7;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) {
			return;
		}
		
		this.hour = hour;
	}
	
	private boolean isNotValidHour(int hour) {	//	private method is used only in Time class.
		if(hour<0 || hour > 23) {	//	isNotValidHour method will check the hour if it is between 0-23
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getHour() {
		return this.hour;
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		
		Time t = new Time();
		
		t.setHour(21);
		
		System.out.println(t.getHour());
		
		t.setHour(100);
		
		System.out.println(t.getHour());
		
	}

}
