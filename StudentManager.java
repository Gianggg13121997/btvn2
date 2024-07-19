package HomeWork;

public class StudentManager {
    private Student[] students;
    private int size;

    public StudentManager() {
        this.students = new Student[10];
        this.size = 0;
    }

    public void addStudent(Student student) {
        if (size == students.length) {
            System.out.println("không thêm được học sinh nào nữa!");
        } else {
            students[size] = student;
            this.size++;
            System.out.println("Thêm thành công !");
        }
    }

    public void removeStudent(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                students[i] = students[size - 1];
                students[size - 1] = null;
                size--;
                System.out.println("xoá thành công !");
                return;
            } else {
                System.out.println("không tìm thấy sinh viên");
            }
        }
    }

    public Student findStudentById(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    public double calculateAverageScore() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + calculateAverageScore();
        }
        double sumAverage = sum / size;
        return sumAverage;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
