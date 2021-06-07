import java.io.*;

public class Echo2 {
    public static void main(String[] args) throws IOException{
        DataInputStream inConsola = new DataInputStream(new BufferedInputStream(System.in));

        DataOutputStream outConsola = new DataOutputStream(System.out);

        String sirCitit;
        outConsola.writeBytes("Pentru oprire introduceti '.' si <Enter> \n");
        outConsola.flush();

        while(true){
            outConsola.writeBytes("\n?>");
            outConsola.flush();


            sirCitit = inConsola.readLine();
            if(sirCitit.equals(("."))) break;
            outConsola.writeBytes("!>" + sirCitit + "\n");

            outConsola.flush();
        }

    }
}
