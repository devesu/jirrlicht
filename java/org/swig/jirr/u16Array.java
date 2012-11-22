/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.swig.jirr;

public class u16Array {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected u16Array(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(u16Array obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        JirrJNI.delete_u16Array(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public u16Array() {
    this(JirrJNI.new_u16Array__SWIG_0(), true);
  }

  public u16Array(long start_count) {
    this(JirrJNI.new_u16Array__SWIG_1(start_count), true);
  }

  public u16Array(u16Array other) {
    this(JirrJNI.new_u16Array__SWIG_2(u16Array.getCPtr(other), other), true);
  }

  public void reallocate(long new_size, boolean canShrink) {
    JirrJNI.u16Array_reallocate__SWIG_0(swigCPtr, this, new_size, canShrink);
  }

  public void reallocate(long new_size) {
    JirrJNI.u16Array_reallocate__SWIG_1(swigCPtr, this, new_size);
  }

  public void setAllocStrategy(SWIGTYPE_p_eAllocStrategy newStrategy) {
    JirrJNI.u16Array_setAllocStrategy__SWIG_0(swigCPtr, this, SWIGTYPE_p_eAllocStrategy.getCPtr(newStrategy));
  }

  public void setAllocStrategy() {
    JirrJNI.u16Array_setAllocStrategy__SWIG_1(swigCPtr, this);
  }

  public void push_back(int element) {
    JirrJNI.u16Array_push_back(swigCPtr, this, element);
  }

  public void push_front(int element) {
    JirrJNI.u16Array_push_front(swigCPtr, this, element);
  }

  public void insert(int element, long index) {
    JirrJNI.u16Array_insert__SWIG_0(swigCPtr, this, element, index);
  }

  public void insert(int element) {
    JirrJNI.u16Array_insert__SWIG_1(swigCPtr, this, element);
  }

  public void clear() {
    JirrJNI.u16Array_clear(swigCPtr, this);
  }

  public void set_pointer(SWIGTYPE_p_unsigned_short newPointer, long size, boolean _is_sorted, boolean _free_when_destroyed) {
    JirrJNI.u16Array_set_pointer__SWIG_0(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(newPointer), size, _is_sorted, _free_when_destroyed);
  }

  public void set_pointer(SWIGTYPE_p_unsigned_short newPointer, long size, boolean _is_sorted) {
    JirrJNI.u16Array_set_pointer__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(newPointer), size, _is_sorted);
  }

  public void set_pointer(SWIGTYPE_p_unsigned_short newPointer, long size) {
    JirrJNI.u16Array_set_pointer__SWIG_2(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(newPointer), size);
  }

  public void set_free_when_destroyed(boolean f) {
    JirrJNI.u16Array_set_free_when_destroyed(swigCPtr, this, f);
  }

  public void set_used(long usedNow) {
    JirrJNI.u16Array_set_used(swigCPtr, this, usedNow);
  }

  public u16Array assignOperator(u16Array other) {
    return new u16Array(JirrJNI.u16Array_assignOperator(swigCPtr, this, u16Array.getCPtr(other), other), false);
  }

  public boolean equalsOperator(u16Array other) {
    return JirrJNI.u16Array_equalsOperator(swigCPtr, this, u16Array.getCPtr(other), other);
  }

  public boolean notEqualsOperator(u16Array other) {
    return JirrJNI.u16Array_notEqualsOperator(swigCPtr, this, u16Array.getCPtr(other), other);
  }

  public SWIGTYPE_p_unsigned_short getLast() {
    return new SWIGTYPE_p_unsigned_short(JirrJNI.u16Array_getLast(swigCPtr, this), false);
  }

  public int getLastConst() {
    return JirrJNI.u16Array_getLastConst(swigCPtr, this);
  }

  public SWIGTYPE_p_unsigned_short pointer() {
    long cPtr = JirrJNI.u16Array_pointer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public SWIGTYPE_p_unsigned_short const_pointer() {
    long cPtr = JirrJNI.u16Array_const_pointer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public long size() {
    return JirrJNI.u16Array_size(swigCPtr, this);
  }

  public long allocated_size() {
    return JirrJNI.u16Array_allocated_size(swigCPtr, this);
  }

  public boolean empty() {
    return JirrJNI.u16Array_empty(swigCPtr, this);
  }

  public void sort() {
    JirrJNI.u16Array_sort(swigCPtr, this);
  }

  public int binary_search(int element) {
    return JirrJNI.u16Array_binary_search__SWIG_0(swigCPtr, this, element);
  }

  public int binary_search(int element, int left, int right) {
    return JirrJNI.u16Array_binary_search__SWIG_2(swigCPtr, this, element, left, right);
  }

  public int binary_search_multi(int element, SWIGTYPE_p_int last) {
    return JirrJNI.u16Array_binary_search_multi(swigCPtr, this, element, SWIGTYPE_p_int.getCPtr(last));
  }

  public int linear_search(int element) {
    return JirrJNI.u16Array_linear_search(swigCPtr, this, element);
  }

  public int linear_reverse_search(int element) {
    return JirrJNI.u16Array_linear_reverse_search(swigCPtr, this, element);
  }

  public void erase(long index) {
    JirrJNI.u16Array_erase__SWIG_0(swigCPtr, this, index);
  }

  public void erase(long index, int count) {
    JirrJNI.u16Array_erase__SWIG_1(swigCPtr, this, index, count);
  }

  public void set_sorted(boolean _is_sorted) {
    JirrJNI.u16Array_set_sorted(swigCPtr, this, _is_sorted);
  }

  public void swap(u16Array other) {
    JirrJNI.u16Array_swap(swigCPtr, this, u16Array.getCPtr(other), other);
  }

}