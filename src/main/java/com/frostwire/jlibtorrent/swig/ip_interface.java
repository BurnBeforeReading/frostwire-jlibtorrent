/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class ip_interface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ip_interface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ip_interface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_ip_interface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInterface_address(address value) {
    libtorrent_jni.ip_interface_interface_address_set(swigCPtr, this, address.getCPtr(value), value);
  }

  public address getInterface_address() {
    long cPtr = libtorrent_jni.ip_interface_interface_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new address(cPtr, false);
  }

  public void setNetmask(address value) {
    libtorrent_jni.ip_interface_netmask_set(swigCPtr, this, address.getCPtr(value), value);
  }

  public address getNetmask() {
    long cPtr = libtorrent_jni.ip_interface_netmask_get(swigCPtr, this);
    return (cPtr == 0) ? null : new address(cPtr, false);
  }

  public void setName(String value) {
    libtorrent_jni.ip_interface_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return libtorrent_jni.ip_interface_name_get(swigCPtr, this);
  }

  public void setMtu(int value) {
    libtorrent_jni.ip_interface_mtu_set(swigCPtr, this, value);
  }

  public int getMtu() {
    return libtorrent_jni.ip_interface_mtu_get(swigCPtr, this);
  }

  public ip_interface() {
    this(libtorrent_jni.new_ip_interface(), true);
  }

}
