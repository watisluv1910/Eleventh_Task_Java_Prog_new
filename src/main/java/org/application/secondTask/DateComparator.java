package org.application.secondTask;

import org.application.MyInput;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateComparator {

    private Date initialDate , enteredDate;

    public DateComparator() {
        initialDate = new Date();
    }

    public void setEnteredDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(initialDate);

        int year = MyInput.inputInteger("Enter the year:", Integer::valueOf);
        int month = MyInput.inputInteger("Enter the month:", Integer::valueOf); // 0 to 11
        int day = MyInput.inputInteger("Enter the day:", Integer::valueOf);

        calendar.set(year, month, day);
        enteredDate = calendar.getTime();
    }

    public void compareData() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        System.out.println("Current time is: " + dateFormatter.format(initialDate));
        System.out.println("Entered time is: " + dateFormatter.format(enteredDate));

        if (initialDate.compareTo(enteredDate) == 1) {
            System.out.println("Entered date is lower than current.");
        } else if (initialDate.compareTo(enteredDate) == -1) {
            System.out.println("Entered date is higher than current.");
        } else {
            System.out.println("Entered date is equal to current");
        }
    }
}
