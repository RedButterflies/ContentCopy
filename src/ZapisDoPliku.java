import java.io.*;

public class ZapisDoPliku {
    public static File read = new File("Plik.txt");
    public static String zapisDoPliku() throws IOException {
        String nazwaPliku = "Plik.txt";
        File file = new File(nazwaPliku);
        FileWriter fileWriter= new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append("A Gift to Meng Haoran on Departing for Yangzhou\n" +
                "\n" +
                "Old friend departing from the West,\n" +
                "Beneath the Yellow Crane Tower.\n" +
                "Sail on to Yangzhou!\n" +
                "In the morning mist and springtime flowers.\n" +
                "\n" +
                "Your lonely boat is now a distant thing,\n" +
                "That sails where blue skies go.\n" +
                "And, I shall look upon the waves,\n" +
                "Unto the end they flow.");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
        fileWriter.close();
        return nazwaPliku;

    }
    public static void odczytZPliku(String nazwa) throws IOException {
        FileReader fileReader= new FileReader(nazwa);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
        System.out.println("Odczyt z pliku");
        
        while((line=bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        fileReader.close();
        bufferedReader.close();

    }

    public static String kopiaPliku() throws IOException {
        String nazwa = "kopiaPliku.txt";
        File plik = new File(nazwa);
        FileWriter fileWriter= new FileWriter(plik);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        FileReader fileReader= new FileReader("Plik.txt");
        BufferedReader  bufferedReader= new BufferedReader(fileReader);

        while((line=bufferedReader.readLine())!=null)
        {
            bufferedWriter.append(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        //System.out.println("Plik zostal skopiowany");
        fileWriter.close();
        fileReader.close();
        bufferedWriter.close();
        bufferedReader.close();
        return nazwa;

    }

    public static void main(String[] args) throws IOException {
        ZapisDoPliku.zapisDoPliku();
        ZapisDoPliku.odczytZPliku(ZapisDoPliku.zapisDoPliku());
        ZapisDoPliku.kopiaPliku();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Kopia pliku");
        ZapisDoPliku.odczytZPliku(ZapisDoPliku.kopiaPliku());

    }

}
