package myFile;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        File file = new File("abc.txt");
//        File file1 = new File("E:\\JavaProjects\\classwork", "abc.txt");
//        System.out.println(file.exists());
//        System.out.println(file.canWrite());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getParentFile());
//        System.out.println(file1.getParent());
//        System.out.println(file1.isFile());
//        System.out.println(file1.length());
//        System.out.println(file.getAbsoluteFile());
//
//        String[] filesInDirectory = file1.getParentFile().list();
//        if (filesInDirectory != null) {
//            for (String fileName : filesInDirectory) {
//                System.out.println(fileName);
//
//            }
//        }



        //Reading from keyboard and writing to disk file
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter;
//        try {
//            String name,choice;
//            bufferedWriter = new BufferedWriter(new FileWriter("NEWFILE",true));
//            do{
//                 System.out.println("Enter name : ");
//                 name=bufferedReader.readLine();
//                 bufferedWriter.write(name+"\n");
//                 System.out.println("Do you want to add something?\nEnter Choice : (Y/N)");
//                 choice= bufferedReader.readLine();
//            }
//            while (choice.equalsIgnoreCase("Y"));
//                bufferedWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


//        String filePath = "E:\\JavaProjects\\classwork\\NEWFILE";
//        FileOperation.ReadFromFile(filePath);

//        String sourceFile = "abc.txt";
//        String targetFile = "demo.txt";
       // FileOperation.copypaste(sourceFile, targetFile);

//        String filename="abc.txt";
//       // FileOperation.countLWC(filename);
//        String str="Akshit";


        FileOperation.countOccurance("abc.txt", "Akshit");
    }
}








