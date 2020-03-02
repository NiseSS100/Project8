package fmi.informatics.hw8;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Data students = new Data();
        System.out.println("Изберете: 1(възходящ ред) или 2(низходящ ред):");
        Scanner chooseNumber = new Scanner(System.in);
        int number = chooseNumber.nextInt();
        switch (number){
            case 1:
                System.out.println("Студентите биват сортирани по възходяш ред:");
                students.sortAB();
                break;
            case 2:
                System.out.println("Студентите биват сортирани по низходящ ред:");
                students.sortBA();
                break;
            default:
                System.out.println("Въведете 1 или 2");
        }
    }
}
