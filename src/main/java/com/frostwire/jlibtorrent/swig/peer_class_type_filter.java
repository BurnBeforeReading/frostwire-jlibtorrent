/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_class_type_filter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected peer_class_type_filter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_class_type_filter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_class_type_filter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public peer_class_type_filter() {
    this(libtorrent_jni.new_peer_class_type_filter(), true);
  }

  public void add(peer_class_type_filter.socket_type_t st, int peer_class) {
    libtorrent_jni.peer_class_type_filter_add(swigCPtr, this, st.swigValue(), peer_class);
  }

  public void remove(peer_class_type_filter.socket_type_t st, int peer_class) {
    libtorrent_jni.peer_class_type_filter_remove(swigCPtr, this, st.swigValue(), peer_class);
  }

  public void disallow(peer_class_type_filter.socket_type_t st, int peer_class) {
    libtorrent_jni.peer_class_type_filter_disallow(swigCPtr, this, st.swigValue(), peer_class);
  }

  public void allow(peer_class_type_filter.socket_type_t st, int peer_class) {
    libtorrent_jni.peer_class_type_filter_allow(swigCPtr, this, st.swigValue(), peer_class);
  }

  public long apply(int st, long peer_class_mask) {
    return libtorrent_jni.peer_class_type_filter_apply(swigCPtr, this, st, peer_class_mask);
  }

  public enum socket_type_t {
    tcp_socket(libtorrent_jni.peer_class_type_filter_tcp_socket_get()),
    utp_socket,
    ssl_tcp_socket,
    ssl_utp_socket,
    i2p_socket,
    num_socket_types;

    public final int swigValue() {
      return swigValue;
    }

    public static socket_type_t swigToEnum(int swigValue) {
      socket_type_t[] swigValues = socket_type_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (socket_type_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + socket_type_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private socket_type_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private socket_type_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private socket_type_t(socket_type_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
