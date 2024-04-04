// Tyler J. Teichmann

// Program class
public class Program {
    // main method for Program
    public static void main(String[] args) {
        // Create a new person with an age of 28, a resting heart rate of 60, and a target heart rate of 50%
        Person person1 = new Person(28, 60, 0.5);

        // Create a new FitByte for person 1.
        FitByte assistantForPerson1 = new FitByte(person1);
        
        // Print out max heart rate of person 1.
        System.out.println("Max heart rate: " + person1.MaxHeartRate() + " bpm");
        // Print out age using person 1's FitByte
        System.out.println("Age: " + person1.GetAge());
        // Print out resting heart rate using person 1's FitByte
        System.out.println("Resting heart rate: " + person1.GetRestingHeartRate() + " bpm");

        // Call the TargetHeartRate method using person's FitByte and pass in person 1's Target Heart Rate
        double targetHeartRate = assistantForPerson1.TargetHeartRate(person1.GetTargetHeartRatePercentage());

        // Print to console
        System.out.println("Person 1's target heart rate should be: " + targetHeartRate + " bpm");

        // Age person1 by 1 year.
        person1.Age();

        // Print out max heart rate of person 1.
        System.out.println("Max heart rate: " + person1.MaxHeartRate() + " bpm");
        // Print out age using person 1's FitByte
        System.out.println("Age: " + person1.GetAge());
        // Print out resting heart rate using person 1's FitByte
        System.out.println("Resting heart rate: " + person1.GetRestingHeartRate() + " bpm");

        // Call the TargetHeartRate method using person's FitByte and pass in person 1's Target Heart Rate
        targetHeartRate = assistantForPerson1.TargetHeartRate(person1.GetTargetHeartRatePercentage());

        // Print to console
        System.out.println("Person 1's target heart rate should be: " + targetHeartRate + " bpm");
    }
}