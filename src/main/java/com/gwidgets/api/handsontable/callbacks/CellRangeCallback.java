package com.gwidgets.api.handsontable.callbacks;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellRangeCallback {
    public void call(Number r1, Number c1, Number r2, Number c2);
}
