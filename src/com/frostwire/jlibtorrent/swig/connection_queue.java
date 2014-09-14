/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class connection_queue {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected connection_queue(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(connection_queue obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_connection_queue(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public connection_queue(SWIGTYPE_p_io_service ios) {
    this(libtorrent_jni.new_connection_queue(SWIGTYPE_p_io_service.getCPtr(ios)), true);
  }

  public int free_slots() {
    return libtorrent_jni.connection_queue_free_slots(swigCPtr, this);
  }

  public boolean done(int ticket) {
    return libtorrent_jni.connection_queue_done(swigCPtr, this, ticket);
  }

  public void limit(int limit) {
    libtorrent_jni.connection_queue_limit__SWIG_0(swigCPtr, this, limit);
  }

  public int limit() {
    return libtorrent_jni.connection_queue_limit__SWIG_1(swigCPtr, this);
  }

  public void close() {
    libtorrent_jni.connection_queue_close(swigCPtr, this);
  }

  public int size() {
    return libtorrent_jni.connection_queue_size(swigCPtr, this);
  }

  public int num_connecting() {
    return libtorrent_jni.connection_queue_num_connecting(swigCPtr, this);
  }

}
