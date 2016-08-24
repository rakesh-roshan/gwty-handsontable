package com.gwidgets.api.handsontable.callbacks;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ModifyRowColCallback {
    public void call(Number index);
}
