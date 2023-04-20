public class TimeTester
{
    public static void main(String [] args){

        System.out.println("\n********** Test Time - Started **********\n");
        System.out.println("\n1. Testing Constructors and toString: ");
        Time t1 = new Time(17,45);
        System.out.println("\tt1 = " + t1);
        Time t2 = new Time(t1);
        System.out.println("\tt2 = " + t2);

        System.out.println("\n2. Testing accessors and mutators: ");
        t1.setHour(20);
        t1.setMinutes(10);
        System.out.println("\tt1 = " + t1);
        System.out.println("\tHour of t1 = " + t1.getHour());
        System.out.println("\tMinute of t1 = " + t1.getMinutes());

        System.out.println("\n3. Testing minFromMidnight method: ");
        t1 = new Time(10,15);
        System.out.println("\tt1 = " + t1);
        System.out.println("\tMinutes from midnight of t1 = " + t1.minFromMidnight());

        System.out.println("\n4. Testing equals method: ");
        Time t3 = new Time(12,34);
        Time t4 = new Time(23,45);
        System.out.println("\tt3 = " + t3);
        System.out.println("\tt4 = " + t4);
        if(t3.equals(t4)){
            System.out.println("\tt3 is the same time as t4.");
        }
        else{
            System.out.println("\tt3 is not the same time as t4.");
        }

        System.out.println("\n5. Testing before method: ");
        if(t3.before(t4)){
            System.out.println("\tt3 is before t4.");
        }
        else{
            System.out.println("\tt3 is not before t4.");
        }

        System.out.println("\n6. Testing after method: ");
        if(t4.after(t3)){
            System.out.println("\tt4 is after t3.");
        }
        else{
            System.out.println("\tt4 is not after t3.");
        }

        System.out.println("\n7. Testing difference method: ");
        t1 = new Time(11,25);
        t2 = new Time(10,15);
        System.out.println("\tt1 = " + t1);
        System.out.println("\tt2 = " + t2);

        System.out.println("********** Test Time - Finished **********");
    }
}