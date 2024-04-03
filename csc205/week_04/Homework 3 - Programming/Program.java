// Tyler J. Teichmann

// Program class
public class Program {
    // main method for Program
    public static void main(String[] args) {
        Person person1 = new Person(28, 60, 0.5);

        FitByte assistantForPerson1 = new FitByte(person1);
        
        System.out.println("Max heart rate: " + assistantForPerson1.getMaximumHeartRate());
        System.out.println("Age: " + assistantForPerson1.getAge());
        System.out.println("Resting heart rate: " + assistantForPerson1.getRestingHeartRate());

        System.out.println(assistantForPerson1.TargetHeartRate(person1.getTargetHeartRatePercentage()));
    }
}