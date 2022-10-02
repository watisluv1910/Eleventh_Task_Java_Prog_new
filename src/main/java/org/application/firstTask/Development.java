package org.application.firstTask;

import org.application.MyInput;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Development {

    private String name, surname;

    Date startDate;

    public Development() {
        startDate = new Date();

        this.name = MyInput.inputString("Enter the developer's name:", v -> v);
        this.surname = MyInput.inputString("Enter the developer's surname:", v -> v);
    }

    public void getDevelopmentInfo() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        System.out.println("The developer's name is: " + name);
        System.out.println("The developer's surname is: " + surname);
        System.out.println("The development start date is: " + dateFormatter.format(startDate));
        System.out.println("The development end date is: " + dateFormatter.format(new Date()));
    }
}
