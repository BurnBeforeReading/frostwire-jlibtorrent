/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_extension_handler_listener {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected dht_extension_handler_listener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_extension_handler_listener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_extension_handler_listener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.dht_extension_handler_listener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.dht_extension_handler_listener_change_ownership(this, swigCPtr, true);
  }

  public boolean on_message(udp_endpoint source, bdecode_node request, entry response) {
    return (getClass() == dht_extension_handler_listener.class) ? libtorrent_jni.dht_extension_handler_listener_on_message(swigCPtr, this, udp_endpoint.getCPtr(source), source, bdecode_node.getCPtr(request), request, entry.getCPtr(response), response) : libtorrent_jni.dht_extension_handler_listener_on_messageSwigExplicitdht_extension_handler_listener(swigCPtr, this, udp_endpoint.getCPtr(source), source, bdecode_node.getCPtr(request), request, entry.getCPtr(response), response);
  }

  public dht_extension_handler_listener() {
    this(libtorrent_jni.new_dht_extension_handler_listener(), true);
    libtorrent_jni.dht_extension_handler_listener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
