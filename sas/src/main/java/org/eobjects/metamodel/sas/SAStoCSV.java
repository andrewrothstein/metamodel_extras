package org.eobjects.metamodel.sas;

import java.io.File;

/**
 * Created by arothste on 4/26/15.
 */
public class SAStoCSV {

    static void main(String [] args) {
        File f = new File(args[1]);
        SasReader r = new SasReader(f);
        r.read(new SAStoCSVCallback());
    }

}
