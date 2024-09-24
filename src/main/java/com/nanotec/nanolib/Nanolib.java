/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.nanotec.nanolib;

public class Nanolib implements NanolibConstants {
  public static int getNANOTEC_VENDOR_ID() {
    return NanolibJNI.NANOTEC_VENDOR_ID_get();
  }

  public static CanOpenNmtState getCanOpenNmtState() {
    long cPtr = NanolibJNI.canOpenNmtState_get();
    return (cPtr == 0) ? null : new CanOpenNmtState(cPtr, false);
  }

  public static CanOpenNmtService getCanOpenNmtService() {
    long cPtr = NanolibJNI.canOpenNmtService_get();
    return (cPtr == 0) ? null : new CanOpenNmtService(cPtr, false);
  }

  public static EtherCATState getEtherCATStates() {
    long cPtr = NanolibJNI.EtherCATStates_get();
    return (cPtr == 0) ? null : new EtherCATState(cPtr, false);
  }

  public static String getBUS_HARDWARE_ID_PROTOCOL_CANOPEN() {
    return NanolibJNI.BUS_HARDWARE_ID_PROTOCOL_CANOPEN_get();
  }

  public static String getBUS_HARDWARE_ID_IXXAT() {
    return NanolibJNI.BUS_HARDWARE_ID_IXXAT_get();
  }

  public static String getBUS_HARDWARE_ID_ZK_USB_CAN() {
    return NanolibJNI.BUS_HARDWARE_ID_ZK_USB_CAN_get();
  }

  public static String getBUS_HARDWARE_ID_PEAK() {
    return NanolibJNI.BUS_HARDWARE_ID_PEAK_get();
  }

  public static String getBUS_HARDWARE_ID_PROTOCOL_MODBUS_RTU() {
    return NanolibJNI.BUS_HARDWARE_ID_PROTOCOL_MODBUS_RTU_get();
  }

  public static String getBUS_HARDWARE_ID_SERIAL_PORT() {
    return NanolibJNI.BUS_HARDWARE_ID_SERIAL_PORT_get();
  }

  public static String getBUS_HARDWARE_ID_PROTOCOL_MODBUS_VCP() {
    return NanolibJNI.BUS_HARDWARE_ID_PROTOCOL_MODBUS_VCP_get();
  }

  public static String getBUS_HARDWARE_ID_PROTOCOL_MSC() {
    return NanolibJNI.BUS_HARDWARE_ID_PROTOCOL_MSC_get();
  }

  public static String getBUS_HARDWARE_ID_NANOTEC_VCP() {
    return NanolibJNI.BUS_HARDWARE_ID_NANOTEC_VCP_get();
  }

  public static String getBUS_HARDWARE_ID_USB_BUS() {
    return NanolibJNI.BUS_HARDWARE_ID_USB_BUS_get();
  }

  public static String getBUS_HARDWARE_ID_PROTOCOL_MODBUS_TCP() {
    return NanolibJNI.BUS_HARDWARE_ID_PROTOCOL_MODBUS_TCP_get();
  }

  public static String getBUS_HARDWARE_ID_NETWORK() {
    return NanolibJNI.BUS_HARDWARE_ID_NETWORK_get();
  }

  public static String getBUS_HARDWARE_ID_PROTOCOL_RESTFULL_API() {
    return NanolibJNI.BUS_HARDWARE_ID_PROTOCOL_RESTFULL_API_get();
  }

  public static String getBUS_HARDWARE_ID_PROTOCOL_ETHERCAT() {
    return NanolibJNI.BUS_HARDWARE_ID_PROTOCOL_ETHERCAT_get();
  }

  public static int getPCAN_USBBUS1() {
    return NanolibJNI.PCAN_USBBUS1_get();
  }

  public static int getPCAN_USBBUS2() {
    return NanolibJNI.PCAN_USBBUS2_get();
  }

  public static int getPCAN_USBBUS3() {
    return NanolibJNI.PCAN_USBBUS3_get();
  }

  public static int getPCAN_USBBUS4() {
    return NanolibJNI.PCAN_USBBUS4_get();
  }

  public static int getPCAN_USBBUS5() {
    return NanolibJNI.PCAN_USBBUS5_get();
  }

  public static int getPCAN_USBBUS6() {
    return NanolibJNI.PCAN_USBBUS6_get();
  }

  public static int getPCAN_USBBUS7() {
    return NanolibJNI.PCAN_USBBUS7_get();
  }

  public static int getPCAN_USBBUS8() {
    return NanolibJNI.PCAN_USBBUS8_get();
  }

  public static int getPCAN_USBBUS9() {
    return NanolibJNI.PCAN_USBBUS9_get();
  }

  public static int getPCAN_USBBUS10() {
    return NanolibJNI.PCAN_USBBUS10_get();
  }

  public static int getPCAN_USBBUS11() {
    return NanolibJNI.PCAN_USBBUS11_get();
  }

  public static int getPCAN_USBBUS12() {
    return NanolibJNI.PCAN_USBBUS12_get();
  }

  public static int getPCAN_USBBUS13() {
    return NanolibJNI.PCAN_USBBUS13_get();
  }

  public static int getPCAN_USBBUS14() {
    return NanolibJNI.PCAN_USBBUS14_get();
  }

  public static int getPCAN_USBBUS15() {
    return NanolibJNI.PCAN_USBBUS15_get();
  }

  public static int getPCAN_USBBUS16() {
    return NanolibJNI.PCAN_USBBUS16_get();
  }

  public static BusHwOptionsDefault getBusHwOptionsDefaults() {
    long cPtr = NanolibJNI.busHwOptionsDefaults_get();
    return (cPtr == 0) ? null : new BusHwOptionsDefault(cPtr, false);
  }

  public static NanoLibAccessor getNanoLibAccessor() {
    long cPtr = NanolibJNI.getNanoLibAccessor();
    return (cPtr == 0) ? null : new NanoLibAccessor(cPtr, false);
  }

}
