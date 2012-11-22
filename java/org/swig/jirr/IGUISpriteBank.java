/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IGUISpriteBank {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IGUISpriteBank(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IGUISpriteBank obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IGUISpriteBank(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_irr__core__arrayT_irr__core__rectT_irr__s32_t_irrAllocatorT_irr__core__rectT_s32_t_t_t getPositions() {
    return new SWIGTYPE_p_irr__core__arrayT_irr__core__rectT_irr__s32_t_irrAllocatorT_irr__core__rectT_s32_t_t_t(JirrJNI.IGUISpriteBank_getPositions(swigCPtr, this), false);
  }

  public SWIGTYPE_p_irr__core__arrayT_irr__gui__SGUISprite_irrAllocatorT_irr__gui__SGUISprite_t_t getSprites() {
    return new SWIGTYPE_p_irr__core__arrayT_irr__gui__SGUISprite_irrAllocatorT_irr__gui__SGUISprite_t_t(JirrJNI.IGUISpriteBank_getSprites(swigCPtr, this), false);
  }

  public long getTextureCount() {
    return JirrJNI.IGUISpriteBank_getTextureCount(swigCPtr, this);
  }

  public ITexture getTexture(long index) {
    long cPtr = JirrJNI.IGUISpriteBank_getTexture(swigCPtr, this, index);
    return (cPtr == 0) ? null : new ITexture(cPtr, false);
  }

  public void addTexture(ITexture texture) {
    JirrJNI.IGUISpriteBank_addTexture(swigCPtr, this, ITexture.getCPtr(texture), texture);
  }

  public void setTexture(long index, ITexture texture) {
    JirrJNI.IGUISpriteBank_setTexture(swigCPtr, this, index, ITexture.getCPtr(texture), texture);
  }

  public int addTextureAsSprite(ITexture texture) {
    return JirrJNI.IGUISpriteBank_addTextureAsSprite(swigCPtr, this, ITexture.getCPtr(texture), texture);
  }

  public void clear() {
    JirrJNI.IGUISpriteBank_clear(swigCPtr, this);
  }

  public void draw2DSprite(long index, vector2di pos, recti clip, SColor color, long starttime, long currenttime, boolean loop, boolean center) {
    JirrJNI.IGUISpriteBank_draw2DSprite__SWIG_0(swigCPtr, this, index, vector2di.getCPtr(pos), pos, recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime, currenttime, loop, center);
  }

  public void draw2DSprite(long index, vector2di pos, recti clip, SColor color, long starttime, long currenttime, boolean loop) {
    JirrJNI.IGUISpriteBank_draw2DSprite__SWIG_1(swigCPtr, this, index, vector2di.getCPtr(pos), pos, recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime, currenttime, loop);
  }

  public void draw2DSprite(long index, vector2di pos, recti clip, SColor color, long starttime, long currenttime) {
    JirrJNI.IGUISpriteBank_draw2DSprite__SWIG_2(swigCPtr, this, index, vector2di.getCPtr(pos), pos, recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime, currenttime);
  }

  public void draw2DSprite(long index, vector2di pos, recti clip, SColor color, long starttime) {
    JirrJNI.IGUISpriteBank_draw2DSprite__SWIG_3(swigCPtr, this, index, vector2di.getCPtr(pos), pos, recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime);
  }

  public void draw2DSprite(long index, vector2di pos, recti clip, SColor color) {
    JirrJNI.IGUISpriteBank_draw2DSprite__SWIG_4(swigCPtr, this, index, vector2di.getCPtr(pos), pos, recti.getCPtr(clip), clip, SColor.getCPtr(color), color);
  }

  public void draw2DSprite(long index, vector2di pos, recti clip) {
    JirrJNI.IGUISpriteBank_draw2DSprite__SWIG_5(swigCPtr, this, index, vector2di.getCPtr(pos), pos, recti.getCPtr(clip), clip);
  }

  public void draw2DSprite(long index, vector2di pos) {
    JirrJNI.IGUISpriteBank_draw2DSprite__SWIG_6(swigCPtr, this, index, vector2di.getCPtr(pos), pos);
  }

  public void draw2DSpriteBatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t pos, recti clip, SColor color, long starttime, long currenttime, boolean loop, boolean center) {
    JirrJNI.IGUISpriteBank_draw2DSpriteBatch__SWIG_0(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t.getCPtr(pos), recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime, currenttime, loop, center);
  }

  public void draw2DSpriteBatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t pos, recti clip, SColor color, long starttime, long currenttime, boolean loop) {
    JirrJNI.IGUISpriteBank_draw2DSpriteBatch__SWIG_1(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t.getCPtr(pos), recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime, currenttime, loop);
  }

  public void draw2DSpriteBatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t pos, recti clip, SColor color, long starttime, long currenttime) {
    JirrJNI.IGUISpriteBank_draw2DSpriteBatch__SWIG_2(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t.getCPtr(pos), recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime, currenttime);
  }

  public void draw2DSpriteBatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t pos, recti clip, SColor color, long starttime) {
    JirrJNI.IGUISpriteBank_draw2DSpriteBatch__SWIG_3(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t.getCPtr(pos), recti.getCPtr(clip), clip, SColor.getCPtr(color), color, starttime);
  }

  public void draw2DSpriteBatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t pos, recti clip, SColor color) {
    JirrJNI.IGUISpriteBank_draw2DSpriteBatch__SWIG_4(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t.getCPtr(pos), recti.getCPtr(clip), clip, SColor.getCPtr(color), color);
  }

  public void draw2DSpriteBatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t pos, recti clip) {
    JirrJNI.IGUISpriteBank_draw2DSpriteBatch__SWIG_5(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t.getCPtr(pos), recti.getCPtr(clip), clip);
  }

  public void draw2DSpriteBatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t pos) {
    JirrJNI.IGUISpriteBank_draw2DSpriteBatch__SWIG_6(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), SWIGTYPE_p_irr__core__arrayT_irr__core__vector2dT_irr__s32_t_irrAllocatorT_irr__core__vector2dT_s32_t_t_t.getCPtr(pos));
  }

}
