package myFile;

import java.io.*;

public class FileOperation {

//    public static void ReadFromFile(String filename){
//        File file = new File(filename);
//        if(file.exists()) {
//            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    System.out.println(line);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    public static void copypaste(String sourcefile, String targetfile){
//        File file1 = new File(sourcefile);
//        File file2 = new File(targetfile);
//        if (file1.exists()) {
//            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
//                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    bufferedWriter.write(line);
//                    bufferedWriter.newLine();
//                }
//                System.out.println("File copied successfully.");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        else{
//            System.out.println("Does not Exists : "+sourcefile);
//        }

//    public static void countLWC(String filename){
//            int lineCount = 0;
//            int wordCount = 0;
//            int charCount = 0;
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
//            String line;
//            while((line = bufferedReader.readLine()) != null){
//                lineCount++;
//                String [] words = line.split(" ");
//                wordCount++;
//                for (String word : words) {
//                    charCount = charCount + word.length();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("LineCount : "+lineCount);
//        System.out.println("WordsCount : "+wordCount);
//        System.out.println("charCount : "+charCount);
//

        public static void countOccurance(String filename,String str){
            int count = 0;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] words = line.split(" ");
                    for (String str1 : words) {
                        if (str1.equalsIgnoreCase(str)) {
                            count++;
                        }
                    }
                }
                System.out.println("The occurrence of " + str + " is: " + count);
            } catch (FileNotFoundException e) {
                e.printStackTrace(); // or handle it as per your requirement
            } catch (IOException e) {
                e.printStackTrace(); // or handle it as per your requirement
            }
        }



}


