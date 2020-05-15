package org.launchcode.studio7;

public abstract class BaseDisc {
    public String name;
    public double capacity;
    public String type;

    public BaseDisc(String aName, double aCapacity){
        this.name = aName;
        this.capacity = aCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
