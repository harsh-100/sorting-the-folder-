import java.io.*;
import java.io.File;
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
public class opendirectory {
    private static boolean bool;

    public static void main(String[]args){
     File directory = new File("C:/Users/Lenovo/Downloads/books");

    // list all files present in the directory
    File[] files = directory.listFiles();
    System.out.println("Files\t\t\tExtension");

    for(File file : files) {
      // convert the file name into string
      String fileName = file.toString();

      int index = fileName.lastIndexOf('.');
      if(index > 0) {
        String extension = fileName.substring(index + 1);
        System.out.println("\t\t\t" + extension);
        }

        //creating the new folder  
        
        String extension = fileName.substring(index + 1);
        if (extension.equals("pdf"))
        {   System.out.println("cursor reached1");
          File f1= new File("C:/Users/Lenovo/Downloads/books/"+extension);
          boolean bool =  f1.mkdir();
          System.out.println("cursor reached2");
                
              if (bool){
                  System.out.println("Successful");
              }
              else {
                  System.out.println("Unsuccessful");
        }
      }

}
//   System.out.println("Enter the path For the file : ");
  /*Scanner sc = new Scanner(System.in);

  System.out.println("Enter the name of the desired Directory : ");
  String path=  sc.next();

  //creating a new file 
  File f1 = new File("C:/Users/Lenovo/Downloads/books/"+path);
  boolean bool = f1.mkdir();

  if(bool){
      System.out.println("Successful");
  }
  else {
      System.out.println("Not created");
  } */
  //moving the files 

  /*String fromFile = "C:/Users/Lenovo/Downloads/check zip/tsconfig.json";
  String path;
  String toFile = "C:/Users/Lenovo/Downloads/books/"+path;
  Path source = Paths.get(fromFile);
  Path target = Paths.get(toFile);
  try {
      //Files.copy(source, target);
      Files.move(source, target,REPLACE_EXISTING);
  }
  catch(IOException e) {
    e.printStackTrace();

  } */

}
}
