package org.application;

import org.application.fifthTask.ListComparator;
import org.application.firstTask.Development;
import org.application.secondTask.DateComparator;
import org.application.thirdTask.Student;

public class App {

    public static void main( String[] args ) {

        while (true) {

            Integer navigationVar = MyInput.inputInteger("""
                    Navigation menu:
                    Enter 1 to run first subtask.
                    Enter 2 to run second subtask.
                    Enter 3 to run third subtask.
                    Enter 4 to run fifth subtask;
                    Enter any other digit to stop the program.""", Integer::valueOf);

            switch (navigationVar) {
                case 1: {
                    Development development = new Development();
                    development.getDevelopmentInfo();
                    break;
                }
                case 2: {
                    DateComparator dateComparator = new DateComparator();
                    dateComparator.setEnteredDate();
                    dateComparator.compareData();
                    break;
                }
                case 3: {
                    Student student = new Student();
                    student.setDateFormatter();
                    System.out.println(student);
                    break;
                }
                case 4: {
                    ListComparator listComparator = new ListComparator();
                    System.out.println("The result in insertion: " + listComparator.compareInsertion());
                    System.out.println("The result in deletion: " + listComparator.compareDeletion());
                    System.out.println("The result in search: " + listComparator.compareSearch());
                    break;
                }
                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
