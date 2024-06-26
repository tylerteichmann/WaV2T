// Tyler J. Teichmann

//********************************************************************
// Staff.java Author: **hidden**
// Represents the personnel staff of a particular business.
//********************************************************************

public class Staff
{
    StaffMember[] staffList;

    //-----------------------------------------------------------------
    // Sets up the list of staff members.
    //-----------------------------------------------------------------

    public Staff ()
    {
        staffList = new StaffMember[8]; // Increased the array size to 8
        staffList[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee ("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[3] = new Hourly ("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);
        staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");

        // Add two commissioned employees to the staff list
        staffList[6] = new Commission ("Tyler", "987 Muds Blvd.", "555-8934", "987-65-4321", 6.25, 0.2); // $6.25 per hour and 20% commission.
        staffList[7] = new Commission ("Nick", "321 Wuds Lane", "555-7582", "654-32-1987", 9.75, 0.15); // $9.75 per hour and 15% commission.
        ((Executive)staffList[0]).awardBonus (500.00);
        ((Hourly)staffList[3]).addHours (40);

        ((Commission)staffList[6]).addHours (35); // Put hours worked at 35
        ((Commission)staffList[6]).addSales (400); // Total sales $400

        ((Commission)staffList[7]).addHours (40); // Put hours worked at 40
        ((Commission)staffList[7]).addSales (950); // Total sales $950
    }

    //-----------------------------------------------------------------
    // Pays all staff members.
    //-----------------------------------------------------------------

    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {      
            System.out.println (staffList[count]);
            amount = staffList[count].pay(); // polymorphic

            if (amount == 0.0) {
                System.out.println ("Thanks!");
            } else {
                System.out.println ("Paid: " + amount);
            }
            
            System.out.println ("-----------------------------------");
        }
    }
}