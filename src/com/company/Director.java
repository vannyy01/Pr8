package com.company;

public class Director implements Worker {
    private String educationLevel;
    private String PIB;
    private int experience;
    private String department;
    private String dateOfCharge;


    public Director(String PIB, String educationLevel, int experience, String department, String dateOfCharge) {
        this.PIB = PIB;
        this.educationLevel = educationLevel;
        this.experience = experience;
        this.department = department;
        this.dateOfCharge = dateOfCharge;
    }


    @Override
    public void print() {
        System.out.println(
                "Прізвище: " + getPIB() + "->" + " освітній рівень: " + getEducationLevel() + " департамент: " + getDepartment()
                        + " дата призначення: " + getDateOfCharge()
        );
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDateOfCharge() {
        return dateOfCharge;
    }

    public void setDateOfCharge(String dateOfCharge) {
        this.dateOfCharge = dateOfCharge;
    }

    @Override
    public String getEducationLevel() {
        return educationLevel;
    }

    @Override
    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    @Override
    public String getPIB() {
        return PIB;
    }

    @Override
    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    @Override
    public int getExperience() {
        return experience;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

}
