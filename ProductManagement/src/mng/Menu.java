/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mng;

import java.util.ArrayList;
import java.util.Scanner;
import tools.MyTool;

/**
 *
 * @author VU HONG ANH
 */
public class Menu extends ArrayList<String> {

    public static final String CHOICE_FORMAT = "\\d{1}";

    public Menu() {
        super();
    }

    public Menu(String[] options) {
        for (String o : options) {
            this.add(o);
        }
    }

    public int getChoice(String title) {

        String inputString;
        int choice = 0;
        boolean valid = false;
        MyTool.SC = new Scanner(System.in);
        do {
            System.out.println(title);
            for (int i = 0; i < this.size(); i++) {
                System.out.println("   " + (i + 1) + "-" + this.get(i));
            }
            System.out.println("   Others-Exit");
            System.out.print("Choose [1..7]: ");

            inputString = MyTool.SC.nextLine();
            if (inputString.matches(CHOICE_FORMAT)) {
                choice = Integer.parseInt(inputString);
                valid = true;
            } else {
                System.out.println("Invalid choice, try again");
                valid = false;
            }
        } while (valid == false);
        return choice;

    }
}
