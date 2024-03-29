/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class S3DVertex {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected S3DVertex(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(S3DVertex obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_S3DVertex(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected static long[] cArrayUnwrap(S3DVertex[] arrayWrapper) {
      long[] cArray = new long[arrayWrapper.length];
      for (int i=0; i<arrayWrapper.length; i++)
        cArray[i] = S3DVertex.getCPtr(arrayWrapper[i]);
      return cArray;
  }

  protected static S3DVertex[] cArrayWrap(long[] cArray, boolean cMemoryOwn) {
    S3DVertex[] arrayWrapper = new S3DVertex[cArray.length];
    for (int i=0; i<cArray.length; i++)
      arrayWrapper[i] = new S3DVertex(cArray[i], cMemoryOwn);
    return arrayWrapper;
  }

  public S3DVertex() {
    this(JirrJNI.new_S3DVertex__SWIG_0(), true);
  }

  public S3DVertex(float x, float y, float z, float nx, float ny, float nz, SColor c, float tu, float tv) {
    this(JirrJNI.new_S3DVertex__SWIG_1(x, y, z, nx, ny, nz, SColor.getCPtr(c), c, tu, tv), true);
  }

  public S3DVertex(vector3df pos, vector3df normal, SColor color, vector2df tcoords) {
    this(JirrJNI.new_S3DVertex__SWIG_2(vector3df.getCPtr(pos), pos, vector3df.getCPtr(normal), normal, SColor.getCPtr(color), color, vector2df.getCPtr(tcoords), tcoords), true);
  }

  public void setPos(vector3df value) {
    JirrJNI.S3DVertex_Pos_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getPos() {
    long cPtr = JirrJNI.S3DVertex_Pos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setNormal(vector3df value) {
    JirrJNI.S3DVertex_Normal_set(swigCPtr, this, vector3df.getCPtr(value), value);
  }

  public vector3df getNormal() {
    long cPtr = JirrJNI.S3DVertex_Normal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector3df(cPtr, false);
  }

  public void setColor(SColor value) {
    JirrJNI.S3DVertex_Color_set(swigCPtr, this, SColor.getCPtr(value), value);
  }

  public SColor getColor() {
    long cPtr = JirrJNI.S3DVertex_Color_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SColor(cPtr, false);
  }

  public void setTCoords(vector2df value) {
    JirrJNI.S3DVertex_TCoords_set(swigCPtr, this, vector2df.getCPtr(value), value);
  }

  public vector2df getTCoords() {
    long cPtr = JirrJNI.S3DVertex_TCoords_get(swigCPtr, this);
    return (cPtr == 0) ? null : new vector2df(cPtr, false);
  }

  public boolean equalsOperator(S3DVertex other) {
    return JirrJNI.S3DVertex_equalsOperator(swigCPtr, this, S3DVertex.getCPtr(other), other);
  }

  public boolean notEqualsOperator(S3DVertex other) {
    return JirrJNI.S3DVertex_notEqualsOperator(swigCPtr, this, S3DVertex.getCPtr(other), other);
  }

  public boolean lessThanOperator(S3DVertex other) {
    return JirrJNI.S3DVertex_lessThanOperator(swigCPtr, this, S3DVertex.getCPtr(other), other);
  }

  public E_VERTEX_TYPE getType() {
    return E_VERTEX_TYPE.swigToEnum(JirrJNI.S3DVertex_getType(swigCPtr, this));
  }

  public S3DVertex getInterpolated(S3DVertex other, float d) {
    return new S3DVertex(JirrJNI.S3DVertex_getInterpolated(swigCPtr, this, S3DVertex.getCPtr(other), other, d), true);
  }

}
