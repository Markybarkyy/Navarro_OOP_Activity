package employee.version1;

public class MyDate {
	private int year;
	private int day;
    private int month;
    

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", this.day, this.month, this.year);
    }   
}

	
	
	
