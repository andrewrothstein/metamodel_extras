package csv;

import org.eobjects.metamodel.sas.SasReader;

import java.io.File;

/**
 * Created by arothste on 4/26/15.
 */
public class SAStoCSV {

    public static void main(String [] args) {
        for (String arg : args) {
            System.out.println("arg: " + arg);
        }
        System.out.println("processing " + args[0] + "...");
        File f = new File(args[0]);
        SasReader r = new SasReader(f);
        r.read(new SAStoCSVCallback());
    }

}
