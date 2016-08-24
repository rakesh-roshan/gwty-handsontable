package com.gwidgets.api.handsontable;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.gwidgets.api.handsontable.options.HandsontableOptions;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Handsontable {

    @JsConstructor
    public Handsontable(Element element, HandsontableOptions options) {
    }

    public native void clear();

    public native void loadData(JavaScriptObject data);

    /**
     *
     * @param action
     *            See grid.alter for possible values: "insert_row",
     *            "insert_col", "remove_row", "remove_col"
     * @param index
     *            Index of the row/column before which the new row/column will
     *            be inserted/removed.
     * @param amount
     *            Amount of rows/columns to be inserted/removed. Default: 1
     * @param source
     *            Source indicator.
     * @param keepEmptyRows
     *            Flag for preventing deletion of empty rows.
     */
    public native void alter(String action, int index, Number amount, String source, Boolean keepEmptyRows);

    /**
     * Returns the current data object (the same one that was passed by data
     * configuration option or loadData method, unless the modifyRow hook was
     * used to trim some of the rows. If that's the case - use the
     * {@link #getSourceData(Number, Number, Number, Number)} method.).
     * Optionally you can provide cell range by defining row, col, row2, col2 to
     * get only a fragment of grid data.
     *
     *
     * @param r1
     *            From row.
     * @param c1
     *            From column
     * @param r2
     *            To row
     * @param c2
     *            To column
     * @return the current data object
     */
    public native JavaScriptObject getData(Number r1, Number c1, Number r2, Number c2);

    /**
     * Returns the current data object (the same one that was passed by data
     * configuration option or loadData method, unless the modifyRow hook was
     * used to trim some of the rows. If that's the case - use the
     * {@link #getSourceData()} method.).
     *
     * @return the current data object
     */
    public native JavaScriptObject getData();

    /**
     * Returns the current data object (the same one that was passed by data
     * configuration option or loadData method). Optionally you can provide cell
     * range by defining row, col, row2, col2 to get only a fragment of grid
     * data.
     *
     *
     * @param r1
     *            From row.
     * @param c1
     *            From column
     * @param r2
     *            To row
     * @param c2
     *            To column
     * @return the current data object
     */
    public native JavaScriptObject getSourceData(Number r1, Number c1, Number r2, Number c2);

    /**
     * Returns the current data object (the same one that was passed by data
     * configuration option or loadData method).
     *
     * @return the current data object
     */
    public native JavaScriptObject getSourceData();

    /**
     * Returns a single row of the data. The row argument is the visible index
     * of the row.
     *
     * @param row
     *            Row index.
     * @return A single row of the data
     */
    public native JavaScriptObject getDataAtRow(Number row);

    /**
     * Check if all cells in the row declared by the row argument are empty.
     *
     * @param row
     *            Row index.
     * @return true if the row at the given row is empty, false otherwise.
     */
    public native boolean isEmptyRow(Number row);

    /**
     * Rerender the table.
     */
    public native void render();
}
