/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IRenderTarget {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IRenderTarget(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IRenderTarget obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IRenderTarget(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IRenderTarget(ITexture texture, E_COLOR_PLANE colorMask, E_BLEND_FACTOR blendFuncSrc, E_BLEND_FACTOR blendFuncDst, E_BLEND_OPERATION blendOp) {
    this(JirrJNI.new_IRenderTarget__SWIG_0(ITexture.getCPtr(texture), texture, colorMask.swigValue(), blendFuncSrc.swigValue(), blendFuncDst.swigValue(), blendOp.swigValue()), true);
  }

  public IRenderTarget(ITexture texture, E_COLOR_PLANE colorMask, E_BLEND_FACTOR blendFuncSrc, E_BLEND_FACTOR blendFuncDst) {
    this(JirrJNI.new_IRenderTarget__SWIG_1(ITexture.getCPtr(texture), texture, colorMask.swigValue(), blendFuncSrc.swigValue(), blendFuncDst.swigValue()), true);
  }

  public IRenderTarget(ITexture texture, E_COLOR_PLANE colorMask, E_BLEND_FACTOR blendFuncSrc) {
    this(JirrJNI.new_IRenderTarget__SWIG_2(ITexture.getCPtr(texture), texture, colorMask.swigValue(), blendFuncSrc.swigValue()), true);
  }

  public IRenderTarget(ITexture texture, E_COLOR_PLANE colorMask) {
    this(JirrJNI.new_IRenderTarget__SWIG_3(ITexture.getCPtr(texture), texture, colorMask.swigValue()), true);
  }

  public IRenderTarget(ITexture texture) {
    this(JirrJNI.new_IRenderTarget__SWIG_4(ITexture.getCPtr(texture), texture), true);
  }

  public IRenderTarget(E_RENDER_TARGET target, E_COLOR_PLANE colorMask, E_BLEND_FACTOR blendFuncSrc, E_BLEND_FACTOR blendFuncDst, E_BLEND_OPERATION blendOp) {
    this(JirrJNI.new_IRenderTarget__SWIG_5(target.swigValue(), colorMask.swigValue(), blendFuncSrc.swigValue(), blendFuncDst.swigValue(), blendOp.swigValue()), true);
  }

  public IRenderTarget(E_RENDER_TARGET target, E_COLOR_PLANE colorMask, E_BLEND_FACTOR blendFuncSrc, E_BLEND_FACTOR blendFuncDst) {
    this(JirrJNI.new_IRenderTarget__SWIG_6(target.swigValue(), colorMask.swigValue(), blendFuncSrc.swigValue(), blendFuncDst.swigValue()), true);
  }

  public IRenderTarget(E_RENDER_TARGET target, E_COLOR_PLANE colorMask, E_BLEND_FACTOR blendFuncSrc) {
    this(JirrJNI.new_IRenderTarget__SWIG_7(target.swigValue(), colorMask.swigValue(), blendFuncSrc.swigValue()), true);
  }

  public IRenderTarget(E_RENDER_TARGET target, E_COLOR_PLANE colorMask) {
    this(JirrJNI.new_IRenderTarget__SWIG_8(target.swigValue(), colorMask.swigValue()), true);
  }

  public IRenderTarget(E_RENDER_TARGET target) {
    this(JirrJNI.new_IRenderTarget__SWIG_9(target.swigValue()), true);
  }

  public boolean notEqualsOperator(IRenderTarget other) {
    return JirrJNI.IRenderTarget_notEqualsOperator(swigCPtr, this, IRenderTarget.getCPtr(other), other);
  }

  public void setRenderTexture(ITexture value) {
    JirrJNI.IRenderTarget_RenderTexture_set(swigCPtr, this, ITexture.getCPtr(value), value);
  }

  public ITexture getRenderTexture() {
    long cPtr = JirrJNI.IRenderTarget_RenderTexture_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ITexture(cPtr, false);
  }

  public void setTargetType(E_RENDER_TARGET value) {
    JirrJNI.IRenderTarget_TargetType_set(swigCPtr, this, value.swigValue());
  }

  public E_RENDER_TARGET getTargetType() {
    return E_RENDER_TARGET.swigToEnum(JirrJNI.IRenderTarget_TargetType_get(swigCPtr, this));
  }

  public void setColorMask(E_COLOR_PLANE value) {
    JirrJNI.IRenderTarget_ColorMask_set(swigCPtr, this, value.swigValue());
  }

  public E_COLOR_PLANE getColorMask() {
    return E_COLOR_PLANE.swigToEnum(JirrJNI.IRenderTarget_ColorMask_get(swigCPtr, this));
  }

  public void setBlendFuncSrc(E_BLEND_FACTOR value) {
    JirrJNI.IRenderTarget_BlendFuncSrc_set(swigCPtr, this, value.swigValue());
  }

  public E_BLEND_FACTOR getBlendFuncSrc() {
    return E_BLEND_FACTOR.swigToEnum(JirrJNI.IRenderTarget_BlendFuncSrc_get(swigCPtr, this));
  }

  public void setBlendFuncDst(E_BLEND_FACTOR value) {
    JirrJNI.IRenderTarget_BlendFuncDst_set(swigCPtr, this, value.swigValue());
  }

  public E_BLEND_FACTOR getBlendFuncDst() {
    return E_BLEND_FACTOR.swigToEnum(JirrJNI.IRenderTarget_BlendFuncDst_get(swigCPtr, this));
  }

  public void setBlendOp(E_BLEND_OPERATION value) {
    JirrJNI.IRenderTarget_BlendOp_set(swigCPtr, this, value.swigValue());
  }

  public E_BLEND_OPERATION getBlendOp() {
    return E_BLEND_OPERATION.swigToEnum(JirrJNI.IRenderTarget_BlendOp_get(swigCPtr, this));
  }

}