/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nanotec.nanolib;

public class SamplerTrigger {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SamplerTrigger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SamplerTrigger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(SamplerTrigger obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NanolibJNI.delete_SamplerTrigger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCondition(SamplerTriggerCondition value) {
    NanolibJNI.SamplerTrigger_condition_set(swigCPtr, this, value.swigValue());
  }

  public SamplerTriggerCondition getCondition() {
    return SamplerTriggerCondition.swigToEnum(NanolibJNI.SamplerTrigger_condition_get(swigCPtr, this));
  }

  public void setAddress(OdIndex value) {
    NanolibJNI.SamplerTrigger_address_set(swigCPtr, this, OdIndex.getCPtr(value), value);
  }

  public OdIndex getAddress() {
    long cPtr = NanolibJNI.SamplerTrigger_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OdIndex(cPtr, false);
  }

  public void setValue(long value) {
    NanolibJNI.SamplerTrigger_value_set(swigCPtr, this, value);
  }

  public long getValue() {
    return NanolibJNI.SamplerTrigger_value_get(swigCPtr, this);
  }

  public SamplerTrigger() {
    this(NanolibJNI.new_SamplerTrigger(), true);
  }

}
