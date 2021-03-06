/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_error_alert extends peer_alert {
  private transient long swigCPtr;

  protected peer_error_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.peer_error_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_error_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_error_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public peer_error_alert(stack_allocator alloc, torrent_handle h, tcp_endpoint ep, sha1_hash peer_id, int op, error_code e) {
    this(libtorrent_jni.new_peer_error_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h, tcp_endpoint.getCPtr(ep), ep, sha1_hash.getCPtr(peer_id), peer_id, op, error_code.getCPtr(e), e), true);
  }

  public int type() {
    return libtorrent_jni.peer_error_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.peer_error_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.peer_error_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.peer_error_alert_message(swigCPtr, this);
  }

  public void setOperation(int value) {
    libtorrent_jni.peer_error_alert_operation_set(swigCPtr, this, value);
  }

  public int getOperation() {
    return libtorrent_jni.peer_error_alert_operation_get(swigCPtr, this);
  }

  public void setError(error_code value) {
    libtorrent_jni.peer_error_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.peer_error_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public final static int priority = libtorrent_jni.peer_error_alert_priority_get();
  public final static int alert_type = libtorrent_jni.peer_error_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.peer_error_alert_static_category_get();
}
