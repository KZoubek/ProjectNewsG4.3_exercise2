package at.ac.fhcampuswien.ui;

import at.ac.fhcampuswien.controllers.AppController;

import java.util.Scanner;

public class Menu {
    private static final String INVALID_INPUT_MESSAGE = "No valid input. Try again";
    private static final String EXIT_MESSAGE = "Bye bye!";
    private AppController controller;

    public void start(){
        String input;
        controller = new AppController();

        do{
            printMenu();
            input = readLine();
            handleInput(input);
        } while(!input.equals("q"));

    }

    private void handleInput(String input){
        switch (input) {
            case "a" -> getTopHeadlinesAustria(controller);
            case "b" -> getAllNewsBitcoin(controller);
            case "q" -> printExitMessage();
            default -> printInvalidInputMessage();
        }
    }


    private void getTopHeadlinesAustria(AppController controller) {
        System.out.println(controller.getTopHeadlinesAustria());
    }

    private void getAllNewsBitcoin(AppController controller) {
        System.out.println(controller.getAllNewsBitcoin());
    }

    public static void printExitMessage(){
        System.out.println(EXIT_MESSAGE);
    }

    public static void printInvalidInputMessage(){
        System.out.println(INVALID_INPUT_MESSAGE);
    }

    private static void printMenu(){
        System.out.println(getMenuText());
    }

    private static String getMenuText(){
        return """
                *****************************
                *   Welcome to NewsApp   *
                *****************************
                Enter what you wanna do:
                a: Get top headlines austria
                b: Get all news about bitcoin
                y: Count articles
                q: Quit program""";
    }

    private static String readLine() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value.trim();
    }

}
