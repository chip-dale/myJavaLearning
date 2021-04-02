package task2;

public class HourPerMonth extends Worker {
	private static final String TITLE = "почасовая";
	
	private String name;
	private double payPerHour;
	private int sumHoursPerMonth;
	
	HourPerMonth(){}
	HourPerMonth(String name, double payPerHour, int sumHoursPerMonth){
		this.name = name;
		this.payPerHour = payPerHour;
		this.sumHoursPerMonth = sumHoursPerMonth;
	}
    
    @Override
    public String getTitle() {
        return TITLE;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getSalary() {
    	double salary = payPerHour * sumHoursPerMonth;
    	return salary;
    }
}
