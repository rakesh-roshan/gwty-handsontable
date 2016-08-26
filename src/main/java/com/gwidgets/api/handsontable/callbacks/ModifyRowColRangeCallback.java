package com.gwidgets.api.handsontable.callbacks;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ModifyRowColRangeCallback {
    public void call(Number index, Number amount);
}
