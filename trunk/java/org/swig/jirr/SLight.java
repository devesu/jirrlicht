/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SLight {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SLight(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SLight obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SLight(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SLight() {
    this(JirrJNI.new_SLight(), true);
  }

  public void setAmbientColor(SColorf value) {
    JirrJNI.SLight_AmbientColor_set(swigCPtr, this, SColorf.getCPtr(value), value);
  }

  public SColorf getAmbientColor() {
    long cPtr = JirrJNI.SLight_AmbientColor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SColorf(cPtr, false);
  }

  public void setDiffuseColor(SColorf value) {
    JirrJNI.SLight_DiffuseColor_set(swigCPtr, this, SColorf.getCPtr(value), value);
  }

  public SColorf getDiffuseColor() {
    long cPtr = JirrJNI.SLight_DiffuseColor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SColorf(cPtr, false);
  }

  public void setSpecularColor(SColorf value) {
    JirrJNI.SLight_SpecularColor_set(swigCPtr, this, SColorf.getCPtr(value), value);
  }

  public SColorf getSpecularColor() {
    long cPtr = JirrJNI.SLight_SpecularColor_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SColorf(cPtr, false);
  }

  public void setAttenuation(vector3df value) {
    JirrJNI.SLight_Attenuation_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getAttenuation() {
    long cPtr = JirrJNI.SLight_Attenuation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setOuterCone(float value) {
    JirrJNI.SLight_OuterCone_set(swigCPtr, this, value);
  }

  public float getOuterCone() {
    return JirrJNI.SLight_OuterCone_get(swigCPtr, this);
  }

  public void setInnerCone(float value) {
    JirrJNI.SLight_InnerCone_set(swigCPtr, this, value);
  }

  public float getInnerCone() {
    return JirrJNI.SLight_InnerCone_get(swigCPtr, this);
  }

  public void setFalloff(float value) {
    JirrJNI.SLight_Falloff_set(swigCPtr, this, value);
  }

  public float getFalloff() {
    return JirrJNI.SLight_Falloff_get(swigCPtr, this);
  }

  public void setPosition(vector3df value) {
    JirrJNI.SLight_Position_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getPosition() {
    long cPtr = JirrJNI.SLight_Position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setDirection(vector3df value) {
    JirrJNI.SLight_Direction_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getDirection() {
    long cPtr = JirrJNI.SLight_Direction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setRadius(float value) {
    JirrJNI.SLight_Radius_set(swigCPtr, this, value);
  }

  public float getRadius() {
    return JirrJNI.SLight_Radius_get(swigCPtr, this);
  }

  public void setType(E_LIGHT_TYPE value) {
    JirrJNI.SLight_Type_set(swigCPtr, this, value.swigValue());
  }

  public E_LIGHT_TYPE getType() {
    return E_LIGHT_TYPE.swigToEnum(JirrJNI.SLight_Type_get(swigCPtr, this));
  }

  public void setCastShadows(boolean value) {
    JirrJNI.SLight_CastShadows_set(swigCPtr, this, value);
  }

  public boolean getCastShadows() {
    return JirrJNI.SLight_CastShadows_get(swigCPtr, this);
  }

}
