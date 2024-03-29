/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IGUIFont {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IGUIFont(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IGUIFont obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IGUIFont(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void draw(SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t text, recti position, SColor color, boolean hcenter, boolean vcenter, recti clip) {
    JirrJNI.IGUIFont_draw__SWIG_0(swigCPtr, this, SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t.getCPtr(text), recti.getCPtr(position), position, SColor.getCPtr(color), color, hcenter, vcenter, recti.getCPtr(clip), clip);
  }

  public void draw(SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t text, recti position, SColor color, boolean hcenter, boolean vcenter) {
    JirrJNI.IGUIFont_draw__SWIG_1(swigCPtr, this, SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t.getCPtr(text), recti.getCPtr(position), position, SColor.getCPtr(color), color, hcenter, vcenter);
  }

  public void draw(SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t text, recti position, SColor color, boolean hcenter) {
    JirrJNI.IGUIFont_draw__SWIG_2(swigCPtr, this, SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t.getCPtr(text), recti.getCPtr(position), position, SColor.getCPtr(color), color, hcenter);
  }

  public void draw(SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t text, recti position, SColor color) {
    JirrJNI.IGUIFont_draw__SWIG_3(swigCPtr, this, SWIGTYPE_p_irr__core__stringT_wchar_t_irrAllocatorT_wchar_t_t_t.getCPtr(text), recti.getCPtr(position), position, SColor.getCPtr(color), color);
  }

  public SWIGTYPE_p_irr__core__dimension2dT_unsigned_int_t getDimension(String text) {
    return new SWIGTYPE_p_irr__core__dimension2dT_unsigned_int_t(JirrJNI.IGUIFont_getDimension(swigCPtr, this, text), true);
  }

  public int getCharacterFromPos(String text, int pixel_x) {
    return JirrJNI.IGUIFont_getCharacterFromPos(swigCPtr, this, text, pixel_x);
  }

  public EGUI_FONT_TYPE getType() {
    return EGUI_FONT_TYPE.swigToEnum(JirrJNI.IGUIFont_getType(swigCPtr, this));
  }

  public void setKerningWidth(int kerning) {
    JirrJNI.IGUIFont_setKerningWidth(swigCPtr, this, kerning);
  }

  public void setKerningHeight(int kerning) {
    JirrJNI.IGUIFont_setKerningHeight(swigCPtr, this, kerning);
  }

  public int getKerningWidth(String thisLetter, String previousLetter) {
    return JirrJNI.IGUIFont_getKerningWidth__SWIG_0(swigCPtr, this, thisLetter, previousLetter);
  }

  public int getKerningWidth(String thisLetter) {
    return JirrJNI.IGUIFont_getKerningWidth__SWIG_1(swigCPtr, this, thisLetter);
  }

  public int getKerningWidth() {
    return JirrJNI.IGUIFont_getKerningWidth__SWIG_2(swigCPtr, this);
  }

  public int getKerningHeight() {
    return JirrJNI.IGUIFont_getKerningHeight(swigCPtr, this);
  }

  public void setInvisibleCharacters(String s) {
    JirrJNI.IGUIFont_setInvisibleCharacters(swigCPtr, this, s);
  }

}
