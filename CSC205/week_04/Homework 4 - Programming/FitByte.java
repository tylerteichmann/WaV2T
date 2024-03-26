public class FitByte {
    private int age;
    private int restingHeartRate;
    private double maximumHeartRate = 206.3;

    // this is the default constructor
    public FitByte() {
        this.age = 20;
        this.restingHeartRate = 80;
        this.maximumHeartRate -= 0.711 * age;
    }

    // this is the nondefault constructor
    public FitByte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        this.maximumHeartRate -= 0.711 * age;
    }

    public FitByte(Person person) {
        this.age = person.getAge();
        this.restingHeartRate = person.getRestingHeartRate();
        this.maximumHeartRate -= 0.711 * age;
    }

    // this is the getter for age
    public int getAge() {
        return this.age;
    }

    // this is the getter for resting heart rate
    public int getRestingHeartRate() {
        return this.restingHeartRate;
    }

    // this is the getter for max heart rate
    public double getMaximumHeartRate() {
        return this.maximumHeartRate;
    }

    // this is the setter for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // this is the setter for resting heart rate
    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }

    // Method 1
    public void method1() {

    }

    // Method 2
    public double TargetHeartRate(double percentageOfMaximum) {
        if (percentageOfMaximum < 0) {
            percentageOfMaximum = 0;
        } else if (percentageOfMaximum > 1) {
            percentageOfMaximum = 1;
        }
        return (maximumHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
}
