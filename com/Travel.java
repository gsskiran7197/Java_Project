package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Travel{

    public boolean isCarDriver(Driver driver){

        String category = driver.getCategory();
        if(category.equals("c")){
            return true;
        }else{
        return false;
        }
    }


    public String retrieveByDriverId(ArrayList<Driver> totalDrivers, int driverId){
        for(Driver driver: totalDrivers){
            int currentDriverId = driver.getDriverId();
            if(currentDriverId == driverId){
                String response = "Driver name is " + driver.getDriverName() + " Belonging to the category " + driver.getCategory() + " travelled " + driver.getTotalDistance() + " KM so far";
                System.out.println(response);
                return response;
            }
        
        }
        return "";

    }

    public int retriveCountOfDriver(ArrayList<Driver> driverCount, String category){
        int sum = 0;
       for(Driver driver: driverCount){
            if(driver.getCategory().equals(category)){
                sum++;
            }
       }
       return sum;
    }


    public ArrayList retriveDriver(ArrayList<Driver> drivers, String category){
        ArrayList<Driver> response = new ArrayList<>();
        for (Driver driver : drivers) {
            if (driver.getCategory().equals(category)) {
                response.add(driver);  
                
            }
        }
        return response;
    }

    public List<Driver> retriveDriverByJava8(ArrayList<Driver> driverList, String category){
        List<Driver> response = driverList.stream().filter(d->d.getCategory().equals(category)).collect(Collectors.toList());
        return response;
    }


    public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> maxDistance){

        Driver topdriver = maxDistance.get(0);
        for (Driver driver : maxDistance) {
            if (driver.getTotalDistance()>topdriver.getTotalDistance()) {
                topdriver = driver;
                
            }
        }
        return topdriver;
        
    }
}
    
    
