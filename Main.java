package HomeWork;

public class Main {
    public static void main(String[] args) {
       int[] score1 = {5,7,7};
       Student student1 = new Student(1,"Giang",score1,"nam");
       int[] score2 = {5,7,10};
       Student student2 = new Student(2,"A",score2,"nam");
       int[] score3 = {7,7,5};
       Student student3 = new Student(3,"B",score3,"nam");
        System.out.println("thông tin học sinh :");
        student1.printStudentInfo();
        System.out.println("điểm trung bình của học sinh 1 :");
        System.out.println(student1.calculateAverageScore());


    }
}
