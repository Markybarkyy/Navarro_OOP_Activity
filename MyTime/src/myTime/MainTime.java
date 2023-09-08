package myTime;

public class MainTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timetick t1 = new Timetick(2,59,59,false);
		System.out.println(t1);
		
		t1.advanceTime(12);
		t1.disp12();
		t1.disp24();
		
		t1.tickBySecond();
		t1.disp12();
		t1.disp24();
		
		t1.tickByMinute();
		t1.disp12();
		t1.disp24();
		
		t1.tickByHour();
		t1.disp12();
		t1.disp24();
	}

}
