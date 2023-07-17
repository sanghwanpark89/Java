package ch07_Ex;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		
		this.hour = hour;
	}
	
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}



public class GetSetMethod {

	public static void main(String[] args) {
		
		Time t = new Time();
		t.setHour(25);
		t.setHour(10);
		System.out.println(t.getHour());
		
	}

}
