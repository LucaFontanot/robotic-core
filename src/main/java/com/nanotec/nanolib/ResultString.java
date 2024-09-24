/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nanotec.nanolib;

public class ResultString extends Result {
  private transient long swigCPtr;

  protected ResultString(long cPtr, boolean cMemoryOwn) {
    super(NanolibJNI.ResultString_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResultString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ResultString obj) {
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
        NanolibJNI.delete_ResultString(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ResultString(String message, boolean hasError_) {
    this(NanolibJNI.new_ResultString__SWIG_0(message, hasError_), true);
  }

  public ResultString(NlcErrorCode errCode, String errorString_) {
    this(NanolibJNI.new_ResultString__SWIG_1(errCode.swigValue(), errorString_), true);
  }

  public ResultString(NlcErrorCode errCode, long exErrCode, String errorString_) {
    this(NanolibJNI.new_ResultString__SWIG_2(errCode.swigValue(), exErrCode, errorString_), true);
  }

  public ResultString(Result result) {
    this(NanolibJNI.new_ResultString__SWIG_3(Result.getCPtr(result), result), true);
  }

  public String getResult() {
    return NanolibJNI.ResultString_getResult(swigCPtr, this);
  }

}
