import java.io.*;

// Ecou consola folosind BufferedReader si PrintStream

public class Echo {
    public static void main(String[] args) throws IOException{
        BufferedReader inConsola = new BufferedReader(new InputStreamReader(System.in));

        PrintStream outConsola = System.out;
        outConsola.println("\nPentru terminare introduceti '.' si <Enter>");

        while (true){
            outConsola.print("\n?> ");

            String sirCitit = inConsola.readLine();

            if(sirCitit.equals(("."))) break;

            outConsola.println("!>" + sirCitit);
        }
    }
}
