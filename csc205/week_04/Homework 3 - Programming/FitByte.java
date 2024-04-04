// Tyler J. Teichmann

/**
 * FitByte class
 */
public class FitByte {
    // FitByte user
    private Person user;
    // This is the private property for the FitByte user's max heart rate
    private double maximumHeartRate;

    /**
     * Default constructor if no input is provided. 
     * Uses default values of 20 years old with a resting heart rate of 80 beats per minute.
     */
    public FitByte() {
        // Create a default user
        this.user = new Person();
        // Call the CalculateMaxHeartRate method.
        this.CalculateMaxHeartRate();
    }

    /**
     * Non-default constructor.
     * Creates a FitByte that is linked to a user
     * @param user Takes a person object as input that will be the FitByte user.
     */
    public FitByte(Person person) {
        // Set the user to the input person
        this.user = person;
        // Call the CalculateMaxHeartRate method.
        this.CalculateMaxHeartRate();
    }

    /**
     * Gets the FitByte user's age.
     * @return Returns the FitByte user's age.
     */
    public int GetUserAge() {
        // Return the user's age.
        return this.user.GetAge();
    }

    /**
     * Gets the FitByte user's resting heart rate.
     * @return  Returns the FitByte user's resting heart rate.
     */
    public int GetRestingHeartRate() {
        // Return the user's resting heart rate.
        return this.user.GetRestingHeartRate();
    }

    /**
     * Gets the FitByte user's maximum heart rate.
     * @return Returns the FitByte user's maximum heart rate.
     */
    public double GetMaximumHeartRate() {
        // Return the user's max heart rate.
        return this.maximumHeartRate;
    }

    /**
     * Sets the FitByte user's age.
     * Recalculates max heart rate.
     * @param age Takes the user's age as input.
     */
    public void SetAge(int age) {
        // Set the user's age to the input age.
        this.user.SetAge(age);
        // Recalculate the max heart rate.
        this.CalculateMaxHeartRate();
    }
    
    /**
     * Sets the FitByte user's resting heart rate.
     * @param restingHeartRate Takes the user's resting heart rate as input.
     */
    public void SetRestingHeartRate(int restingHeartRate) {
        // Set the user's resting heart rate to the input resting heart rate.
        this.user.SetRestingHeartRate(restingHeartRate);;
    }

    /**
     * Method 1
     * Calculates the FitByte user's maximum heart rate.
     * @param userAge Takes the user's age as input.
     */
    private void CalculateMaxHeartRate() {
        // Calculate the max heart rate by using the provided max heart rate formula.
        this.maximumHeartRate = 206.3 - (0.711 * this.user.GetAge());
    }

    /**
     * Method 2
     * Calculates a FitByte user's target heart rate.
     * @param percentageOfMaximum Takes a user's desired percentage of their maximum heart rate as input.
     * @return Returns the user's target heart rate for the input percentage.
     */
    public double TargetHeartRate(double percentageOfMaximum) {
        // If percentage input is less than 0%.
        if (percentageOfMaximum < 0) {
            // Set the percentage to 0.
            percentageOfMaximum = 0;
        // If percentage input is more tha 100%.
        } else if (percentageOfMaximum > 1) {
            // Set the percentage to 100.
            percentageOfMaximum = 1;
        }
        // Recalculate max heart rate
        CalculateMaxHeartRate();
        // Create a target heart rate and calculate using given formula.
        double targetHeartRate = (this.maximumHeartRate - this.user.GetRestingHeartRate()) * percentageOfMaximum + this.user.GetRestingHeartRate();
        // Return target heart rate
        return targetHeartRate;
    }
}
