import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class nameFinder1 {
    public static void main(String[] args){
        nameFinder();
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
            boolean checker = true;
            for (int s = 0; s < nameLibrary.length; s++) {
                if (nameLibrary[s] != null) {
                    String[] seperatedNames = nameLibrary[s].split(" ");


                    for (int j = 0; j < seperatedNames.length; j++) {
                        // System.out.println(seperatedNames[j]);
                        if (seperatedNames[j].equals(inputName.toLowerCase())) {
                            namesWillBePrinted.add(nameLibrary[s]);
                            count++;
                            checker = false;

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
}

