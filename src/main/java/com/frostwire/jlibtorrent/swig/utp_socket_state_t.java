/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public enum utp_socket_state_t {
  ST_DATA,
  ST_FIN,
  ST_STATE,
  ST_RESET,
  ST_SYN,
  NUM_TYPES;

  public final int swigValue() {
    return swigValue;
  }

  public static utp_socket_state_t swigToEnum(int swigValue) {
    utp_socket_state_t[] swigValues = utp_socket_state_t.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (utp_socket_state_t swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + utp_socket_state_t.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private utp_socket_state_t() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private utp_socket_state_t(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private utp_socket_state_t(utp_socket_state_t swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

