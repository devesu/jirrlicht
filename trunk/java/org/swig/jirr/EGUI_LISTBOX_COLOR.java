/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum EGUI_LISTBOX_COLOR {
  EGUI_LBC_TEXT(0),
  EGUI_LBC_TEXT_HIGHLIGHT,
  EGUI_LBC_ICON,
  EGUI_LBC_ICON_HIGHLIGHT,
  EGUI_LBC_COUNT;

  public final int swigValue() {
    return swigValue;
  }

  public static EGUI_LISTBOX_COLOR swigToEnum(int swigValue) {
    EGUI_LISTBOX_COLOR[] swigValues = EGUI_LISTBOX_COLOR.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EGUI_LISTBOX_COLOR swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EGUI_LISTBOX_COLOR.class + " with value " + swigValue);
  }

  private EGUI_LISTBOX_COLOR() {
    this.swigValue = SwigNext.next++;
  }

  private EGUI_LISTBOX_COLOR(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private EGUI_LISTBOX_COLOR(EGUI_LISTBOX_COLOR swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
