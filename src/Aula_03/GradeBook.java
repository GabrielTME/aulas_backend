package Aula_03;

import java.util.Scanner;

public class GradeBook {
    private String courseName;

    public GradeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do curso: ");
        String input = scanner.nextLine();
        this.courseName = input;
    }

    public void showMessage() {
        System.out.printf("Nome do curso: " + courseName);
    }

}
