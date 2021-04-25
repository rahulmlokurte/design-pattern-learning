package com.rahullokurte.designpattern.observorpattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class EmployeeNameChannel implements PropertyChangeListener {

  private String employeeName;

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    this.setEmployeeName((String) evt.getNewValue());
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String useCase() {
    if (this.employeeName.equalsIgnoreCase("rahul")) return "YEAH";
    else return "NO";
  }
}
