/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class ISceneNode extends IAttributeExchangingObject {
  protected long swigCPtr;

  protected ISceneNode(long cPtr, boolean cMemoryOwn) {
    super(JirrJNI.ISceneNode_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ISceneNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

    @Override
    @SuppressWarnings("FinalizeDeclaration")
  protected void finalize() {
        super.finalize();
    delete();
  }

    @Override
  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_ISceneNode(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    JirrJNI.ISceneNode_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    JirrJNI.ISceneNode_change_ownership(this, swigCPtr, true);
  }

  public ISceneNode(ISceneNode parent, ISceneManager mgr, int id, vector3df position, vector3df rotation, vector3df scale) {
    this(JirrJNI.new_ISceneNode__SWIG_0(ISceneNode.getCPtr(parent), parent, ISceneManager.getCPtr(mgr), mgr, id, vector3df.getCPtr(position), position, vector3df.getCPtr(rotation), rotation, vector3df.getCPtr(scale), scale), true);
    JirrJNI.ISceneNode_director_connect(this, swigCPtr, swigCMemOwn, true);
  }
  
  public ISceneNode(ISceneNode parent, ISceneManager mgr, int id, vector3df position, vector3df rotation) {
    this(JirrJNI.new_ISceneNode__SWIG_1(ISceneNode.getCPtr(parent), parent, ISceneManager.getCPtr(mgr), mgr, id, vector3df.getCPtr(position), position, vector3df.getCPtr(rotation), rotation), true);
    JirrJNI.ISceneNode_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public ISceneNode(ISceneNode parent, ISceneManager mgr, int id, vector3df position) {
    this(JirrJNI.new_ISceneNode__SWIG_2(ISceneNode.getCPtr(parent), parent, ISceneManager.getCPtr(mgr), mgr, id, vector3df.getCPtr(position), position), true);
    JirrJNI.ISceneNode_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public ISceneNode(ISceneNode parent, ISceneManager mgr, int id) {
    this(JirrJNI.new_ISceneNode__SWIG_3(ISceneNode.getCPtr(parent), parent, ISceneManager.getCPtr(mgr), mgr, id), true);
    JirrJNI.ISceneNode_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public ISceneNode(ISceneNode parent, ISceneManager mgr) {
    this(JirrJNI.new_ISceneNode__SWIG_4(ISceneNode.getCPtr(parent), parent, ISceneManager.getCPtr(mgr), mgr), true);
    JirrJNI.ISceneNode_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void OnRegisterSceneNode() {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_OnRegisterSceneNode(swigCPtr, this);
        } else {
            JirrJNI.ISceneNode_OnRegisterSceneNodeSwigExplicitISceneNode(swigCPtr, this);
        }
  }

  public void OnAnimate(long timeMs) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_OnAnimate(swigCPtr, this, timeMs);
        } else {
            JirrJNI.ISceneNode_OnAnimateSwigExplicitISceneNode(swigCPtr, this, timeMs);
        }
  }

  public void render() {
    JirrJNI.ISceneNode_render(swigCPtr, this);
  }

  public String getName() {
    return JirrJNI.ISceneNode_getName(swigCPtr, this);
  }

  public void setName(String name) {
    JirrJNI.ISceneNode_setName__SWIG_0(swigCPtr, this, name);
  }

  public void setName(SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t name) {
    JirrJNI.ISceneNode_setName__SWIG_1(swigCPtr, this, SWIGTYPE_p_irr__core__stringT_char_irrAllocatorT_char_t_t.getCPtr(name));
  }

  public aabbox3df getBoundingBoxConst() {
    return new aabbox3df(JirrJNI.ISceneNode_getBoundingBoxConst(swigCPtr, this), false);
  }

  public aabbox3df getTransformedBoundingBox() {
    return new aabbox3df((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getTransformedBoundingBox(swigCPtr, this) : JirrJNI.ISceneNode_getTransformedBoundingBoxSwigExplicitISceneNode(swigCPtr, this), true);
  }

  public CMatrix4f getAbsoluteTransformation() {
    return new CMatrix4f((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getAbsoluteTransformation(swigCPtr, this) : JirrJNI.ISceneNode_getAbsoluteTransformationSwigExplicitISceneNode(swigCPtr, this), false);
  }

  public CMatrix4f getRelativeTransformation() {
    return new CMatrix4f((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getRelativeTransformation(swigCPtr, this) : JirrJNI.ISceneNode_getRelativeTransformationSwigExplicitISceneNode(swigCPtr, this), true);
  }

  public boolean isVisible() {
    return (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_isVisible(swigCPtr, this) : JirrJNI.ISceneNode_isVisibleSwigExplicitISceneNode(swigCPtr, this);
  }

  public boolean isTrulyVisible() {
    return (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_isTrulyVisible(swigCPtr, this) : JirrJNI.ISceneNode_isTrulyVisibleSwigExplicitISceneNode(swigCPtr, this);
  }

  public void setVisible(boolean isVisible) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setVisible(swigCPtr, this, isVisible);
        } else {
            JirrJNI.ISceneNode_setVisibleSwigExplicitISceneNode(swigCPtr, this, isVisible);
        }
  }

  public int getID() {
    return (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getID(swigCPtr, this) : JirrJNI.ISceneNode_getIDSwigExplicitISceneNode(swigCPtr, this);
  }

  public void setID(int id) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setID(swigCPtr, this, id);
        } else {
            JirrJNI.ISceneNode_setIDSwigExplicitISceneNode(swigCPtr, this, id);
        }
  }

  public void addChild(ISceneNode child) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_addChild(swigCPtr, this, ISceneNode.getCPtr(child), child);
        } else {
            JirrJNI.ISceneNode_addChildSwigExplicitISceneNode(swigCPtr, this, ISceneNode.getCPtr(child), child);
        }
  }

  public boolean removeChild(ISceneNode child) {
    return (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_removeChild(swigCPtr, this, ISceneNode.getCPtr(child), child) : JirrJNI.ISceneNode_removeChildSwigExplicitISceneNode(swigCPtr, this, ISceneNode.getCPtr(child), child);
  }

  public void removeAll() {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_removeAll(swigCPtr, this);
        } else {
            JirrJNI.ISceneNode_removeAllSwigExplicitISceneNode(swigCPtr, this);
        }
  }

  public void remove() {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_remove(swigCPtr, this);
        } else {
            JirrJNI.ISceneNode_removeSwigExplicitISceneNode(swigCPtr, this);
        }
  }

  public void addAnimator(ISceneNodeAnimator animator) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_addAnimator(swigCPtr, this, ISceneNodeAnimator.getCPtr(animator), animator);
        } else {
            JirrJNI.ISceneNode_addAnimatorSwigExplicitISceneNode(swigCPtr, this, ISceneNodeAnimator.getCPtr(animator), animator);
        }
  }

  public SWIGTYPE_p_irr__core__listT_irr__scene__ISceneNodeAnimator_p_t getAnimators() {
    return new SWIGTYPE_p_irr__core__listT_irr__scene__ISceneNodeAnimator_p_t(JirrJNI.ISceneNode_getAnimators(swigCPtr, this), false);
  }

  public void removeAnimator(ISceneNodeAnimator animator) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_removeAnimator(swigCPtr, this, ISceneNodeAnimator.getCPtr(animator), animator);
        } else {
            JirrJNI.ISceneNode_removeAnimatorSwigExplicitISceneNode(swigCPtr, this, ISceneNodeAnimator.getCPtr(animator), animator);
        }
  }

  public void removeAnimators() {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_removeAnimators(swigCPtr, this);
        } else {
            JirrJNI.ISceneNode_removeAnimatorsSwigExplicitISceneNode(swigCPtr, this);
        }
  }

  public SMaterial getMaterial(long num) {
    return new SMaterial(JirrJNI.ISceneNode_getMaterial(swigCPtr, this, num), false);
  }

  public long getMaterialCount() {
    return (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getMaterialCount(swigCPtr, this) : JirrJNI.ISceneNode_getMaterialCountSwigExplicitISceneNode(swigCPtr, this);
  }

  public void setMaterialFlag(MATERIAL_FLAG flag, boolean newvalue) {
    long flagL=flag.getCPtr();
      JirrJNI.ISceneNode_setMaterialFlag(swigCPtr, this, flagL, newvalue);
  }

  public void setMaterialTexture(long textureLayer, ITexture texture) {
    JirrJNI.ISceneNode_setMaterialTexture(swigCPtr, this, textureLayer, ITexture.getCPtr(texture), texture);
  }

  public void setMaterialType(SWIGTYPE_p_irr__video__E_MATERIAL_TYPE newType) {
    JirrJNI.ISceneNode_setMaterialType(swigCPtr, this, SWIGTYPE_p_irr__video__E_MATERIAL_TYPE.getCPtr(newType));
  }

  public vector3df getScale() {
    return new vector3df((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getScale(swigCPtr, this) : JirrJNI.ISceneNode_getScaleSwigExplicitISceneNode(swigCPtr, this), false);
  }

  public void setScale(vector3df scale) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setScale(swigCPtr, this, vector3df.getCPtr(scale), scale);
        } else {
            JirrJNI.ISceneNode_setScaleSwigExplicitISceneNode(swigCPtr, this, vector3df.getCPtr(scale), scale);
        }
  }

  public vector3df getRotation() {
    return new vector3df((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getRotation(swigCPtr, this) : JirrJNI.ISceneNode_getRotationSwigExplicitISceneNode(swigCPtr, this), false);
  }

  public void setRotation(vector3df rotation) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setRotation(swigCPtr, this, vector3df.getCPtr(rotation), rotation);
        } else {
            JirrJNI.ISceneNode_setRotationSwigExplicitISceneNode(swigCPtr, this, vector3df.getCPtr(rotation), rotation);
        }
  }
  
  public void setRotationLocal(vector3df rotation) {
    JirrJNI.ISceneNode_setLocalRotation(swigCPtr, vector3df.getCPtr(rotation));
  }

  public vector3df getPosition() {
    return new vector3df((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getPosition(swigCPtr, this) : JirrJNI.ISceneNode_getPositionSwigExplicitISceneNode(swigCPtr, this), false);
  }
  
  public vector3df convertLocalVectorToGlobalSpace(vector3df localPoint) {
      long newVectorPointer=JirrJNI.ISceneNode_mapLocalPositionToGlobalSpace(swigCPtr, vector3df.getCPtr(localPoint));
      return new vector3df(newVectorPointer , false);
  }
  
  public vector3df convertGlobalVectorToLocalSpace(vector3df localPoint) {
      long newVectorPointer=JirrJNI.ISceneNode_mapGlobalPositionToLocalSpace(swigCPtr, vector3df.getCPtr(localPoint));
      return new vector3df(newVectorPointer , false);
  }

  public void setPosition(vector3df newpos) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setPosition(swigCPtr, this, vector3df.getCPtr(newpos), newpos);
        } else {
            JirrJNI.ISceneNode_setPositionSwigExplicitISceneNode(swigCPtr, this, vector3df.getCPtr(newpos), newpos);
        }
  }

  public vector3df getAbsolutePosition() {
    return new vector3df((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getAbsolutePosition(swigCPtr, this) : JirrJNI.ISceneNode_getAbsolutePositionSwigExplicitISceneNode(swigCPtr, this), true);
  }

  public void setAutomaticCulling(long state) {
    JirrJNI.ISceneNode_setAutomaticCulling(swigCPtr, this, state);
  }

  public long getAutomaticCulling() {
    return JirrJNI.ISceneNode_getAutomaticCulling(swigCPtr, this);
  }

  public void setDebugDataVisible(long state) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setDebugDataVisible(swigCPtr, this, state);
        } else {
            JirrJNI.ISceneNode_setDebugDataVisibleSwigExplicitISceneNode(swigCPtr, this, state);
        }
  }

  public long isDebugDataVisible() {
    return JirrJNI.ISceneNode_isDebugDataVisible(swigCPtr, this);
  }

  public void setIsDebugObject(boolean debugObject) {
    JirrJNI.ISceneNode_setIsDebugObject(swigCPtr, this, debugObject);
  }

  public boolean isDebugObject() {
    return JirrJNI.ISceneNode_isDebugObject(swigCPtr, this);
  }

  public SWIGTYPE_p_irr__core__listT_irr__scene__ISceneNode_p_t getChildren() {
    return new SWIGTYPE_p_irr__core__listT_irr__scene__ISceneNode_p_t(JirrJNI.ISceneNode_getChildren(swigCPtr, this), false);
  }

  public void setParent(ISceneNode newParent) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setParent(swigCPtr, this, ISceneNode.getCPtr(newParent), newParent);
        } else {
            JirrJNI.ISceneNode_setParentSwigExplicitISceneNode(swigCPtr, this, ISceneNode.getCPtr(newParent), newParent);
        }
  }

  public ITriangleSelector getTriangleSelector() {
    long cPtr = JirrJNI.ISceneNode_getTriangleSelector(swigCPtr, this);
    return (cPtr == 0) ? null : new ITriangleSelector(cPtr, false);
  }

  public void setTriangleSelector(ITriangleSelector selector) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_setTriangleSelector(swigCPtr, this, ITriangleSelector.getCPtr(selector), selector);
        } else {
            JirrJNI.ISceneNode_setTriangleSelectorSwigExplicitISceneNode(swigCPtr, this, ITriangleSelector.getCPtr(selector), selector);
        }
  }

  public void updateAbsolutePosition() {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_updateAbsolutePosition(swigCPtr, this);
        } else {
            JirrJNI.ISceneNode_updateAbsolutePositionSwigExplicitISceneNode(swigCPtr, this);
        }
  }
  
  public void moveObjectLocalCoordinates(vector3df direction){
      vector3df dir=getRotation().rotationToDirection(direction);
      setPosition(getPosition().addOperator(dir));
  }

  public ISceneNode getParent() {
    long cPtr = JirrJNI.ISceneNode_getParent(swigCPtr, this);
    return (cPtr == 0) ? null : new ISceneNode(cPtr, false);
  }

  public ESCENE_NODE_TYPE getType() {
    return ESCENE_NODE_TYPE.swigToEnum((getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getType(swigCPtr, this) : JirrJNI.ISceneNode_getTypeSwigExplicitISceneNode(swigCPtr, this));
  }

    @Override
  public void serializeAttributes(IAttributes out, SAttributeReadWriteOptions options) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_serializeAttributes__SWIG_0(swigCPtr, this, IAttributes.getCPtr(out), out, SAttributeReadWriteOptions.getCPtr(options), options);
        } else {
            JirrJNI.ISceneNode_serializeAttributesSwigExplicitISceneNode__SWIG_0(swigCPtr, this, IAttributes.getCPtr(out), out, SAttributeReadWriteOptions.getCPtr(options), options);
        }
  }

    @Override
  public void serializeAttributes(IAttributes out) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_serializeAttributes__SWIG_1(swigCPtr, this, IAttributes.getCPtr(out), out);
        } else {
            JirrJNI.ISceneNode_serializeAttributesSwigExplicitISceneNode__SWIG_1(swigCPtr, this, IAttributes.getCPtr(out), out);
        }
  }

    @Override
  public void deserializeAttributes(IAttributes in, SAttributeReadWriteOptions options) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_deserializeAttributes__SWIG_0(swigCPtr, this, IAttributes.getCPtr(in), in, SAttributeReadWriteOptions.getCPtr(options), options);
        } else {
            JirrJNI.ISceneNode_deserializeAttributesSwigExplicitISceneNode__SWIG_0(swigCPtr, this, IAttributes.getCPtr(in), in, SAttributeReadWriteOptions.getCPtr(options), options);
        }
  }

    @Override
  public void deserializeAttributes(IAttributes in) {
    if (getClass() == ISceneNode.class) {
            JirrJNI.ISceneNode_deserializeAttributes__SWIG_1(swigCPtr, this, IAttributes.getCPtr(in), in);
        } else {
            JirrJNI.ISceneNode_deserializeAttributesSwigExplicitISceneNode__SWIG_1(swigCPtr, this, IAttributes.getCPtr(in), in);
        }
  }

  public ISceneNode clone(ISceneNode newParent, ISceneManager newManager) {
    long cPtr = (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_clone__SWIG_0(swigCPtr, this, ISceneNode.getCPtr(newParent), newParent, ISceneManager.getCPtr(newManager), newManager) : JirrJNI.ISceneNode_cloneSwigExplicitISceneNode__SWIG_0(swigCPtr, this, ISceneNode.getCPtr(newParent), newParent, ISceneManager.getCPtr(newManager), newManager);
    return (cPtr == 0) ? null : new ISceneNode(cPtr, false);
  }

  public ISceneNode clone(ISceneNode newParent) {
    long cPtr = (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_clone__SWIG_1(swigCPtr, this, ISceneNode.getCPtr(newParent), newParent) : JirrJNI.ISceneNode_cloneSwigExplicitISceneNode__SWIG_1(swigCPtr, this, ISceneNode.getCPtr(newParent), newParent);
    return (cPtr == 0) ? null : new ISceneNode(cPtr, false);
  }

    @Override
  public ISceneNode clone() {
    long cPtr = (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_clone__SWIG_2(swigCPtr, this) : JirrJNI.ISceneNode_cloneSwigExplicitISceneNode__SWIG_2(swigCPtr, this);
    return (cPtr == 0) ? null : new ISceneNode(cPtr, false);
  }

  public ISceneManager getSceneManager() {
    long cPtr = (getClass() == ISceneNode.class) ? JirrJNI.ISceneNode_getSceneManager(swigCPtr, this) : JirrJNI.ISceneNode_getSceneManagerSwigExplicitISceneNode(swigCPtr, this);
    return (cPtr == 0) ? null : new ISceneManager(cPtr, false);
  }

  public void setMaterialTypeByInt(int type) {
    JirrJNI.ISceneNode_setMaterialTypeByInt(swigCPtr, this, type);
  }

  public void OnRegisterSceneNodeJava() {
    JirrJNI.ISceneNode_OnRegisterSceneNodeJava(swigCPtr, this);
  }

  public S3DVertex getDefaultVertices() {
    long cPtr = JirrJNI.ISceneNode_getDefaultVertices(swigCPtr, this);
    return (cPtr == 0) ? null : new S3DVertex(cPtr, false);
  }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.swigCPtr ^ (this.swigCPtr >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final ISceneNode other = (ISceneNode) obj;
        if (this.swigCPtr != other.swigCPtr) {
            return false;
        }
        return true;
    }
  
}
