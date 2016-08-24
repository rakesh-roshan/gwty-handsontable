package com.gwidgets.api.handsontable.options;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class ColumnOption {
    @JsProperty
    public String data = null;
    @JsProperty
    public Boolean allowInvalid = null;
    @JsProperty
    public String type = "text";
    @JsProperty
    public Boolean readOnly = false;
    @JsProperty
    public Boolean trimWhitespace = true;
    @JsProperty
    public String format = "0";
    @JsProperty
    public String dateFormat = "MM/DD/YYYY";
    @JsProperty
    public Boolean correctFormat = false;

}
