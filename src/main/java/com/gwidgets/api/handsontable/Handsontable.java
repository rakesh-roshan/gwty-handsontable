package com.gwidgets.api.handsontable;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwidgets.api.handsontable.options.HandsontableOptions;
import com.gwidgets.api.leaflet.elemental.HTMLElement;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Handsontable {

    @JsConstructor
    public Handsontable(HTMLElement element, HandsontableOptions options) {
    }

    public native void clear();

    public native void loadData(JavaScriptObject data);
}
