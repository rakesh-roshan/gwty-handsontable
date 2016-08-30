package com.gwidgets.api.handsontable.callbacks;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellRangeByPropCallback {
    public void call(Number r1, String p1, Number r2, String p2);
}
