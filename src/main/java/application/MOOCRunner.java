package application;

import part1.*;

public class MOOCRunner {
    public static void main(String[] args) throws Exception {
        //Printing.applicationTitle();
        //Printing.boilerplate("Example");
        //Printing.fileStructure();
        //Printing.javaCapitalization();
//        Printing.applicationTitle();
//        Menu.runMenu();

        RestAPI api = new RestAPI();
        String response = api.createUser("John Doe");

        System.out.println("API Response:");
        System.out.println(response);

    }
}