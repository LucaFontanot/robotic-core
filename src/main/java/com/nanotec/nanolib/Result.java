/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nanotec.nanolib;

public class Result {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Result(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Result obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(Result obj) {
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
        NanolibJNI.delete_Result(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean hasError() {
    return NanolibJNI.Result_hasError(swigCPtr, this);
  }

  public String getError() {
    return NanolibJNI.Result_getError(swigCPtr, this);
  }

  public NlcErrorCode getErrorCode() {
    return NlcErrorCode.swigToEnum(NanolibJNI.Result_getErrorCode(swigCPtr, this));
  }

  public long getExErrorCode() {
    return NanolibJNI.Result_getExErrorCode(swigCPtr, this);
  }

}
