package com;

import java.util.ArrayList;

public class Tester {

    public static void main(String[] args){


        Travel travel= new Travel();
        ArrayList<Driver> totalDriverList = retriveDriverCallingMethod();
        Driver maxDistance = travel.retriveMaximumDistanceTravelledDriver(totalDriverList);
        System.out.println(maxDistance);

        // retriveDriverCallingMethod();
        retriveCountOfDriverCallingMethod();
        retrieveByDriverIdCallingMethod();
        isCarDriverCallingMethod();
        
    }




    
    private static ArrayList<Driver> retriveDriverCallingMethod() {
        Travel travel = new Travel();

        Driver driver5 = new Driver(1112, "lorry", "suresh", 77777);
        Driver driver6 = new Driver(1117, "lory", "sujesh", 775877);
        Driver driver7 = new Driver(1118, "tipper", "kamesh", 77747);
        Driver driver8 = new Driver(1114, "tipper", "prakash", 72777);

        ArrayList<Driver> al2 = new ArrayList<Driver>();

        al2.add(driver8);
        al2.add(driver5);
        al2.add(driver6);
        al2.add(driver7);

        ArrayList<Driver> response = travel.retriveDriver(al2, "lorry");
        System.out.println(response);

        return response;
    }



    private static void retriveCountOfDriverCallingMethod() {
        Travel travel = new Travel();

        Driver driver5 = new Driver(1112, "lorry", "suresh", 77777);
        Driver driver6 = new Driver(1117, "lorry", "sujesh", 775877);
        Driver driver7 = new Driver(1118, "tipper", "kamesh", 77747);
        Driver driver8 = new Driver(1114, "tipper", "prakash", 72777);

        ArrayList<Driver> al1 = new ArrayList<Driver>();
        al1.add(driver5);
        al1.add(driver6);
        al1.add(driver7);
        al1.add(driver8);

        int count = travel.retriveCountOfDriver(al1, "lorry");
        System.out.println(count);
    }


    
    private static void retrieveByDriverIdCallingMethod(){
        Travel travel = new Travel();
        
        Driver driver1 = new Driver(1112, "lorry", "suresh", 77777);
        Driver driver2 = new Driver(1117, "auto", "sujesh", 775877);
        Driver driver3 = new Driver(1118, "cab", "kamesh", 77747);
        Driver driver4 = new Driver(1114, "tipper", "prakash", 72777);

        ArrayList<Driver> tdl = new ArrayList<Driver>();
        tdl.add(driver1);
        tdl.add(driver2);
        tdl.add(driver3);
        tdl.add(driver4);
        
        travel.retrieveByDriverId(tdl, 1118);

    }


    private static void isCarDriverCallingMethod() {
        Driver driver = new Driver(111, "car", "ramesh", 999);
        Travel travel = new Travel();
        boolean a = travel.isCarDriver(driver);
        System.out.println(a);
    }
    
}
