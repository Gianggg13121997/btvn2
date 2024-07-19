package HomeWork;

import org.w3c.dom.ls.LSOutput;

public class Student {

    private int id;
    private String name;
    private int[] score;
    private String gender;


    public Student(int id, String name, int[] score, String gender) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double calculateAverageScore() {
        if (score.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        double Average = sum / score.length;
        return Average;
    }

    public void printStudentInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.print("Scores: ");
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + " ");
        }

    }

}



