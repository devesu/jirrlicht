/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package org.swig.jirr;

public enum MATERIAL_FLAG {

    /**
     * Draw as wireframe or filled triangles? Default: false
     */
    EMF_WIREFRAME(0x1),
    /**
     * Draw as point cloud or filled triangles? Default: false
     */
    EMF_POINTCLOUD(0x2),
    /**
     * Flat or Gouraud shading? Default: true
     */
    EMF_GOURAUD_SHADING(0x4),
    /**
     * Will this material be lighted? Default: true
     */
    EMF_LIGHTING(0x8),
    /**
     * Is the ZBuffer enabled? Default: true
     */
    EMF_ZBUFFER(0x10),
    /**
     * May be written to the zbuffer or is it readonly. Default: true This flag
     * is ignored, if the material type is a transparent type.
     */
    EMF_ZWRITE_ENABLE(0x20),
    /**
     * Is backface culling enabled? Default: true
     */
    EMF_BACK_FACE_CULLING(0x40),
    /**
     * Is frontface culling enabled? Default: false Overrides
     * EMF_BACK_FACE_CULLING if both are enabled.
     */
    EMF_FRONT_FACE_CULLING(0x80),
    /**
     * Is bilinear filtering enabled? Default: true
     */
    EMF_BILINEAR_FILTER(0x100),
    /**
     * Is trilinear filtering enabled? Default: false If the trilinear filter
     * flag is enabled, the bilinear filtering flag is ignored.
     */
    EMF_TRILINEAR_FILTER(0x200),
    /**
     * Is anisotropic filtering? Default: false In Irrlicht you can use
     * anisotropic texture filtering in conjunction with bilinear or trilinear
     * texture filtering to improve rendering results. Primitives will look less
     * blurry with this flag switched on.
     */
    EMF_ANISOTROPIC_FILTER(0x400),
    /**
     * Is fog enabled? Default: false
     */
    EMF_FOG_ENABLE(0x800),
    /**
     * Normalizes normals. Default: false You can enable this if you need to
     * scale a dynamic lighted model. Usually, its normals will get scaled too
     * then and it will get darker. If you enable the EMF_NORMALIZE_NORMALS
     * flag, the normals will be normalized again, and the model will look as
     * bright as it should.
     */
    EMF_NORMALIZE_NORMALS(0x1000),
    /**
     * ! Access to all layers texture wrap settings. Overwrites separate layer
     * settings.
     */
    EMF_TEXTURE_WRAP(0x2000),
    /**
     * AntiAliasing mode
     */
    EMF_ANTI_ALIASING(0x4000),
    /**
     * ColorMask bits, for enabling the color planes
     */
    EMF_COLOR_MASK(0x8000),
    /**
     * ColorMaterial enum for vertex color interpretation
     */
    EMF_COLOR_MATERIAL(0x10000),
    /**
     * Flag for enabling/disabling mipmap usage
     */
    EMF_USE_MIP_MAPS(0x20000),
    /**
     * Flag for blend operation
     */
    EMF_BLEND_OPERATION(0x40000),
    /**
     * Flag for polygon offset
     */
    EMF_POLYGON_OFFSET(0x80000);
    private long swigCPtr;

    public static MATERIAL_FLAG getByValue(long value) {
        switch ((int)value) {
            case 0x1:
                return EMF_WIREFRAME;
            case 0x2:
                return EMF_POINTCLOUD;
            case 0x4:
                return EMF_GOURAUD_SHADING;
            case 0x8:
                return EMF_LIGHTING;
            case 0x10:
                return EMF_ZBUFFER;
            case 0x20:
                return EMF_ZWRITE_ENABLE;
            case 0x40:
                return EMF_BACK_FACE_CULLING;
            case 0x80:
                return EMF_FRONT_FACE_CULLING;
            case 0x100:
                return EMF_BILINEAR_FILTER;
            case 0x200:
                return EMF_TRILINEAR_FILTER;
            case 0x400:
                return EMF_ANISOTROPIC_FILTER;
            case 0x800:
                return EMF_FOG_ENABLE;
            case 0x1000:
                return EMF_NORMALIZE_NORMALS;
            case 0x2000:
                return EMF_TEXTURE_WRAP;
            case 0x4000:
                return EMF_ANTI_ALIASING;
            case 0x8000:
                return EMF_COLOR_MASK;
            case 0x10000:
                return EMF_COLOR_MATERIAL;
            case 0x20000:
                return EMF_USE_MIP_MAPS;
            case 0x40000:
                return EMF_BLEND_OPERATION;
            case 0x80000:
                return EMF_POLYGON_OFFSET;
        }
        return null;
    }

    private MATERIAL_FLAG(long cPtr) {
        swigCPtr = cPtr;
    }

    public long getCPtr() {
        return swigCPtr;
    }
}