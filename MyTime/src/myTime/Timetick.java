package myTime;

public class Timetick {
	    private int hour;
	    private int min;
	    private int sec;
	    private boolean mer;
	    
	    
	    public Timetick(int hr, int min, int seco, boolean meri) {
	        this.hour = hr;
	        this.min = min;
	        this.sec = seco;
	        this.mer = meri;
	    }
	    
	    public Timetick() {
	        this.hour = 12;
	        this.min = 0;
	        this.sec = 0; 
	        this.mer = true;
	    }

	    public Timetick(int hour) {
	        this.hour = hour;
	        this.min = 0;
	        this.sec = 0; 
	        this.mer = true;
	    }

	   

	    public void advanceTime(int seconds) 
	    {
	        this.sec += seconds;
	        if (this.sec > 59) 
	        {
	            this.min += this.sec / 60; 
	            this.sec %= 60; 
	            if (this.min > 59) 
	            {
	                this.hour += this.min / 60; 
	                this.min %= 60; 
	            }
	        }

	    }
	    
	    public void tickBySecond() 
	    {
	        this.sec += 1;
	        if (this.sec == 60) 
	        {
	            this.sec = 0;
	            this.min += 1;
	            if (this.min == 60) 
	            {
	                this.min = 0;
	                this.hour += 1;
	                if (this.hour == 13) 
	                {
	                    this.hour = 1;
	                }
	            }
	        }
	    }
	    
	    
	    public void tickByMinute() 
	    {
	        this.min += 1;
	        if (this.min == 60) 
	        {
	            this.min = 0;
	            this.hour += 1;
	            if (this.hour == 13) 
	            {
	                this.hour = 1;
	            }
	        }
	    }

	    public void tickByHour() 
	    {
	        this.hour += 1;
	        if (this.hour == 13) 
	        {
	            this.hour = 1;
	        }
	    }

	    public void disp24() {
	        System.out.println("\n24HR Time");
	        System.out.printf("%02d:%02d:%02d", this.hour, this.min, this.sec);
	    }

	    

	    public void disp12() {
	        System.out.println("\n12HR Time");
	        String period = mer ? "AM" : "PM";
	        int dispHR = (hour == 0 || hour == 12) ? 12 : hour % 12;
	        System.out.printf("%02d:%02d:%02d %s", dispHR, this.min, this.sec, period);
	    }

	    

	    @Override
	    public String toString() {
	        return String.format("\nCurrent: %02d:%02d:%02d", this.hour, this.min, this.sec);
	    }
}
