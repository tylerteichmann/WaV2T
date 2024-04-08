// Tyler J. Teichmann

/**
 * Commission Class
 */
public class Commission extends Hourly {
    
    // Instance variable 1: the total sales the employee has made.
    private double totalSales;
    // Instance variable 2: the commission rate for the employee.
    private double commissionRate;

    // Constructor for a commission employee. Takes parameters.
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        // Call the parent class constructor with the first 5 parameters.
        super(eName, eAddress, ePhone, socSecNumber, rate);
        // Use the 6th parameter to set the commission rate.
        this.commissionRate = commissionRate;
    }

    /**
     * Additional method to add sales for a commission employee.
     * @param totalSales Number of sales to add.
     */
    public void addSales(double totalSales) {
        // Add the parameter to the instance variable representing total sales.
        this.totalSales += totalSales;
    }

    /**
     * pay method for a commission employee.
     */
    public double pay() {
        // Call eht pay method of the parent class to compute the pay for hours worked.
        double result = super.pay();
        // Add to the result the pay from commission on sales.
        result += commissionRate * totalSales;
        // Set the total sales back to 0.
        totalSales = 0;
        // Return the result.
        return result;
    }

    /**
     * toString method for a commission employee.
     */
    public String toString() {
        // Call the toString method of the parent class.
        String result = super.toString();
        // Add a new line for Total Sales.
        result += "\nTotal Sales: " + totalSales;
        // Return result.
        return result;
    }
}
