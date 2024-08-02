import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Bruger {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);

        System.out.println("Indtast navn: ");
        String navn = scan.nextLine();

        System.out.print("Indtast alder: ");
        int alder = scan.nextInt();

        TilFil(navn, alder);
        FraFil();

    }
    public static void TilFil(String navn, int alder) throws FileNotFoundException {
        PrintStream skriv = new PrintStream("Bruger.txt");
        skriv.println("Navn: " + navn);
        skriv.println("Alder: " + alder);
        skriv.close();
    }
    public static void FraFil() throws FileNotFoundException {
        File file = new File("Bruger.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }
        scan.close();
    }
}
