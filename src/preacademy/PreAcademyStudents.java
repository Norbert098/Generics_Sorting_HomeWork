package preacademy;
import mycomparators.LectureActivity;
import mycomparators.Quizz;
import mycomparators.Task;
import myutility.MyUtils;

import java.util.*;

/**
 * Hi ! This HomeWork was done by me according to the deadline: 21.12.2020
 * I do not improve it later. But, I am planning to add tests and choices like asc/de-scending order
 * Regards,
 * N.
 * (PS. @Tomasz -> I don't know if we have sth in common by a common surname :P,
 *  But i hope it will be common passion to Java :) )
 *
 */

public class PreAcademyStudents {
    public static void main(String[] args) {

        Student Grażka = new Student("Grażka", "Zwyczajna", 1, 3 , 4, 15);
        Student Zbigniew = new Student("Zbigniew", "Stonoga", 1, 5 , 2, 15);
        Student Januszex = new Student("Janusz", "Januszex", 4, 4, 0, 15);
        Student Baska = new Student("Baska", "Bajek", 4, 4, 4, 15);
        Student Leszek = new Student("Leszek", "Pospolitus", 2, 3, 4, 15);
        Student Angelika = new Student("Angelika", "Nomad", 5, 5, 5, 15);

        List<Student> listOfPreAcademyStudents = new ArrayList<>();

        listOfPreAcademyStudents.add(Grażka);
        listOfPreAcademyStudents.add(Zbigniew);
        listOfPreAcademyStudents.add(Januszex);
        listOfPreAcademyStudents.add(Baska);
        listOfPreAcademyStudents.add(Leszek);
        listOfPreAcademyStudents.add(Angelika);

        System.out.println("Total Per Points: ");
        Collections.sort(listOfPreAcademyStudents); //Comparable
        MyUtils.iterateListOfPreStudents(listOfPreAcademyStudents);

        System.out.println("Total Per Quizzes: ");
        Collections.sort(listOfPreAcademyStudents, new Quizz().reversed()); //Comparator
        MyUtils.iterateListOfPreStudents(listOfPreAcademyStudents);

        System.out.println("Total Per Tasks: ");
        Collections.sort(listOfPreAcademyStudents, new Task().reversed()); //Comparator
        MyUtils.iterateListOfPreStudents(listOfPreAcademyStudents);

        System.out.println("Total Per LectureActivity: ");
        Collections.sort(listOfPreAcademyStudents, new LectureActivity().reversed()); //Comparator
        MyUtils.iterateListOfPreStudents(listOfPreAcademyStudents);

    }
}
