/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nanotec.nanolib;

public class ProfinetDCP {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ProfinetDCP(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProfinetDCP obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(ProfinetDCP obj) {
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
        NanolibJNI.delete_ProfinetDCP(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long getScanTimeout() {
    return NanolibJNI.ProfinetDCP_getScanTimeout(swigCPtr, this);
  }

  public void setScanTimeout(long timeoutMsec) {
    NanolibJNI.ProfinetDCP_setScanTimeout(swigCPtr, this, timeoutMsec);
  }

  public long getResponseTimeout() {
    return NanolibJNI.ProfinetDCP_getResponseTimeout(swigCPtr, this);
  }

  public void setResponseTimeout(long timeoutMsec) {
    NanolibJNI.ProfinetDCP_setResponseTimeout(swigCPtr, this, timeoutMsec);
  }

  public ResultVoid isServiceAvailable(BusHardwareId busHardwareId) {
    return new ResultVoid(NanolibJNI.ProfinetDCP_isServiceAvailable(swigCPtr, this, BusHardwareId.getCPtr(busHardwareId), busHardwareId), true);
  }

  public ResultProfinetDevices scanProfinetDevices(BusHardwareId busHardwareId) {
    return new ResultProfinetDevices(NanolibJNI.ProfinetDCP_scanProfinetDevices(swigCPtr, this, BusHardwareId.getCPtr(busHardwareId), busHardwareId), true);
  }

  public ResultVoid setupProfinetDevice(BusHardwareId busHardwareId, ProfinetDevice profinetDevice, boolean savePermanent) {
    return new ResultVoid(NanolibJNI.ProfinetDCP_setupProfinetDevice(swigCPtr, this, BusHardwareId.getCPtr(busHardwareId), busHardwareId, ProfinetDevice.getCPtr(profinetDevice), profinetDevice, savePermanent), true);
  }

  public ResultVoid resetProfinetDevice(BusHardwareId busHardwareId, ProfinetDevice profinetDevice) {
    return new ResultVoid(NanolibJNI.ProfinetDCP_resetProfinetDevice(swigCPtr, this, BusHardwareId.getCPtr(busHardwareId), busHardwareId, ProfinetDevice.getCPtr(profinetDevice), profinetDevice), true);
  }

  public ResultVoid blinkProfinetDevice(BusHardwareId busHardwareId, ProfinetDevice profinetDevice) {
    return new ResultVoid(NanolibJNI.ProfinetDCP_blinkProfinetDevice(swigCPtr, this, BusHardwareId.getCPtr(busHardwareId), busHardwareId, ProfinetDevice.getCPtr(profinetDevice), profinetDevice), true);
  }

  public ResultVoid validateProfinetDeviceIp(BusHardwareId busHardwareId, ProfinetDevice profinetDevice) {
    return new ResultVoid(NanolibJNI.ProfinetDCP_validateProfinetDeviceIp(swigCPtr, this, BusHardwareId.getCPtr(busHardwareId), busHardwareId, ProfinetDevice.getCPtr(profinetDevice), profinetDevice), true);
  }

}
