package employee.version2;

public class MyDate {
	 private int day;
	    private int month;
	    private int year;
	    private final String[] months = new String[] {"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEPT","OCT","NOV","DEC"};


	    public MyDate(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    @Override
	    public String toString() {
	        return String.format("%02d %s %d", this.day, months[month], this.year);
	    }  
}
