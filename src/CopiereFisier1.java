import java.io.*;

public class CopiereFisier1 {
    public static void main(String[] args) throws IOException{
        System.out.printf("\nProgramul CopiereFisier a fost lansat...\n");

        BufferedReader inConsola=new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Introduceti numele fisierului de copiat: ");
        String numeFisier = inConsola.readLine();

        BufferedReader inFisier = null;

        try{
            inFisier = new BufferedReader(new FileReader(numeFisier));
        }
        catch (FileNotFoundException ex) {
            System.out.printf("Fisierul nu exista in acest director");
            System.exit(0);
        }

        numeFisier = "Copie_" + numeFisier;

        PrintWriter outFisier = new PrintWriter(new FileWriter(numeFisier));

        String linieText;
        while ((linieText = inFisier.readLine())!= null){
            outFisier.println(linieText);
            outFisier.flush();
        }
        inFisier.close();
        outFisier.close();
    }
}