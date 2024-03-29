/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEventType(EEVENT_TYPE value) {
    JirrJNI.SEvent_EventType_set(swigCPtr, this, value.swigValue());
  }

  public EEVENT_TYPE getEventType() {
    return EEVENT_TYPE.swigToEnum(JirrJNI.SEvent_EventType_get(swigCPtr, this));
  }

  public int getKeyInputChar() {
    return JirrJNI.SEvent_getKeyInputChar(swigCPtr, this);
  }

  public EKEY_CODE getKeyInputKey() {
    return EKEY_CODE.swigToEnum(JirrJNI.SEvent_getKeyInputKey(swigCPtr, this));
  }

  public boolean isKeyInputPressedDown() {
    return JirrJNI.SEvent_isKeyInputPressedDown(swigCPtr, this);
  }

  public boolean isKeyInputShift() {
    return JirrJNI.SEvent_isKeyInputShift(swigCPtr, this);
  }

  public boolean isKeyInputCtrl() {
    return JirrJNI.SEvent_isKeyInputCtrl(swigCPtr, this);
  }

  public int getMouseInputX() {
    return JirrJNI.SEvent_getMouseInputX(swigCPtr, this);
  }

  public int getMouseInputY() {
    return JirrJNI.SEvent_getMouseInputY(swigCPtr, this);
  }

  public float getMouseInputWheel() {
    return JirrJNI.SEvent_getMouseInputWheel(swigCPtr, this);
  }

  public EMOUSE_INPUT_EVENT getMouseInputEvent() {
    return EMOUSE_INPUT_EVENT.swigToEnum(JirrJNI.SEvent_getMouseInputEvent(swigCPtr, this));
  }

  public IGUIElement getGUIEventCaller() {
    long cPtr = JirrJNI.SEvent_getGUIEventCaller(swigCPtr, this);
    return (cPtr == 0) ? null : new IGUIElement(cPtr, false);
  }

  public EGUI_EVENT_TYPE getGUIEventType() {
    return EGUI_EVENT_TYPE.swigToEnum(JirrJNI.SEvent_getGUIEventType(swigCPtr, this));
  }

  public String getLogEventText() {
    return JirrJNI.SEvent_getLogEventText(swigCPtr, this);
  }

  public ELOG_LEVEL getLogEventLevel() {
    return ELOG_LEVEL.swigToEnum(JirrJNI.SEvent_getLogEventLevel(swigCPtr, this));
  }

  public int getUserEventData1() {
    return JirrJNI.SEvent_getUserEventData1(swigCPtr, this);
  }

  public int getUserEventData2() {
    return JirrJNI.SEvent_getUserEventData2(swigCPtr, this);
  }

  public SEvent() {
    this(JirrJNI.new_SEvent(), true);
  }

}
