/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class ESCENE_NODE_TYPE {
  public static int ESNT_SCENE_MANAGER=1735290227;
  public static int ESNT_CUBE=1700951395;
  public static int ESNT_SPHERE=1919447155;
  public static int ESNT_TEXT=1954047348;
  public static int ESNT_WATER_SURFACE=1920229751;
  public static int ESNT_TERRAIN=1920099700;
  public static int ESNT_SKY_BOX=1601792883;
  public static int ESNT_SKY_DOME=1685678963;
  public static int ESNT_SHADOW_VOLUME=2003069043;
  public static int ESNT_OCTREE=1920230255;
  public static int ESNT_MESH=1752393069;
  public static int ESNT_LIGHT=1952999276;
  public static int ESNT_EMPTY=2037673317;
  public static int ESNT_DUMMY_TRANSFORMATION=2037214564;
  public static int ESNT_CAMERA=1601003875;
  public static int ESNT_BILLBOARD=1819044194;
  public static int ESNT_ANIMATED_MESH=1752395105;
  public static int ESNT_PARTICLE_SYSTEM=1818457200;
  public static int ESNT_Q3SHADER_SCENE_NODE=1752380273;
  public static int ESNT_MD3_SCENE_NODE=1597203565;
  public static int ESNT_VOLUME_LIGHT=1819045750;
  public static int ESNT_CAMERA_MAYA=1299013987;
  public static int ESNT_CAMERA_FPS=1181573475;
  public static int ESNT_UNKNOWN=1852534389;
  public static int ESNT_ANY=1601793633;

  public int swigValue() {
    return swigValue;
  }

  public static ESCENE_NODE_TYPE swigToEnum(int swigValue) {
    ESCENE_NODE_TYPE[] swigValues = ESCENE_NODE_TYPE.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ESCENE_NODE_TYPE swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ESCENE_NODE_TYPE.class + " with value " + swigValue);
  }

  private ESCENE_NODE_TYPE() {
    this.swigValue = SwigNext.next++;
  }

  private ESCENE_NODE_TYPE(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  private ESCENE_NODE_TYPE(ESCENE_NODE_TYPE swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

