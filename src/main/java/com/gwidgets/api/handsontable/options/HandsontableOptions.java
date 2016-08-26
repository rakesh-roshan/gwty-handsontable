package com.gwidgets.api.handsontable.options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.handsontable.callbacks.AfterChangeCallback;
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
    public ModifyRowColCallback modifyRow = null;
    @JsProperty
    public ModifyRowColCallback modifyCol = null;
    @JsProperty
    public Boolean outsideClickDeselects = true;
}
