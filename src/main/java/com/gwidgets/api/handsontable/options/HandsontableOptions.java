package com.gwidgets.api.handsontable.options;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class HandsontableOptions {

    @JsProperty
    public JavaScriptObject data = null;
    @JsProperty
    public Boolean rowHeaders = null;
    @JsProperty
    public Boolean colHeaders = null;
}
