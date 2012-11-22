/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class S3DVertex2TCoords extends S3DVertex {
  private long swigCPtr;

  protected S3DVertex2TCoords(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.S3DVertex2TCoords_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(S3DVertex2TCoords obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_S3DVertex2TCoords(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected static long[] cArrayUnwrap(S3DVertex2TCoords[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = S3DVertex2TCoords.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static S3DVertex2TCoords[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    S3DVertex2TCoords[] arrayWrapper = new S3DVertex2TCoords[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new S3DVertex2TCoords(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public S3DVertex2TCoords() {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_0(), true);
  }

  public S3DVertex2TCoords(float x, float y, float z, SColor c, float tu, float tv, float tu2, float tv2) {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_1(x, y, z, SColor.getCPtr(c), c, tu, tv, tu2, tv2), true);
  }

  public S3DVertex2TCoords(vector3df pos, SColor color, vector2df tcoords, vector2df tcoords2) {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_2(vector3df.getCPtr(pos), pos, SColor.getCPtr(color), color, vector2df.getCPtr(tcoords), tcoords, vector2df.getCPtr(tcoords2), tcoords2), true);
  }

  public S3DVertex2TCoords(vector3df pos, vector3df normal, SColor color, vector2df tcoords, vector2df tcoords2) {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_3(vector3df.getCPtr(pos), pos, vector3df.getCPtr(normal), normal, SColor.getCPtr(color), color, vector2df.getCPtr(tcoords), tcoords, vector2df.getCPtr(tcoords2), tcoords2), true);
  }

  public S3DVertex2TCoords(float x, float y, float z, float nx, float ny, float nz, SColor c, float tu, float tv, float tu2, float tv2) {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_4(x, y, z, nx, ny, nz, SColor.getCPtr(c), c, tu, tv, tu2, tv2), true);
  }

  public S3DVertex2TCoords(float x, float y, float z, float nx, float ny, float nz, SColor c, float tu, float tv) {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_5(x, y, z, nx, ny, nz, SColor.getCPtr(c), c, tu, tv), true);
  }

  public S3DVertex2TCoords(vector3df pos, vector3df normal, SColor color, vector2df tcoords) {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_6(vector3df.getCPtr(pos), pos, vector3df.getCPtr(normal), normal, SColor.getCPtr(color), color, vector2df.getCPtr(tcoords), tcoords), true);
  }

  public S3DVertex2TCoords(S3DVertex o) {
    this(JirrJNI.new_S3DVertex2TCoords__SWIG_7(S3DVertex.getCPtr(o), o), true);
  }

  public void setTCoords2(vector2df value) {
    JirrJNI.S3DVertex2TCoords_TCoords2_set(swigCPtr, this, vector2df.getCPtr(value), value);
  }

  public vector2df getTCoords2() {
    long cPtr = JirrJNI.S3DVertex2TCoords_TCoords2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector2df(cPtr, false);
  }

  public boolean equalsOperator(S3DVertex2TCoords other) {
    return JirrJNI.S3DVertex2TCoords_equalsOperator(swigCPtr, this, S3DVertex2TCoords.getCPtr(other), other);
  }

  public boolean notEqualsOperator(S3DVertex2TCoords other) {
    return JirrJNI.S3DVertex2TCoords_notEqualsOperator(swigCPtr, this, S3DVertex2TCoords.getCPtr(other), other);
  }

  public boolean lessThanOperator(S3DVertex2TCoords other) {
    return JirrJNI.S3DVertex2TCoords_lessThanOperator(swigCPtr, this, S3DVertex2TCoords.getCPtr(other), other);
  }

  public E_VERTEX_TYPE getType() {
    return E_VERTEX_TYPE.swigToEnum(JirrJNI.S3DVertex2TCoords_getType(swigCPtr, this));
  }

  public S3DVertex2TCoords getInterpolated(S3DVertex2TCoords other, float d) {
    return new S3DVertex2TCoords(JirrJNI.S3DVertex2TCoords_getInterpolated(swigCPtr, this, S3DVertex2TCoords.getCPtr(other), other, d), true);
  }

}
