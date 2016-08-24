package com.gwidgets.api.handsontable.callbacks;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CreateRowColCallback {
    public void call(Number index, Number amount);
}
