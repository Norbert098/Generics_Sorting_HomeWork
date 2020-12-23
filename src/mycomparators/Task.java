package mycomparators;

import preacademy.Student;

import java.util.Comparator;

public class Task implements Comparator<Student> {
    @Override
    public int compare(Student student, Student anotherStudent) {
        if (student.getTasksPoints() > anotherStudent.getTasksPoints()) {
            return +1;
        }
        if (student.getTasksPoints() < anotherStudent.getTasksPoints()) {
            return -1;
        }
        return 0;
    }
}
