import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

import java.util.Scanner; //only for tests
/**
  * @author Viberti Kim <vibertikim@yahoo.it>
  * @since 2019/07/18
  * This class is responsable for saving and reading objects in-from given file names
  */
public class FileMG {
    private String file_name;
    //Constructors----------------------------------------------------------------------------------
    public FileMG(String file_name) {
        /*
         * Maybe here we can check if the file exists and save it in a boolean attribute
         */
    }
    //set() & get()---------------------------------------------------------------------------------

    //Methods---------------------------------------------------------------------------------------
    /*
     * public boolean open_reading_stream() {}
     * public boolean close_reading_stream() {}
     * public boolean open_writing_stream() {}
     * public boolean close_writing_stream() {}
     * public Object read()
     * public Object read_and_close()
     * public boolean write(<T extends Serializable> object) {} //generico vincolato
     * public boolean write_and_close(<T extends Serializable> object) {} //generico vincolato
     * capire come fare per interagire con file con un path diverso dal working place in cui avviene l'esecuzione
     */
    //Utility----------------------------------------------------------------------------------------

    //----------------------------------------------------------------------------------------------
}

class FileMGDemo {
    public static void pause() {
        Scanner t = new Scanner(System.in);

        System.out.print("...enter to continue...");
        t.nextLine();
    }

    public static void test01() {
        String file_name = "prova.txt";
        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(file_name));
        } catch(Exception e) {System.out.println("Errore nell'apertura del file " + file_name);}
    }

    public static void main(String[] args) {
        test01();
        System.out.println("Fine programma");
    }
}
