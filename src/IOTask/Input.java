package IOTask;

import java.util.Scanner;

public class Input {
    private static String input() {
        //   src//IOTask//Docs.txt
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of file");
        return scanner.nextLine();
    }

    public static String getInput() {
        return input();
    }

}
