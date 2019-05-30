package java_fundamentals.second_20_tasks;

public class Number22 {
	public static void main (String[] args) {
		int time = 65656;
		int hours=time/3600;
		int minute = (time-(hours*3600))/60;
		int second =time-((hours*3600)+(minute*60));
		System.out.print(hours+"hh"+minute+"mm"+second+"ss");
	}

}
