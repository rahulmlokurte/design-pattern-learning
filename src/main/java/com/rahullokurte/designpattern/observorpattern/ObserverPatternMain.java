package com.rahullokurte.designpattern.observorpattern;

import java.util.Arrays;

public class ObserverPatternMain {

  public static void main(String[] args) {

    EmployeeAgency observable = new EmployeeAgency();
    EmployeeNameChannel observer = new EmployeeNameChannel();
      EmployeeNameChannel observer2 = new EmployeeNameChannel();
    observable.addPropertyChangeListener(Arrays.asList(observer,observer2));
    observable.setEmployeeName("Rahul");
    System.out.println(observer.getEmployeeName());
    System.out.println(observer2.getEmployeeName());
    System.out.println(observer.useCase());
  }
}
