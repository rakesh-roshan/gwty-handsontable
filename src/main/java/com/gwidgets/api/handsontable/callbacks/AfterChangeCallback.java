package com.gwidgets.api.handsontable.callbacks;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface AfterChangeCallback {
    public void call(JsArray<JsArray<JavaScriptObject>> changes, String source);
}
