package mycomparators;

import preacademy.Student;

import java.util.Comparator;

public class Quizz implements Comparator<Student> {
    @Override
    public int compare(Student student, Student anotherStudent) {
            if (student.getQuizzPoints() > anotherStudent.getQuizzPoints()) {
                return +1;
            }
            if (student.getQuizzPoints() < anotherStudent.getQuizzPoints()) {
                return -1;
            }
        return 0;
    }
}
