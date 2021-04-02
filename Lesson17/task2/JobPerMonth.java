package task2;

public class JobPerMonth extends Worker {
	private static final String TITLE = "сдельная";
	
	private String name;
	private double payPerJob;
	private int sumJob1PerMonth;
	private int sumJob2PerMonth;
	private int sumJob3PerMonth;
	
	JobPerMonth(){}
	JobPerMonth(String name, double payPerJob, int sumJob1PerMonth, int sumJob2PerMonth, int sumJob3PerMonth){
		this.name = name;
		this.payPerJob = payPerJob;
		this.sumJob1PerMonth = sumJob1PerMonth;
		this.sumJob2PerMonth = sumJob2PerMonth;
		this.sumJob3PerMonth = sumJob3PerMonth;
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
    	int sumJob = sumJob1PerMonth + sumJob2PerMonth + sumJob3PerMonth;
    	double salary = payPerJob * sumJob;
    	return salary;
    }
}
