package TASK_02_03;

import TASK_01.Student;

import java.util.Scanner;

/**
 * Created by Роман on 06.11.2017.
 */
public class Main {

    public static void main(String[] args) {

        Resricted resricted = new Resricted();
        resricted.add(String.class);
        resricted.add(Student.class);

        Stack stack = new Stack();
        stack.printSelf();

        stack.setResricted(resricted);

        stack.add("Qwerty");
        stack.add(12345);
        stack.add(new Stack());
        stack.add(true);
        stack.add(new Student());
        stack.add(new Scanner(System.in));

        stack.printSelf();

        Object item = stack.getCell();
        System.out.println(item.getClass() + "\t\t" + item.toString());

        stack.remove();
        stack.remove();
        stack.remove();
        stack.printSelf();

        stack.remove();
        stack.remove();
        stack.printSelf();

        stack.remove();
    }
}
