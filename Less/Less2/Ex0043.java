package Les2;

// public class Progtam {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();
//             for (int i = 0; i < 1_000_000; i++) {
//                 sb.append("+");
// }

//     }
    
// }
// операции со строками
// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

// работа с файлами 

// import java.io.File;
// public class Progtam {
//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath());
//        // /Users/sk/vscode/java_projects/file.txt
//        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
//    }
// }


// работа с файлами ошибки 
// import java.io.File;
// public class Progtam {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally
//        { System.out.println("finally"); }
//    }
// }

// import java.io.File;
// public class Program {
//    public static void main(String[] args) {
// String line = "empty";
// String pathProject = System.getProperty("user.dir");
// String pathFile = pathProject.concat("/file.txt");
// try {
//    File file = new File(pathFile);
//    if (file.createNewFile()) {
//        System.out.println("file.created"); }
//    else {
//        BufferedReader bufReader =
//        new BufferedReader(new FileReader(file));
//        System.out.println("file.existed");
//        line = bufReader.readLine();
//        bufReader.close(); }
// } catch (Exception e) {
//    //e.printStackTrace();
// } finally {
//    System.out.println(line);
// }

// }

// }

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся 
// в определенном каталоге

// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения 
// файла или каталога

// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые 
// находятся в определенном каталоге

// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// Работа с каталогами

// import java.io.File;
// public class Program {
//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathDir = pathProject.concat("/files");
//        File dir = new File(pathDir);
//        System.out.println(dir.getAbsolutePath());
//        if (dir.mkdir()) {
//            System.out.println("+");
//        } else {
//            System.out.println("-");
//        }
//        for (String fname : dir.list()) {
//            System.out.println(fname);
//        } } 
// }

// Логирование

// import java.util.logging.*;
// public class Ex0043 {
//    public static void main(String[] args) {
//        Logger logger = Logger.getLogger(Ex0043.class.getName());
//        logger.setLevel(Level.INFO);
//        ConsoleHandler ch = new ConsoleHandler();
//        logger.addHandler(ch);
//        SimpleFormatter sFormat = new SimpleFormatter();
//        ch.setFormatter(sFormat);
//        logger.log(Level.WARNING, "Тестовое логирование");
//        logger.info("Тестовое логирование");
//    }
// }

import java.util.logging.*;
public class Ex0043 {
   public static void main(String[] args) {
       Logger logger = Logger.getLogger(Ex0043.class.getName());
       logger.setLevel(Level.INFO);
       ConsoleHandler ch = new ConsoleHandler();
       logger.addHandler(ch);
       //SimpleFormatter sFormat = new SimpleFormatter();
       XMLFormatter xml = new XMLFormatter();
       //ch.setFormatter(sFormat);
       ch.setFormatter(xml);
       logger.log(Level.WARNING, "Тестовое логирование");
       logger.info("Тестовое логирование");
   }
}
