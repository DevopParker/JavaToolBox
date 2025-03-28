package application;

import part1.*;

public class MOOCRunner {
    public static void main(String[] args) throws Exception {
        //Printing.applicationTitle();
        //Printing.boilerplate("Example");
        //Printing.fileStructure();
        //Printing.javaCapitalization();
        //Printing.applicationTitle();
        //Menu.runMenu();

        RestAPI api = new RestAPI();
        //String postResponse = api.createUser("John Doe");
        String getResponse = api.getUser();

        System.out.println("API Post response:");
        System.out.println(getResponse);
    }
}