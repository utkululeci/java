


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class namefinder {
    static boolean checker = false;
    static boolean continuechecker = true;
    static boolean addornotchecker = true;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        do{
            nameFinder();
            if (checker == true){
                checker = false;
                continueSearching();
            } else if (checker == false) {
                addornot();
                continueSearching();
            }

        }while(continuechecker == true);
    }
    public static void nameFinder() {
        File names = new File("\\C:\\Users\\USER\\git\\namefinder\\namedatabase.txt\\");
        try {
            String[] nameLibrary = new String[15];
            Scanner sc = new Scanner(names);
            int i = 0;
            while (sc.hasNextLine()) {
                nameLibrary[i] = sc.nextLine();
                i++;

            }
            Scanner sca = new Scanner(System.in);


            System.out.println("Enter a name:");
            String inputName = sca.nextLine();
            int count = 0;
            ArrayList<String> namesWillBePrinted = new ArrayList<>();

            for (int s = 0; s < nameLibrary.length; s++) {
                if (nameLibrary[s] != null) {
                    String[] seperatedNames = nameLibrary[s].split(" ");


                    for (int j = 0; j < seperatedNames.length; j++) {
                        // System.out.println(seperatedNames[j]);
                        if (seperatedNames[j].equals(inputName.toLowerCase())) {
                            namesWillBePrinted.add(nameLibrary[s]);
                            count++;
                            checker = true;

                        }
                    }


                }

            }


            Collections.sort(namesWillBePrinted);


            for (int j = 0; j < count; j++) {
                System.out.println(namesWillBePrinted.get(j));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File Could Not Found!");
        }

    }

    public static void continueSearching(){

        System.out.println("Do you want to continue searching? y/n");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine().toLowerCase();
        int insidechecker = 0;

        do{
            if(answer.equals("y")){
                continuechecker = (true);
                insidechecker = 1;
            }else if(answer.equals("n")){
                System.out.println("Goodbye!");
                continuechecker = false;
                insidechecker = 1;
            }else{
                System.out.println("Use n or y for an answer!");
                System.out.println("Do you want to continue searching? y/n");
                answer = sc.nextLine().toLowerCase();
            }
        }while(insidechecker == 0);


    }

    public static void addornot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name could not found in the database!");
        System.out.println("Do you want to add it? y/n");
        String answer = sc.nextLine().toLowerCase();
        int addinsidechecker = 0;
        do{
            if(answer.equals("y")){
                addornotchecker = true;
                addinsidechecker = 1;
            }else if(answer.equals("n")){

                addornotchecker = false;
                addinsidechecker = 1;
            }else{
            System.out.println("Use n or y for an answer!");
            System.out.println("Do you want to add it? y/n");
            answer = sc.nextLine().toLowerCase();
            }
        }while(addinsidechecker == 0);

}
    public static void adder(){

    }
}
