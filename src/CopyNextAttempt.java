import java.io.*;

public class CopyNextAttempt {
    public static File rabbitOwner = new File("Owner.txt");
    public static File rabbitThief = new File("Thief.txt");

    public static void readingFiles(File file) throws IOException {
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line= bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        System.out.println("End of file");
        fileReader.close();
        bufferedReader.close();
    }

    public static void makingOwner() throws IOException {
        FileWriter fileWriter= new FileWriter(rabbitOwner);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("I am John. These are all of my rabbits");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        for(int i=0;i<63;i++)
        {
            bufferedWriter.append("rabbit ").append(String.valueOf(i));
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        fileWriter.close();
        bufferedWriter.close();

    }

    public static void makingThief() throws IOException {
        FileReader fileReader = new FileReader(rabbitOwner);
        BufferedReader bufferedReader= new BufferedReader(fileReader);

        FileWriter fileWriter= new FileWriter(rabbitThief);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line;

        bufferedWriter.append("I am Joseph, the bunny thief. I've been to John's house. This is the list of my rabbits");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        while((line=bufferedReader.readLine())!=null)
        {
            bufferedWriter.append(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        System.out.println("Copying successful");
        fileReader.close();
        fileWriter.close();
        bufferedWriter.close();
        bufferedReader.close();

    }

    public static void main(String[] args) throws IOException {
        makingOwner();
        makingThief();
        System.out.println("Original file");
        readingFiles(rabbitOwner);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Copy");
        readingFiles(rabbitThief);
    }


}
