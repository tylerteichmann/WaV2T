// Tyler J. Teichmann

/**
 * Person class
 */
public class Person {
    // Private property for a person's age.
    private int age;
    // Private property for a person's target heart rate percentage.
    private double targetHeartRatePercentage;
    // Private property for a person's resting heart rate.
    private int restingHeartRate;

    /**
     * This is the default constructor if no inputs are provided.
     */
    public Person() {
        // Set age to 20.
        this.age = 20;
        // Set target heart rate percentage to 70%.
        this.targetHeartRatePercentage = 0.7;
        // Set the resting heart rate to 80 beats per minute.
        this.restingHeartRate = 80;
    }

    /**
     * This is the non-default constructor.
     * @param age Person's age.
     * @param restingHeartRate Person's resting heart rate.
     * @param targetHeartRatePercentage Person's desired target heart rate percentage.
     */
    public Person(int age, int restingHeartRate, double targetHeartRatePercentage) {
        // Set age to the input age.
        this.age = age;
        // Set the target heart rate percentage to the input target heart rate percentage.
        this.targetHeartRatePercentage = targetHeartRatePercentage;
        // Set the resting heart rate to the input target heart rate.
        this.restingHeartRate = restingHeartRate;
    }

    /**
     * Gets the person's age.
     * @return Returns the person's age.
     */
    public int GetAge() {
        // Return the person's age.
        return this.age;
    }

    /**
     * Gets the person's target heart rate percentage.
     * @return Returns the person's target heart rate percentage.
     */
    public double GetTargetHeartRatePercentage() {
        // Return the person's target heart rate percentage.
        return this.targetHeartRatePercentage;
    }

    /**
     * Gets the person's resting heart rate.
     * @return Returns the person's resting heart rate.
     */
    public int GetRestingHeartRate() {
        // Return the resting heart rate for the person.
        return this.restingHeartRate;
    }

    /**
     * Sets a person's age.
     * @param age Takes the person's age as an input.
     */
    public void SetAge(int age) {
        // Set the person's age equal to the input age.
        this.age = age;
    }
    
    /**
     * Sets the target heart rate percentage for a person.
     * @param targetHeartRatePercentage Takes the target heart rate percentage as input.
     */
    public void SetTargetHeartRatePercentage(double targetHeartRatePercentage) {
        // Set the person's target heart rate percentage to the input percentage.
        this.targetHeartRatePercentage = targetHeartRatePercentage;
    }

    /**
     * Sets the resting heart rate for a person.
     * @param restingHeartRate Takes the resting heart rate as input.
     */
    public void SetRestingHeartRate(int restingHeartRate) {
        // Set the resting heart rate to the input heart rate.
        this.restingHeartRate = restingHeartRate;
    }



    // TODO


    /**
     * Method 1.
     * Method for a person to get older.
     */
    public void Age() {
        // Increment age by one year.
        this.age++;
    }

    /**
     * Method 2.
     * Quickly calculates a person's max heart rate.
     * @return Returns a person's max heart rate based on their age.
     */
    public double MaxHeartRate() {
        // Calculate the max heart rate by using the provided max heart rate formula.
        return 206.3 - (0.711 * this.age);
    }
}
