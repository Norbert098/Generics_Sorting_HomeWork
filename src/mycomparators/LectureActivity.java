package mycomparators;

import preacademy.Student;

import java.util.Comparator;

public class LectureActivity implements Comparator<Student> {
    @Override
    public int compare(Student student, Student anotherStudent) {
        if (student.getLectureActivityPoints() > anotherStudent.getLectureActivityPoints()) {
            return +1;
        }
        if (student.getLectureActivityPoints() < anotherStudent.getLectureActivityPoints()) {
            return -1;
        }
        return 0;
    }
}
