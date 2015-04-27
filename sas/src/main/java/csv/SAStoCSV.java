package csv;

import org.eobjects.metamodel.sas.SasReader;

import java.io.File;

/**
 * Created by arothste on 4/26/15.
 */
public class SAStoCSV {

    static void main(String [] args) {
        System.out.println("processing " + args[1] + "...");
        File f = new File(args[1]);
        SasReader r = new SasReader(f);
        r.read(new SAStoCSVCallback());
    }

}
