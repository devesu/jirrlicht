/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public enum EGUI_DEFAULT_SIZE {
  EGDS_SCROLLBAR_SIZE(0),
  EGDS_MENU_HEIGHT,
  EGDS_WINDOW_BUTTON_WIDTH,
  EGDS_CHECK_BOX_WIDTH,
  EGDS_MESSAGE_BOX_WIDTH,
  EGDS_MESSAGE_BOX_HEIGHT,
  EGDS_BUTTON_WIDTH,
  EGDS_BUTTON_HEIGHT,
  EGDS_TEXT_DISTANCE_X,
  EGDS_TEXT_DISTANCE_Y,
  EGDS_TITLEBARTEXT_DISTANCE_X,
  EGDS_TITLEBARTEXT_DISTANCE_Y,
  EGDS_MESSAGE_BOX_GAP_SPACE,
  EGDS_MESSAGE_BOX_MIN_TEXT_WIDTH,
  EGDS_MESSAGE_BOX_MAX_TEXT_WIDTH,
  EGDS_MESSAGE_BOX_MIN_TEXT_HEIGHT,
  EGDS_MESSAGE_BOX_MAX_TEXT_HEIGHT,
  EGDS_BUTTON_PRESSED_IMAGE_OFFSET_X,
  EGDS_BUTTON_PRESSED_IMAGE_OFFSET_Y,
  EGDS_BUTTON_PRESSED_TEXT_OFFSET_X,
  EGDS_BUTTON_PRESSED_TEXT_OFFSET_Y,
  EGDS_COUNT;

  public final int swigValue() {
    return swigValue;
  }

  public static EGUI_DEFAULT_SIZE swigToEnum(int swigValue) {
    EGUI_DEFAULT_SIZE[] swigValues = EGUI_DEFAULT_SIZE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EGUI_DEFAULT_SIZE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EGUI_DEFAULT_SIZE.class + " with value " + swigValue);
  }

  private EGUI_DEFAULT_SIZE() {
    this.swigValue = SwigNext.next++;
  }

  private EGUI_DEFAULT_SIZE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private EGUI_DEFAULT_SIZE(EGUI_DEFAULT_SIZE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
