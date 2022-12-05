// import java.io.BufferedReader;
import java.io.File;
// import java.io.FileReader;
import java.io.FileWriter;

public class Program {
   /**
 * @param args
 */
public static void main(String[] args) {
   
//     String line = "empty";
   
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file_list.txt"); 
//             File file = new File(pathFile);
//             if (file.createNewFile()) {
//                 System.out.println("file.created"); }
//             else {
//                     BufferedReader bufReader = new BufferedReader(new FileReader(file));
//                     System.out.println("file.existed");
//                     line = bufReader.readLine();
//                     bufReader.close(); }
// }       catch (Exception e) {
//                     //e.printStackTrace();
// }       finally {
//                System.out.println(line);

   



File dir = new File(".");
File [] fileList = dir.listFiles();

    for (File file : fileList) {
    if (file.isFile()){
        System.out.printf("   %s\n", file.getName());
    }
    else System.out.println(file.getName());


try
    (FileWriter fw = new FileWriter("file.txt", false)) {
        for (File f : fileList) {
            fw.write(f.toString());
            fw.write("\n");    
        }  
              
        }
           
    catch (Exception e){}
    finally {
        System.out.println();
    }

}

}

}     
     
        


    

