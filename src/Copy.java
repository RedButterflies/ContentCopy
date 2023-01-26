import java.io.*;

public class Copy {
    public static File original = new File("Original.txt");
    public static File copy = new File("copy.txt");

    public static void makingTheOriginal() throws IOException {
        FileWriter fileWriter = new FileWriter(original);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.append("山暝听猿愁，沧江急夜流。\n" +
                "风鸣两岸叶，月照一孤舟");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        fileWriter.close();
        bufferedWriter.close();


    }
    public static void copy() throws IOException {
        FileReader fileReader = new FileReader(original);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        FileWriter fileWriter= new FileWriter(copy);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            bufferedWriter.append(line).append("<3");
            bufferedWriter.newLine();
            bufferedWriter.flush();

        }
        System.out.println("Copying success");
        bufferedWriter.close();
        bufferedReader.close();


    }
    public static void reader(File file) throws IOException {
        FileReader fileReader= new FileReader(file);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            System.out.println(line);
        }
        System.out.println("End of file");

    }

    public static void main(String[] args) throws IOException {
        makingTheOriginal();
        System.out.println("The original");
        reader(original);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("The copy");
        copy();
        reader(copy);
    }
}
