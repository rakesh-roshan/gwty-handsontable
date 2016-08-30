package com.gwidgets.api.handsontable.options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.handsontable.callbacks.AfterChangeCallback;
import com.gwidgets.api.handsontable.callbacks.CellRangeByPropCallback;
import com.gwidgets.api.handsontable.callbacks.CellRangeCallback;
import com.gwidgets.api.handsontable.callbacks.ModifyRowColCallback;
import com.gwidgets.api.handsontable.callbacks.ModifyRowColRangeCallback;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class HandsontableOptions {
    public static final String INSERT_ROW_ACTION = "insert_row";
    public static final String REMOVE_ROW_ACTION = "remove_row";
    private static final String INSERT_COLUMN_ACTION = "insert_col";
    private static final String REMOVE_COLUMN_ACTION = "remove_col";

    @JsProperty
    public JsArray<JavaScriptObject> data = null;
    @JsProperty
    public Boolean rowHeaders = null;
    @JsProperty
    public String[] colHeaders = null;
    @JsProperty
    public ColumnOption[] columns = null;
    @JsProperty
    public String stretchH = "none";
    @JsProperty
    public Boolean contextMenu = null;
    @JsProperty
    public AfterChangeCallback afterChange = null;
    @JsProperty
    public ModifyRowColRangeCallback afterCreateRow = null;
    @JsProperty
    public ModifyRowColRangeCallback beforeRemoveRow = null;
    @JsProperty
    public ModifyRowColRangeCallback afterRemoveRow = null;
    @JsProperty
    public ModifyRowColRangeCallback afterCreateCol = null;
    @JsProperty
    public ModifyRowColRangeCallback afterRemoveCol = null;
    @JsProperty
    public CellRangeCallback afterSelectionEnd = null;
    @JsProperty
    public CellRangeByPropCallback afterSelectionEndByProp = null;
    @JsProperty
    public CellRangeCallback afterSelection = null;
    @JsProperty
    public CellRangeByPropCallback afterSelectionByProp = null;
    @JsProperty
    public ModifyRowColCallback modifyRow = null;
    @JsProperty
    public ModifyRowColCallback modifyCol = null;
    @JsProperty
    public Boolean outsideClickDeselects = true;
    @JsProperty
    public Number maxRows = getInfinityNumber();
    @JsProperty
    public Number maxCols = getInfinityNumber();
    @JsProperty
    public Number startRows = 5;
    @JsProperty
    public Number startCols = 5;
    @JsProperty
    public String preventOverflow = getBooleanString(false);

    public native static Number getInfinityNumber()
    /*-{
          return $wnd.Infinity;
     }-*/;

    public native static String getBooleanString(Boolean val)
    /*-{
          return val;
     }-*/;

}
