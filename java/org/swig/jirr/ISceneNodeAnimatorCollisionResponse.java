/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class ISceneNodeAnimatorCollisionResponse extends ISceneNodeAnimator {
  private long swigCPtr;

  protected ISceneNodeAnimatorCollisionResponse(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.ISceneNodeAnimatorCollisionResponse_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ISceneNodeAnimatorCollisionResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_ISceneNodeAnimatorCollisionResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean isFalling() {
    return JirrJNI.ISceneNodeAnimatorCollisionResponse_isFalling(swigCPtr, this);
  }

  public void setEllipsoidRadius(vector3df radius) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_setEllipsoidRadius(swigCPtr, this, vector3df.getCPtr(radius), radius);
  }

  public vector3df getEllipsoidRadius() {
    return new vector3df(JirrJNI.ISceneNodeAnimatorCollisionResponse_getEllipsoidRadius(swigCPtr, this), true);
  }

  public void setGravity(vector3df gravity) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_setGravity(swigCPtr, this, vector3df.getCPtr(gravity), gravity);
  }

  public vector3df getGravity() {
    return new vector3df(JirrJNI.ISceneNodeAnimatorCollisionResponse_getGravity(swigCPtr, this), true);
  }

  public void jump(float jumpSpeed) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_jump(swigCPtr, this, jumpSpeed);
  }

  public void setAnimateTarget(boolean enable) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_setAnimateTarget(swigCPtr, this, enable);
  }

  public boolean getAnimateTarget() {
    return JirrJNI.ISceneNodeAnimatorCollisionResponse_getAnimateTarget(swigCPtr, this);
  }

  public void setEllipsoidTranslation(vector3df translation) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_setEllipsoidTranslation(swigCPtr, this, vector3df.getCPtr(translation), translation);
  }

  public vector3df getEllipsoidTranslation() {
    return new vector3df(JirrJNI.ISceneNodeAnimatorCollisionResponse_getEllipsoidTranslation(swigCPtr, this), true);
  }

  public void setWorld(ITriangleSelector newWorld) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_setWorld(swigCPtr, this, ITriangleSelector.getCPtr(newWorld), newWorld);
  }

  public ITriangleSelector getWorld() {
    long cPtr = JirrJNI.ISceneNodeAnimatorCollisionResponse_getWorld(swigCPtr, this);
    return (cPtr == 0) ? null : new ITriangleSelector(cPtr, false);
  }

  public void setTargetNode(ISceneNode node) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_setTargetNode(swigCPtr, this, ISceneNode.getCPtr(node), node);
  }

  public ISceneNode getTargetNode() {
    long cPtr = JirrJNI.ISceneNodeAnimatorCollisionResponse_getTargetNode(swigCPtr, this);
    return (cPtr == 0) ? null : new ISceneNode(cPtr, false);
  }

  public boolean collisionOccurred() {
    return JirrJNI.ISceneNodeAnimatorCollisionResponse_collisionOccurred(swigCPtr, this);
  }

  public vector3df getCollisionPoint() {
    return new vector3df(JirrJNI.ISceneNodeAnimatorCollisionResponse_getCollisionPoint(swigCPtr, this), false);
  }

  public triangle3df getCollisionTriangle() {
    return new triangle3df(JirrJNI.ISceneNodeAnimatorCollisionResponse_getCollisionTriangle(swigCPtr, this), false);
  }

  public vector3df getCollisionResultPosition() {
    return new vector3df(JirrJNI.ISceneNodeAnimatorCollisionResponse_getCollisionResultPosition(swigCPtr, this), false);
  }

  public ISceneNode getCollisionNode() {
    long cPtr = JirrJNI.ISceneNodeAnimatorCollisionResponse_getCollisionNode(swigCPtr, this);
    return (cPtr == 0) ? null : new ISceneNode(cPtr, false);
  }

  public void setCollisionCallback(ICollisionCallback callback) {
    JirrJNI.ISceneNodeAnimatorCollisionResponse_setCollisionCallback(swigCPtr, this, ICollisionCallback.getCPtr(callback), callback);
  }

}
