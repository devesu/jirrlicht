/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class ITexture {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ITexture(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ITexture obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_ITexture(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_void lock(E_TEXTURE_LOCK_MODE mode, long mipmapLevel) {
    long cPtr = JirrJNI.ITexture_lock__SWIG_0(swigCPtr, this, mode.swigValue(), mipmapLevel);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_void lock(E_TEXTURE_LOCK_MODE mode) {
    long cPtr = JirrJNI.ITexture_lock__SWIG_1(swigCPtr, this, mode.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_void lock() {
    long cPtr = JirrJNI.ITexture_lock__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void unlock() {
    JirrJNI.ITexture_unlock(swigCPtr, this);
  }

  public SWIGTYPE_p_irr__core__dimension2dT_unsigned_int_t getOriginalSize() {
    return new SWIGTYPE_p_irr__core__dimension2dT_unsigned_int_t(JirrJNI.ITexture_getOriginalSize(swigCPtr, this), false);
  }

  public SWIGTYPE_p_irr__core__dimension2dT_unsigned_int_t getSize() {
    return new SWIGTYPE_p_irr__core__dimension2dT_unsigned_int_t(JirrJNI.ITexture_getSize(swigCPtr, this), false);
  }

  public E_DRIVER_TYPE getDriverType() {
    return E_DRIVER_TYPE.swigToEnum(JirrJNI.ITexture_getDriverType(swigCPtr, this));
  }

  public ECOLOR_FORMAT getColorFormat() {
    return ECOLOR_FORMAT.swigToEnum(JirrJNI.ITexture_getColorFormat(swigCPtr, this));
  }

  public long getPitch() {
    return JirrJNI.ITexture_getPitch(swigCPtr, this);
  }

  public boolean hasMipMaps() {
    return JirrJNI.ITexture_hasMipMaps(swigCPtr, this);
  }

  public boolean hasAlpha() {
    return JirrJNI.ITexture_hasAlpha(swigCPtr, this);
  }

  public void regenerateMipMapLevels(SWIGTYPE_p_void mipmapData) {
    JirrJNI.ITexture_regenerateMipMapLevels__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(mipmapData));
  }

  public void regenerateMipMapLevels() {
    JirrJNI.ITexture_regenerateMipMapLevels__SWIG_1(swigCPtr, this);
  }

  public boolean isRenderTarget() {
    return JirrJNI.ITexture_isRenderTarget(swigCPtr, this);
  }

  public SWIGTYPE_p_io__SNamedPath getName() {
    return new SWIGTYPE_p_io__SNamedPath(JirrJNI.ITexture_getName(swigCPtr, this), false);
  }

}
