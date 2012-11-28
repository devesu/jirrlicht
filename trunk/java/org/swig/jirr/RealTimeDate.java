/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class RealTimeDate {
  private long swigCPtr;

  protected RealTimeDate(long cPtr, boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected RealTimeDate() {
    swigCPtr = 0;
  }

  protected static long getCPtr(RealTimeDate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }
  
  public long getDay(){
      return JirrJNI.ITimer_getRealTimeAndDateDay(swigCPtr);
  }
  
  public long getMonth(){
      return JirrJNI.ITimer_getRealTimeAndDateMonth(swigCPtr);
  }
  
  public long getYear(){
      return JirrJNI.ITimer_getRealTimeAndDateYear(swigCPtr);
  }
  
  public long getHour(){
      return JirrJNI.ITimer_getRealTimeAndDateHour(swigCPtr);
  }
  
  public long getMinute(){
      return JirrJNI.ITimer_getRealTimeAndDateMinute(swigCPtr);
  }
  
  public long getSecond(){
      return JirrJNI.ITimer_getRealTimeAndDateSecond(swigCPtr);
  }
  
  public boolean isDST(){
      return JirrJNI.ITimer_getRealTimeAndDateIsDST(swigCPtr);
  }
  
  
}
