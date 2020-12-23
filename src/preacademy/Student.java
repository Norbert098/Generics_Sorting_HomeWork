package preacademy;
public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int quizzPoints;
    private int tasksPoints;
    private int lectureActivityPoints;
    private int totalPoints;

    public Student(String name, String surname, int quizzPoints, int tasksPoints, int lectureActivityPoints, int totalPoints) {
        this.name = name;
        this.surname = surname;
        this.quizzPoints = quizzPoints;
        this.tasksPoints = tasksPoints;
        this.lectureActivityPoints = lectureActivityPoints;
        this.totalPoints = quizzPoints + tasksPoints + lectureActivityPoints;
    }

    public int getQuizzPoints() {
        return quizzPoints;
    }

    public int getTasksPoints() {
        return tasksPoints;
    }

    public int getLectureActivityPoints() {
        return lectureActivityPoints;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", quizzPoints=" + quizzPoints +
                ", tasksPoints=" + tasksPoints +
                ", lectureActivityPoints=" + lectureActivityPoints +
                ", totalPoints=" + totalPoints +
                '}';
    }

//    //Ascending Order
//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.totalPoints, o.totalPoints);
//    }

    //Descending Order
    @Override
     public int compareTo(Student o) {
        return -1*Integer.compare(this.totalPoints, o.totalPoints);
     }
}
