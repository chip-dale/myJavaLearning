import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <pre>Создайте при помощи кода стурктуру фолдеров
 *  a
 *      b
 *          c
 *              a.txt
 *      d
 *          e
 *              b.html</pre>
 */
public class Task2 {
    public static void main(String[] args) {

        line();

        File dir = new File("a");
        //File dir = new File("src/a");

        File dir1 = new File(dir,"b/c");
        File f1 = new File(dir1,"a.txt");
        File dir2 = new File(dir,"d/e");
        File f2 = new File(dir2,"b.html");

        if(dir1.mkdirs() && dir2.mkdirs()) {
            System.out.printf("Directories \"%s\" & \"%s\" are created\n", dir1.getPath(), dir2.getPath());
        } else {
            System.out.printf("Directories \"%s\" & \"%s\" cannot be created\n", dir1.getPath(), dir2.getPath());
        }

        line();
        line();

        try {
            if(f1.createNewFile() && f2.createNewFile()) {
                System.out.printf("Files \"%s\" & \"%s\" are created\n", f1.getName(), f2.getName());
            } else {
                System.out.printf("Files \"%s\" & \"%s\" cannot be created\n", f1.getName(), f2.getName());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        line();

        String text1 = "Hello World!";
        String text2 = "<!DOCTYPE html>\n\n" +
                "<html>\n" +
                "\t<head>\n" +
                "\t\t<title>My Java Learning</title>\n" +
                "\t</head>\n\n" +
                "\t<body>\n" +
                "\t\t<h1>Hello World!</h1>\n" +
                "\t\t<p>Lorem ipsum</p>\n" +
                "\t\t<div>blablabla</div>\n" +
                "\t</body>\n" +
                "</html>";

        try (FileWriter wr1 = new FileWriter(f1,false)) {
            wr1.write(text1);
            wr1.append('\n');
            wr1.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter wr2 = new FileWriter(f2,false)) {
            wr2.write(text2);
            wr2.append('\n');
            wr2.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        line();

        try (FileReader r1 = new FileReader(f1)) {
            if(f1.exists()) {
                System.out.printf("\tFile \"%s\" exists:\n", f1.getName());
            } else {
                System.out.printf("\tFile \"%s\" not found!\n", f1.getName());
            }

            int c;
            while((c = r1.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        line();
        line();

        try (FileReader r2 = new FileReader(f2)) {
            if(f2.exists()) {
                System.out.printf("\tFile \"%s\" exists:\n", f2.getName());
            } else {
                System.out.printf("\tFile \"%s\" not found!\n", f2.getName());
            }

            int c;
            while((c = r2.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        line();
        line();

        if(dir.delete()) {
            System.out.println("Folder \"" + dir.getName() + "\" has been deleted");
        } else {
            System.out.println("Folder \"" + dir.getName() + "\" cannot be deleted, " +
                    "because it is not empty!");
        }

        line();

    }
    public static void line() {
        for (int i = 0; i < 50; i++) {
            System.out.print('-');
        }
        System.out.println();
    }
}
