/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IrrlichtDevice {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IrrlichtDevice(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IrrlichtDevice obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IrrlichtDevice(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean run() {
    return JirrJNI.IrrlichtDevice_run(swigCPtr, this);
  }

  public void yield() {
    JirrJNI.IrrlichtDevice_yield(swigCPtr, this);
  }

  public void sleep(long timeMs, boolean pauseTimer) {
    JirrJNI.IrrlichtDevice_sleep__SWIG_0(swigCPtr, this, timeMs, pauseTimer);
  }

  public void sleep(long timeMs) {
    JirrJNI.IrrlichtDevice_sleep__SWIG_1(swigCPtr, this, timeMs);
  }

  public IVideoDriver getVideoDriver() {
    long cPtr = JirrJNI.IrrlichtDevice_getVideoDriver(swigCPtr, this);
    return (cPtr == 0) ? null : new IVideoDriver(cPtr, false);
  }

  public IFileSystem getFileSystem() {
    long cPtr = JirrJNI.IrrlichtDevice_getFileSystem(swigCPtr, this);
    return (cPtr == 0) ? null : new IFileSystem(cPtr, false);
  }

  public IGUIEnvironment getGUIEnvironment() {
    long cPtr = JirrJNI.IrrlichtDevice_getGUIEnvironment(swigCPtr, this);
    return (cPtr == 0) ? null : new IGUIEnvironment(cPtr, false);
  }

  public ISceneManager getSceneManager() {
    long cPtr = JirrJNI.IrrlichtDevice_getSceneManager(swigCPtr, this);
    return (cPtr == 0) ? null : new ISceneManager(cPtr, false);
  }

  public ICursorControl getCursorControl() {
    long cPtr = JirrJNI.IrrlichtDevice_getCursorControl(swigCPtr, this);
    return (cPtr == 0) ? null : new ICursorControl(cPtr, false);
  }

  public ILogger getLogger() {
    long cPtr = JirrJNI.IrrlichtDevice_getLogger(swigCPtr, this);
    return (cPtr == 0) ? null : new ILogger(cPtr, false);
  }

  public IVideoModeList getVideoModeList() {
    long cPtr = JirrJNI.IrrlichtDevice_getVideoModeList(swigCPtr, this);
    return (cPtr == 0) ? null : new IVideoModeList(cPtr, false);
  }

  public IOSOperator getOSOperator() {
    long cPtr = JirrJNI.IrrlichtDevice_getOSOperator(swigCPtr, this);
    return (cPtr == 0) ? null : new IOSOperator(cPtr, false);
  }

  public ITimer getTimer() {
    long cPtr = JirrJNI.IrrlichtDevice_getTimer(swigCPtr, this);
    return (cPtr == 0) ? null : new ITimer(cPtr, false);
  }

  public SWIGTYPE_p_irr__IRandomizer getRandomizer() {
    long cPtr = JirrJNI.IrrlichtDevice_getRandomizer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__IRandomizer(cPtr, false);
  }

  public void setRandomizer(SWIGTYPE_p_irr__IRandomizer r) {
    JirrJNI.IrrlichtDevice_setRandomizer(swigCPtr, this, SWIGTYPE_p_irr__IRandomizer.getCPtr(r));
  }

  public SWIGTYPE_p_irr__IRandomizer createDefaultRandomizer() {
    long cPtr = JirrJNI.IrrlichtDevice_createDefaultRandomizer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__IRandomizer(cPtr, false);
  }

  public void setWindowCaption(String text) {
    JirrJNI.IrrlichtDevice_setWindowCaption(swigCPtr, this, text);
  }

  public boolean isWindowActive() {
    return JirrJNI.IrrlichtDevice_isWindowActive(swigCPtr, this);
  }

  public boolean isWindowFocused() {
    return JirrJNI.IrrlichtDevice_isWindowFocused(swigCPtr, this);
  }

  public boolean isWindowMinimized() {
    return JirrJNI.IrrlichtDevice_isWindowMinimized(swigCPtr, this);
  }

  public boolean isFullscreen() {
    return JirrJNI.IrrlichtDevice_isFullscreen(swigCPtr, this);
  }

  public ECOLOR_FORMAT getColorFormat() {
    return ECOLOR_FORMAT.swigToEnum(JirrJNI.IrrlichtDevice_getColorFormat(swigCPtr, this));
  }

  public void closeDevice() {
    JirrJNI.IrrlichtDevice_closeDevice(swigCPtr, this);
  }

  public String getVersion() {
    return JirrJNI.IrrlichtDevice_getVersion(swigCPtr, this);
  }

  public void setEventReceiver(IEventReceiver receiver) {
    JirrJNI.IrrlichtDevice_setEventReceiver(swigCPtr, this, IEventReceiver.getCPtr(receiver), receiver);
  }

  public IEventReceiver getEventReceiver() {
    long cPtr = JirrJNI.IrrlichtDevice_getEventReceiver(swigCPtr, this);
    return (cPtr == 0) ? null : new IEventReceiver(cPtr, false);
  }

  public boolean postEventFromUser(SEvent event) {
    return JirrJNI.IrrlichtDevice_postEventFromUser(swigCPtr, this, SEvent.getCPtr(event), event);
  }

  public void setInputReceivingSceneManager(ISceneManager sceneManager) {
    JirrJNI.IrrlichtDevice_setInputReceivingSceneManager(swigCPtr, this, ISceneManager.getCPtr(sceneManager), sceneManager);
  }

  public void setResizable(boolean resize) {
    JirrJNI.IrrlichtDevice_setResizable__SWIG_0(swigCPtr, this, resize);
  }

  public void setResizable() {
    JirrJNI.IrrlichtDevice_setResizable__SWIG_1(swigCPtr, this);
  }

  public void minimizeWindow() {
    JirrJNI.IrrlichtDevice_minimizeWindow(swigCPtr, this);
  }

  public void maximizeWindow() {
    JirrJNI.IrrlichtDevice_maximizeWindow(swigCPtr, this);
  }

  public void restoreWindow() {
    JirrJNI.IrrlichtDevice_restoreWindow(swigCPtr, this);
  }

  public boolean activateJoysticks(SWIGTYPE_p_irr__core__arrayT_irr__SJoystickInfo_irrAllocatorT_irr__SJoystickInfo_t_t joystickInfo) {
    return JirrJNI.IrrlichtDevice_activateJoysticks(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_irr__SJoystickInfo_irrAllocatorT_irr__SJoystickInfo_t_t.getCPtr(joystickInfo));
  }

  public boolean setGammaRamp(float red, float green, float blue, float relativebrightness, float relativecontrast) {
    return JirrJNI.IrrlichtDevice_setGammaRamp(swigCPtr, this, red, green, blue, relativebrightness, relativecontrast);
  }

  public boolean getGammaRamp(SWIGTYPE_p_float red, SWIGTYPE_p_float green, SWIGTYPE_p_float blue, SWIGTYPE_p_float brightness, SWIGTYPE_p_float contrast) {
    return JirrJNI.IrrlichtDevice_getGammaRamp(swigCPtr, this, SWIGTYPE_p_float.getCPtr(red), SWIGTYPE_p_float.getCPtr(green), SWIGTYPE_p_float.getCPtr(blue), SWIGTYPE_p_float.getCPtr(brightness), SWIGTYPE_p_float.getCPtr(contrast));
  }

  public void clearSystemMessages() {
    JirrJNI.IrrlichtDevice_clearSystemMessages(swigCPtr, this);
  }

  public SWIGTYPE_p_E_DEVICE_TYPE getType() {
    return new SWIGTYPE_p_E_DEVICE_TYPE(JirrJNI.IrrlichtDevice_getType(swigCPtr, this), true);
  }

  public static boolean isDriverSupported(E_DRIVER_TYPE driver) {
    return JirrJNI.IrrlichtDevice_isDriverSupported(driver.swigValue());
  }

}
