package TASK_01;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Роман on 15.10.2017.
 */
public class Main {
    public static void main(String[] args) throws NoSpace, IOException {
        Group group = new Group();
        Student student = new Student();
        student.setName("Ira");
        group.addStudent(student);

        student = new Student();
        student.setName("Denis");
        group.addStudent(student);

        student = new Student();
        student.setName("Ivan");
        group.addStudent(student);

        student = new Student();
        student.setName("Roman");
        group.addStudent(student);

        student = new Student();
        student.setName("Nikolai");
        group.addStudent(student);

        student = new Student();
        student.setName("Sveta");
        group.addStudent(student);

        student = new Student();
        student.setName("Alla");
        group.addStudent(student);

        student = new Student();
        student.setName("Evgen");
        group.addStudent(student);

        student = new Student();
        student.setName("Vova");
        group.addStudent(student);

        boolean exited = false;
        String input = null;
        Scanner s = new Scanner(System.in);
        while (!exited) {
            System.out.println("\nCommands:");
            System.out.println("1 - Add Student");
            System.out.println("2 - Remove Student");
            System.out.println("3 - Search Student");
            System.out.println("4 - Print Group");
            System.out.println("5 - Print Group alphabetically");
            System.out.println("6 - Sort group by name");
            System.out.println("7 - Sort group by marks");
            System.out.println("8 - Get list of 18+");
            System.out.println("9 - Print Group to File");
            System.out.println("+ - Read Group from File");
            System.out.println("q - Serialize Group");
            System.out.println("w - Deserialize Group");
            System.out.println("0 - Exit program.\n");

            System.out.print("Input command: ");
            input = s.next();

            switch (input.charAt(0)) {
                case '0':
                    System.out.println("Exited.");
                    exited = true;
                    break;
                case '1':
                    try {
                        group.addStudent(new Student(true));
                    } catch (NoSpace e) {
                        System.out.println(e.getMessage());
                        //e.printStackTrace();
                    }
                    break;
                case '2':
                    System.out.print("Input Student number: ");
                    group.removeStudent(Integer.parseInt(s.next()));
                    break;
                case '3':
                    System.out.print("Input stdent's name: ");
                    int i = group.searchStudent(s.next());
                    System.out.println("Student number is " + i);
                    break;
                case '4':
                    group.printSelf();
                    break;
                case '5':
                    group.selfPrintAlph();
                    break;
                case '6':
                    group.sort("name");
                    break;
                case '7':
                    group.sort("mark");
                    break;
                case '8':
                    group.printSelf(group.get18());
                    break;
                case '9':
                    group.writeToFile();
                    break;
                case '+':
                    group.readFromFile();
                    break;
                case 'q':
                    System.out.print("Input file name: ");
                    group.serialize(s.next());
                    break;
                case 'w':
                    System.out.print("Input file name: ");
                    group.deserialize(s.next());
                    break;
                default:
                    System.out.println("INVALID COMMAND!");
                    break;
            }
        }
    }

}
