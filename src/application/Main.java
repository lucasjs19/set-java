package application;

import entities.Student;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("How many students for course A? ");
        n = sc.nextInt();
        Set<Student> setA = new TreeSet<>();
        for (int i=0; i<n;i++){
            int userId = sc.nextInt();
            setA.add(new Student(userId));
        }
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        Set<Student> setB = new TreeSet<>();
        for (int i=0; i<n;i++){
            int userId = sc.nextInt();
            setB.add(new Student(userId));
        }
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        Set<Student> setC = new TreeSet<>();
        for (int i=0; i<n;i++){
            int userId = sc.nextInt();
            setC.add(new Student(userId));
        }

        Set<Student> setFinal = new TreeSet<>(setA);
        setFinal.addAll(setB);
        setFinal.addAll(setC);
        System.out.println("Total students: " + setFinal.size());
    }
}