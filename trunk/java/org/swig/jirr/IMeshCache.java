/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IMeshCache {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected IMeshCache(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IMeshCache obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IMeshCache(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void addMesh(String name, IAnimatedMesh mesh) {
    JirrJNI.IMeshCache_addMesh(swigCPtr, this, CorePath.getCPtr(name), IAnimatedMesh.getCPtr(mesh), mesh);
  }

  public void removeMesh(IMesh mesh) {
    JirrJNI.IMeshCache_removeMesh(swigCPtr, this, IMesh.getCPtr(mesh), mesh);
  }

  public long getMeshCount() {
    return JirrJNI.IMeshCache_getMeshCount(swigCPtr, this);
  }

  public int getMeshIndex(IMesh mesh) {
    return JirrJNI.IMeshCache_getMeshIndex(swigCPtr, this, IMesh.getCPtr(mesh), mesh);
  }

  public IAnimatedMesh getMeshByIndex(long index) {
    long cPtr = JirrJNI.IMeshCache_getMeshByIndex(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IAnimatedMesh(cPtr, false);
  }

  public IAnimatedMesh getMeshByFilename(String filename) {
    long cPtr = JirrJNI.IMeshCache_getMeshByFilename(swigCPtr, this, CorePath.getCPtr(filename));
    return (cPtr == 0) ? null : new IAnimatedMesh(cPtr, false);
  }

  public String getMeshFilename(long index) {
    return new CorePath(JirrJNI.IMeshCache_getMeshFilename__SWIG_0(swigCPtr, this, index), false).getText();
  }

  public String getMeshFilename(IMesh mesh) {
    return new CorePath(JirrJNI.IMeshCache_getMeshFilename__SWIG_1(swigCPtr, this, IMesh.getCPtr(mesh), mesh), false).getText();
  }

  public boolean setMeshFilename(long index, String filename) {
    return JirrJNI.IMeshCache_setMeshFilename__SWIG_0(swigCPtr, this, index, CorePath.getCPtr(filename));
  }

  public boolean setMeshFilename(IMesh mesh, String filename) {
    return JirrJNI.IMeshCache_setMeshFilename__SWIG_1(swigCPtr, this, IMesh.getCPtr(mesh), mesh, CorePath.getCPtr(filename));
  }

  public IAnimatedMesh getMeshByName(String name) {
    long cPtr = JirrJNI.IMeshCache_getMeshByName(swigCPtr, this, CorePath.getCPtr(name));
    return (cPtr == 0) ? null : new IAnimatedMesh(cPtr, false);
  }

  public SWIGTYPE_p_irr__io__SNamedPath getMeshName(long index) {
    return new SWIGTYPE_p_irr__io__SNamedPath(JirrJNI.IMeshCache_getMeshName__SWIG_0(swigCPtr, this, index), false);
  }

  public SWIGTYPE_p_irr__io__SNamedPath getMeshName(IMesh mesh) {
    return new SWIGTYPE_p_irr__io__SNamedPath(JirrJNI.IMeshCache_getMeshName__SWIG_1(swigCPtr, this, IMesh.getCPtr(mesh), mesh), false);
  }

  public boolean renameMesh(long index, String name) {
    return JirrJNI.IMeshCache_renameMesh__SWIG_0(swigCPtr, this, index, CorePath.getCPtr(name));
  }

  public boolean renameMesh(IMesh mesh, String name) {
    return JirrJNI.IMeshCache_renameMesh__SWIG_1(swigCPtr, this, IMesh.getCPtr(mesh), mesh, CorePath.getCPtr(name));
  }

  public boolean isMeshLoaded(String name) {
    return JirrJNI.IMeshCache_isMeshLoaded(swigCPtr, this, CorePath.getCPtr(name));
  }

  public void clear() {
    JirrJNI.IMeshCache_clear(swigCPtr, this);
  }

  public void clearUnusedMeshes() {
    JirrJNI.IMeshCache_clearUnusedMeshes(swigCPtr, this);
  }

}
