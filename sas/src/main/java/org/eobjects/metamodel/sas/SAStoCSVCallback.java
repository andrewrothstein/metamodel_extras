package org.eobjects.metamodel.sas;

/**
 * Created by arothste on 4/26/15.
 */
public class SAStoCSVCallback implements SasReaderCallback {

    public SAStoCSVCallback() {}

    /**
     * Callback method that accepts a column discovered by the {@link SasReader}
     * .
     *
     * @param columnIndex
     *            the index (0-based) of the column
     * @param columnName
     *            the physical name of the column
     * @param columnLabel
     *            the logical label of the column (often more user-friendly than
     *            name)
     * @param columnType
     *            the type of the column
     * @param columnLength
     *            the length of the column
     */
    public void column(int columnIndex, String columnName, String columnLabel,
                       SasColumnType columnType, int columnLength) {

    }

    /**
     * Should the reader read the data/rows (or only columns?)
     *
     * @return true if data/rows should be read.
     */
    public boolean readData() {
        return true;
    }

    /**
     * Callback method that accepts an array of row data.
     *
     * @param rowNumber
     *            the row number (1 = first row)
     * @param rowData
     *            the row data
     * @return true if more rows should be read.
     */
    public boolean row(int rowNumber, Object[] rowData) {
        return true;
    }
}

