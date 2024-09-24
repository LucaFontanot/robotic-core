/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nanotec.nanolib;

public class ResultVoid extends Result {
  private transient long swigCPtr;

  protected ResultVoid(long cPtr, boolean cMemoryOwn) {
    super(NanolibJNI.ResultVoid_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResultVoid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ResultVoid obj) {
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
        NanolibJNI.delete_ResultVoid(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ResultVoid() {
    this(NanolibJNI.new_ResultVoid__SWIG_0(), true);
  }

  public ResultVoid(String errorString_) {
    this(NanolibJNI.new_ResultVoid__SWIG_1(errorString_), true);
  }

  public ResultVoid(NlcErrorCode errCode, String errorString_) {
    this(NanolibJNI.new_ResultVoid__SWIG_2(errCode.swigValue(), errorString_), true);
  }

  public ResultVoid(NlcErrorCode errCode, long exErrCode, String errorString_) {
    this(NanolibJNI.new_ResultVoid__SWIG_3(errCode.swigValue(), exErrCode, errorString_), true);
  }

  public ResultVoid(Result result) {
    this(NanolibJNI.new_ResultVoid__SWIG_4(Result.getCPtr(result), result), true);
  }

}
