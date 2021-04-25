package com.rahullokurte.designpattern.observorpattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class EmployeeAgency {

    private String employeeName;

    private PropertyChangeSupport support;

    public EmployeeAgency() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(List<PropertyChangeListener> propertyChangeListener) {
    propertyChangeListener.forEach(s -> support.addPropertyChangeListener(s));
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.removePropertyChangeListener(propertyChangeListener);
    }

    public void setEmployeeName(String employeeName) {
        support.firePropertyChange("employeeName", this.employeeName, employeeName);
        this.employeeName = employeeName;
    }
}
