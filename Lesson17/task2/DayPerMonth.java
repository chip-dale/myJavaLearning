package task2;

public class DayPerMonth extends Worker {
	private static final String TITLE = "ставка";
	
	private String name;
	private double payPerDay;
	private int sumDaysPerMonth;
	
	DayPerMonth(){}
	DayPerMonth(String name, double payPerDay, int sumDaysPerMonth){
		this.name = name;
		this.payPerDay = payPerDay;
		this.sumDaysPerMonth = sumDaysPerMonth;
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
    	double salary = payPerDay * sumDaysPerMonth;
    	return salary;
    }
}
