package com.gwidgets.api.handsontable.options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.gwidgets.api.handsontable.callbacks.AfterChangeCallback;
import com.gwidgets.api.handsontable.callbacks.CreateRowColCallback;
import com.gwidgets.api.handsontable.callbacks.ModifyRowColCallback;

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
    public String[] rowHeaders = null;
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
    public CreateRowColCallback afterCreateRow = null;
    @JsProperty
    public CreateRowColCallback afterCreateCol = null;
    @JsProperty
    public ModifyRowColCallback modifyRow = null;
    @JsProperty
    public ModifyRowColCallback modifyCol = null;
}
