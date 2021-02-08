import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Matrix {

    public static void main(String[] args) {

        Matrix.loadMatrix("matrix1.txt");
    }
    // laedt eine Matrix aus einer Datei
    public static void loadMatrix(String filename){
        try {
        File myObj = new File(filename);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
