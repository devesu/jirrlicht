/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class SMesh extends IMesh {
  private long swigCPtr;

  protected SMesh(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.SMesh_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_SMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SMesh() {
    this(JirrJNI.new_SMesh(), true);
  }

  public void clear() {
    JirrJNI.SMesh_clear(swigCPtr, this);
  }

  public long getMeshBufferCount() {
    return JirrJNI.SMesh_getMeshBufferCount(swigCPtr, this);
  }

  public IMeshBuffer getMeshBuffer(long nr) {
    long cPtr = JirrJNI.SMesh_getMeshBuffer__SWIG_0(swigCPtr, this, nr);
    return (cPtr == 0) ? null : new IMeshBuffer(cPtr, false);
  }

  public IMeshBuffer getMeshBuffer(SMaterial material) {
    long cPtr = JirrJNI.SMesh_getMeshBuffer__SWIG_1(swigCPtr, this, SMaterial.getCPtr(material), material);
    return (cPtr == 0) ? null : new IMeshBuffer(cPtr, false);
  }

  public aabbox3df getBoundingBoxConst() {
    return new aabbox3df(JirrJNI.SMesh_getBoundingBoxConst(swigCPtr, this), false);
  }

  public void setBoundingBox(aabbox3df box) {
    JirrJNI.SMesh_setBoundingBox(swigCPtr, this, aabbox3df.getCPtr(box), box);
  }

  public void recalculateBoundingBox() {
    JirrJNI.SMesh_recalculateBoundingBox(swigCPtr, this);
  }

  public void addMeshBuffer(IMeshBuffer buf) {
    JirrJNI.SMesh_addMeshBuffer(swigCPtr, this, IMeshBuffer.getCPtr(buf), buf);
  }

  public void setMaterialFlag(MATERIAL_FLAG flag, boolean newvalue) {
    JirrJNI.SMesh_setMaterialFlag(swigCPtr, this, flag.getCPtr(), newvalue);
  }

  public void setHardwareMappingHint(SWIGTYPE_p_E_HARDWARE_MAPPING newMappingHint, SWIGTYPE_p_E_BUFFER_TYPE buffer) {
    JirrJNI.SMesh_setHardwareMappingHint__SWIG_0(swigCPtr, this, SWIGTYPE_p_E_HARDWARE_MAPPING.getCPtr(newMappingHint), SWIGTYPE_p_E_BUFFER_TYPE.getCPtr(buffer));
  }

  public void setHardwareMappingHint(SWIGTYPE_p_E_HARDWARE_MAPPING newMappingHint) {
    JirrJNI.SMesh_setHardwareMappingHint__SWIG_1(swigCPtr, this, SWIGTYPE_p_E_HARDWARE_MAPPING.getCPtr(newMappingHint));
  }

  public void setDirty(SWIGTYPE_p_E_BUFFER_TYPE buffer) {
    JirrJNI.SMesh_setDirty__SWIG_0(swigCPtr, this, SWIGTYPE_p_E_BUFFER_TYPE.getCPtr(buffer));
  }

  public void setDirty() {
    JirrJNI.SMesh_setDirty__SWIG_1(swigCPtr, this);
  }

  public void setMeshBuffers(SWIGTYPE_p_irr__core__arrayT_irr__scene__IMeshBuffer_p_irrAllocatorT_irr__scene__IMeshBuffer_p_t_t value) {
    JirrJNI.SMesh_MeshBuffers_set(swigCPtr, this, SWIGTYPE_p_irr__core__arrayT_irr__scene__IMeshBuffer_p_irrAllocatorT_irr__scene__IMeshBuffer_p_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_irr__core__arrayT_irr__scene__IMeshBuffer_p_irrAllocatorT_irr__scene__IMeshBuffer_p_t_t getMeshBuffers() {
    long cPtr = JirrJNI.SMesh_MeshBuffers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_irr__core__arrayT_irr__scene__IMeshBuffer_p_irrAllocatorT_irr__scene__IMeshBuffer_p_t_t(cPtr, false);
  }

}