/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class ITerrainSceneNode extends ISceneNode {
  private long swigCPtr;

  protected ITerrainSceneNode(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.ITerrainSceneNode_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ITerrainSceneNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_ITerrainSceneNode(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public aabbox3df getBoundingBoxConst() {
    return new aabbox3df(JirrJNI.ITerrainSceneNode_getBoundingBoxConst(swigCPtr, this), false);
  }

  public aabbox3df getBoundingBox(int patchX, int patchZ) {
    return new aabbox3df(JirrJNI.ITerrainSceneNode_getBoundingBox(swigCPtr, this, patchX, patchZ), false);
  }

  public long getIndexCount() {
    return JirrJNI.ITerrainSceneNode_getIndexCount(swigCPtr, this);
  }

  public IMesh getMesh() {
    long cPtr = JirrJNI.ITerrainSceneNode_getMesh(swigCPtr, this);
    return (cPtr == 0) ? null : new IMesh(cPtr, false);
  }

  public IMeshBuffer getRenderBuffer() {
    long cPtr = JirrJNI.ITerrainSceneNode_getRenderBuffer(swigCPtr, this);
    return (cPtr == 0) ? null : new IMeshBuffer(cPtr, false);
  }

  public void getMeshBufferForLOD(SWIGTYPE_p_IDynamicMeshBuffer mb, int LOD) {
    JirrJNI.ITerrainSceneNode_getMeshBufferForLOD__SWIG_0(swigCPtr, this, SWIGTYPE_p_IDynamicMeshBuffer.getCPtr(mb), LOD);
  }

  public void getMeshBufferForLOD(SWIGTYPE_p_IDynamicMeshBuffer mb) {
    JirrJNI.ITerrainSceneNode_getMeshBufferForLOD__SWIG_1(swigCPtr, this, SWIGTYPE_p_IDynamicMeshBuffer.getCPtr(mb));
  }

  public int getIndicesForPatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, int patchX, int patchZ, int LOD) {
    return JirrJNI.ITerrainSceneNode_getIndicesForPatch__SWIG_0(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), patchX, patchZ, LOD);
  }

  public int getIndicesForPatch(SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t indices, int patchX, int patchZ) {
    return JirrJNI.ITerrainSceneNode_getIndicesForPatch__SWIG_1(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_unsigned_int_irrAllocatorT_unsigned_int_t_t.getCPtr(indices), patchX, patchZ);
  }

  public int getCurrentLODOfPatches(SWIGTYPE_p_irr__core__arrayT_int_irrAllocatorT_int_t_t LODs) {
    return JirrJNI.ITerrainSceneNode_getCurrentLODOfPatches(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_int_irrAllocatorT_int_t_t.getCPtr(LODs));
  }

  public void setLODOfPatch(int patchX, int patchZ, int LOD) {
    JirrJNI.ITerrainSceneNode_setLODOfPatch__SWIG_0(swigCPtr, this, patchX, patchZ, LOD);
  }

  public void setLODOfPatch(int patchX, int patchZ) {
    JirrJNI.ITerrainSceneNode_setLODOfPatch__SWIG_1(swigCPtr, this, patchX, patchZ);
  }

  public vector3df getTerrainCenter() {
    return new vector3df(JirrJNI.ITerrainSceneNode_getTerrainCenter(swigCPtr, this), false);
  }

  public float getHeight(float x, float y) {
    return JirrJNI.ITerrainSceneNode_getHeight(swigCPtr, this, x, y);
  }

  public void setCameraMovementDelta(float delta) {
    JirrJNI.ITerrainSceneNode_setCameraMovementDelta(swigCPtr, this, delta);
  }

  public void setCameraRotationDelta(float delta) {
    JirrJNI.ITerrainSceneNode_setCameraRotationDelta(swigCPtr, this, delta);
  }

  public void setDynamicSelectorUpdate(boolean bVal) {
    JirrJNI.ITerrainSceneNode_setDynamicSelectorUpdate(swigCPtr, this, bVal);
  }

  public boolean overrideLODDistance(int LOD, double newDistance) {
    return JirrJNI.ITerrainSceneNode_overrideLODDistance(swigCPtr, this, LOD, newDistance);
  }

  public void scaleTexture(float scale, float scale2) {
    JirrJNI.ITerrainSceneNode_scaleTexture__SWIG_0(swigCPtr, this, scale, scale2);
  }

  public void scaleTexture(float scale) {
    JirrJNI.ITerrainSceneNode_scaleTexture__SWIG_1(swigCPtr, this, scale);
  }

  public void scaleTexture() {
    JirrJNI.ITerrainSceneNode_scaleTexture__SWIG_2(swigCPtr, this);
  }

  public boolean loadHeightMap(IReadFile file, SColor vertexColor, int smoothFactor) {
    return JirrJNI.ITerrainSceneNode_loadHeightMap__SWIG_0(swigCPtr, this, IReadFile.getCPtr(file), file, SColor.getCPtr(vertexColor), vertexColor, smoothFactor);
  }

  public boolean loadHeightMap(IReadFile file, SColor vertexColor) {
    return JirrJNI.ITerrainSceneNode_loadHeightMap__SWIG_1(swigCPtr, this, IReadFile.getCPtr(file), file, SColor.getCPtr(vertexColor), vertexColor);
  }

  public boolean loadHeightMap(IReadFile file) {
    return JirrJNI.ITerrainSceneNode_loadHeightMap__SWIG_2(swigCPtr, this, IReadFile.getCPtr(file), file);
  }

  public boolean loadHeightMapRAW(IReadFile file, int bitsPerPixel, boolean signedData, boolean floatVals, int width, SColor vertexColor, int smoothFactor) {
    return JirrJNI.ITerrainSceneNode_loadHeightMapRAW__SWIG_0(swigCPtr, this, IReadFile.getCPtr(file), file, bitsPerPixel, signedData, floatVals, width, SColor.getCPtr(vertexColor), vertexColor, smoothFactor);
  }

  public boolean loadHeightMapRAW(IReadFile file, int bitsPerPixel, boolean signedData, boolean floatVals, int width, SColor vertexColor) {
    return JirrJNI.ITerrainSceneNode_loadHeightMapRAW__SWIG_1(swigCPtr, this, IReadFile.getCPtr(file), file, bitsPerPixel, signedData, floatVals, width, SColor.getCPtr(vertexColor), vertexColor);
  }

  public boolean loadHeightMapRAW(IReadFile file, int bitsPerPixel, boolean signedData, boolean floatVals, int width) {
    return JirrJNI.ITerrainSceneNode_loadHeightMapRAW__SWIG_2(swigCPtr, this, IReadFile.getCPtr(file), file, bitsPerPixel, signedData, floatVals, width);
  }

  public boolean loadHeightMapRAW(IReadFile file, int bitsPerPixel, boolean signedData, boolean floatVals) {
    return JirrJNI.ITerrainSceneNode_loadHeightMapRAW__SWIG_3(swigCPtr, this, IReadFile.getCPtr(file), file, bitsPerPixel, signedData, floatVals);
  }

  public boolean loadHeightMapRAW(IReadFile file, int bitsPerPixel, boolean signedData) {
    return JirrJNI.ITerrainSceneNode_loadHeightMapRAW__SWIG_4(swigCPtr, this, IReadFile.getCPtr(file), file, bitsPerPixel, signedData);
  }

  public boolean loadHeightMapRAW(IReadFile file, int bitsPerPixel) {
    return JirrJNI.ITerrainSceneNode_loadHeightMapRAW__SWIG_5(swigCPtr, this, IReadFile.getCPtr(file), file, bitsPerPixel);
  }

  public boolean loadHeightMapRAW(IReadFile file) {
    return JirrJNI.ITerrainSceneNode_loadHeightMapRAW__SWIG_6(swigCPtr, this, IReadFile.getCPtr(file), file);
  }

}