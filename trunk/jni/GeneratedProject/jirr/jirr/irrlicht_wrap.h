/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 * 
 * This file is not intended to be easily readable and contains a number of 
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG 
 * interface file instead. 
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_Jirr_WRAP_H_
#define SWIG_Jirr_WRAP_H_

class SwigDirector_IEventReceiver : public irr::IEventReceiver, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_IEventReceiver(JNIEnv *jenv);
    virtual ~SwigDirector_IEventReceiver();
    virtual bool OnEvent(irr::SEvent const &event);
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    bool swig_override[1];
};

class SwigDirector_ISceneNode : public irr::scene::ISceneNode, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_ISceneNode(JNIEnv *jenv, irr::scene::ISceneNode *parent, irr::scene::ISceneManager *mgr, irr::s32 id = -1, irr::core::vector3df const &position = irr::core::vector3df(0,0,0), irr::core::vector3df const &rotation = irr::core::vector3df(0,0,0), irr::core::vector3df const &scale = irr::core::vector3df(1.0f, 1.0f, 1.0f));
    virtual void serializeAttributes(irr::io::IAttributes *out, irr::io::SAttributeReadWriteOptions *options = 0) const;
    virtual void deserializeAttributes(irr::io::IAttributes *in, irr::io::SAttributeReadWriteOptions *options = 0);
    virtual ~SwigDirector_ISceneNode();
    virtual void OnRegisterSceneNode();
    virtual void OnAnimate(irr::u32 timeMs);
    virtual void render();
    virtual irr::core::aabbox3d< irr::f32 > const &getBoundingBox() const;
    virtual irr::core::aabbox3d< irr::f32 > const getTransformedBoundingBox() const;
    virtual irr::core::matrix4 const &getAbsoluteTransformation() const;
    virtual irr::core::matrix4 getRelativeTransformation() const;
    virtual bool isVisible() const;
    virtual bool isTrulyVisible() const;
    virtual void setVisible(bool isVisible);
    virtual irr::s32 getID() const;
    virtual void setID(irr::s32 id);
    virtual void addChild(irr::scene::ISceneNode *child);
    virtual bool removeChild(irr::scene::ISceneNode *child);
    virtual void removeAll();
    virtual void remove();
    virtual void addAnimator(irr::scene::ISceneNodeAnimator *animator);
    virtual void removeAnimator(irr::scene::ISceneNodeAnimator *animator);
    virtual void removeAnimators();
    virtual irr::u32 getMaterialCount() const;
    virtual irr::core::vector3df const &getScale() const;
    virtual void setScale(irr::core::vector3df const &scale);
    virtual irr::core::vector3df const &getRotation() const;
    virtual void setRotation(irr::core::vector3df const &rotation);
    virtual irr::core::vector3df const &getPosition() const;
    virtual void setPosition(irr::core::vector3df const &newpos);
    virtual irr::core::vector3df getAbsolutePosition() const;
    virtual void setDebugDataVisible(irr::u32 state);
    virtual void setParent(irr::scene::ISceneNode *newParent);
    virtual void setTriangleSelector(irr::scene::ITriangleSelector *selector);
    virtual void updateAbsolutePosition();
    virtual irr::scene::ESCENE_NODE_TYPE getType() const;
    virtual irr::scene::ISceneNode *clone(irr::scene::ISceneNode *newParent = 0, irr::scene::ISceneManager *newManager = 0);
    virtual irr::scene::ISceneManager *getSceneManager() const;
public:
    bool swig_overrides(int n) {
      return (n < 40 ? swig_override[n] : false);
    }
protected:
    bool swig_override[40];
};

class SwigDirector_IShaderConstantSetCallBack : public irr::video::IShaderConstantSetCallBack, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_IShaderConstantSetCallBack(JNIEnv *jenv);
    virtual void OnSetMaterial(irr::video::SMaterial const &material);
    virtual void OnSetConstants(irr::video::IMaterialRendererServices *services, irr::s32 userData);
public:
    bool swig_overrides(int n) {
      return (n < 2 ? swig_override[n] : false);
    }
protected:
    bool swig_override[2];
};


#endif
