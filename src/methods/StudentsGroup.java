package methods;

public class StudentsGroup {
    private static final int STUDENTS_MAX_COUNT = 3;
    private Student[] students;
    private int studentsCount;

    public StudentsGroup() {
       students = new Student[STUDENTS_MAX_COUNT];
    }

    void add(Student student) {
        if(studentsCount>=STUDENTS_MAX_COUNT) {
            System.out.println();
            return;
        }
        students[studentsCount] = student;
        System.out.println("Student was added, index = " + studentsCount);
        studentsCount++;
    }

    public static void main(String[] args) {
        final StudentsGroup group= new StudentsGroup();
        group.add(new Student("Student1'"));
        group.add(new Student("Student2'"));
        group.add(new Student("Student3'"));
        group.add(new Student("Student4'"));
    }
}
