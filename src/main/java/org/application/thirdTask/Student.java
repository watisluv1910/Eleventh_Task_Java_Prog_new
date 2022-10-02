package org.application.thirdTask;

import org.application.MyInput;
import org.application.firstTask.Development;
import org.application.secondTask.DateComparator;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {

    private String name, surname, specialization;
    private Integer course, group, points;

    private Calendar birthDate;

    SimpleDateFormat dateFormatter;

    public Student() {
        this.setName(MyInput.inputString("Enter the student name:", v -> v));
        this.setSurname(MyInput.inputString("Enter the student surname:", v -> v));
        this.setSpecialization(MyInput.inputString("Enter the student specialization:", v -> v));
        this.setPoints(MyInput.inputInteger("Enter the student points:", Integer::valueOf));
        this.setCourse(MyInput.inputInteger("Enter the student course:", Integer::valueOf));
        this.setGroup(MyInput.inputInteger("Enter the student group:", Integer::valueOf));
        this.setBirthDate();
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public void setBirthDate() {
        int year = MyInput.inputInteger("Enter the year of student's birth", Integer::valueOf);
        int month = MyInput.inputInteger("Enter the month of student's birth", Integer::valueOf);
        int day = MyInput.inputInteger("Enter the day of student's birth", Integer::valueOf);

        birthDate = Calendar.getInstance();
        birthDate.set(year, month - 1, day);
    }

    public void setDateFormatter() {
        Integer subNavigationVar = MyInput.inputInteger("""
                    Enter 1 to choose short date format.
                    Enter 2 to choose average date format.
                    Enter 3 to choose long date format.
                    Enter any other digit to stop the program.""", Integer::valueOf);

        switch (subNavigationVar) {
            case 1: {
                dateFormatter = new SimpleDateFormat("y-M-d");
                break;
            }
            case 2: {
                dateFormatter = new SimpleDateFormat("yyyy.MM.dd");
                break;
            }
            case 3: {
                dateFormatter = new SimpleDateFormat("MMMM d, yyyy");
                break;
            }
            default:
                dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
                break;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", points=" + points +
                ", birthday=" + dateFormatter.format(birthDate.getTime()) +
                '}';
    }
}
