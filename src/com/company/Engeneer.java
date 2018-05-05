package com.company;

public class Engeneer implements Worker {
    private String educationLevel;
    private String PIB;
    private int experience;
    private int level;
    private int workPlaceNumber;


    public Engeneer(String PIB, String educationLevel, int experience, int level, int workPlaceNumber) {
        this.PIB = PIB;
        this.educationLevel = educationLevel;
        this.experience = experience;
        this.level = level;
        this.workPlaceNumber = workPlaceNumber;
    }


    @Override
    public void print() {
        System.out.println(
                "Прізвище: " + getPIB() + "->" + " освітній рівень: " + getEducationLevel() + " рівень: " + getLevel()
                        + " номер робочого місця: " + getWorkPlaceNumber()
        );
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getWorkPlaceNumber() {
        return workPlaceNumber;
    }

    public void setWorkPlaceNumber(int workPlaceNumber) {
        this.workPlaceNumber = workPlaceNumber;
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
