/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class IParticleAffector extends IAttributeExchangingObject {
  private long swigCPtr;

  protected IParticleAffector(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.IParticleAffector_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IParticleAffector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_IParticleAffector(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void affect(long now, SParticle particlearray, long count) {
    JirrJNI.IParticleAffector_affect(swigCPtr, this, now, SParticle.getCPtr(particlearray), particlearray, count);
  }

  public void setEnabled(boolean enabled) {
    JirrJNI.IParticleAffector_setEnabled(swigCPtr, this, enabled);
  }

  public boolean getEnabled() {
    return JirrJNI.IParticleAffector_getEnabled(swigCPtr, this);
  }

  public E_PARTICLE_AFFECTOR_TYPE getType() {
    return E_PARTICLE_AFFECTOR_TYPE.swigToEnum(JirrJNI.IParticleAffector_getType(swigCPtr, this));
  }

}
