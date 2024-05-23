package operationfile;

import java.io.*;

public class DeleteF {
    public static void deleteFile(String filePath){
        File file = new File(filePath);

        if(file.exists()){
            file.delete();
            System.out.println("File deleted Successfully");
        }
        else{
            System.out.println("File does not exists");
        }

    }
    public static void rename(String filePath, String newFileName) {
        File file = new File(filePath);
        if (file.exists()) {
            File newFile = new File(file.getParent(), newFileName);
            if (file.renameTo(newFile)) {
                System.out.println("File Renamed Successfully");
            } else {
                System.out.println("Failed to rename file");
            }
        } else {
            System.out.println("File does not exist");
        }
    }
    public static void writeOnFile(Student student){
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
//            writer.write(student.getName() + "  " + student.getMarks());
//            writer.newLine();
//            System.out.println("Data written to file successfully.");
//        } catch (IOException e) {
//            System.out.println("Unsuccessful");
//        }

        //Example 2 ---------
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.txt"));
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Student readOnFile(){
        Student student=null;
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("demo.txt"));
            student = (Student)objectInputStream.readObject();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return student;
    }
}
