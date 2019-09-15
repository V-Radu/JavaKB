
public class Time {
	
	public static void show() {
		long currentMilliseconds = System.currentTimeMillis();
		long totalSeconds = currentMilliseconds / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinuts = totalSeconds / 60;
		long currentMinuts = totalMinuts % 60;
		long totalHours = totalMinuts / 60;
		long currentHour = totalHours % 24;
		
		System.out.println((currentHour+1) + ":" + currentMinuts + ":" + currentSeconds);
	}
}
