public class Person {
    private int age;
    private double targetHeartRatePercentage;
    private int restingHeartRate;

    // this is the default constructor
    public Person() {
        this.age = 20;
        this.targetHeartRatePercentage = 0.7;
        this.restingHeartRate = 80;
    }

    // this is the nondefault constructor
    public Person(int age, int restingHeartRate, double targetHeartRatePercentage) {
        this.age = age;
        this.targetHeartRatePercentage = targetHeartRatePercentage;
        this.restingHeartRate = restingHeartRate;
    }

    // this is the getter for age
    public int getAge() {
        return this.age;
    }

    // this is the getter for targetHeartRatePercentage
    public double getTargetHeartRatePercentage() {
        return this.targetHeartRatePercentage;
    }

    // this is the getter for resting heart rate
    public int getRestingHeartRate() {
        return this.restingHeartRate;
    }

    // this is the setter for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // this is the setter for target heart rate percentage
    public void setTargetHeartRatePercentage(double targetHeartRatePercentage) {
        this.targetHeartRatePercentage = targetHeartRatePercentage;
    }

    // this is the setter for target heart rate percentage
    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }

    // Method 1
    public void method1() {

    }

    // Method 2
    public int method2() {
        return 1;
    }
}
