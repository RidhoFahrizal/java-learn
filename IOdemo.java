import java.io.*;
public class IOdemo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter("output.txt");

            System.out.println("Masukkan Text:");
            String Input = reader.readLine();

            writer.write(Input);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
