/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class http_seed_connection extends web_connection_base {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected http_seed_connection(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.http_seed_connection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(http_seed_connection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        libtorrent_jni.delete_http_seed_connection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.http_seed_connection_type(swigCPtr, this);
  }

  public void on_receive(error_code error, long bytes_transferred) {
    libtorrent_jni.http_seed_connection_on_receive(swigCPtr, this, error_code.getCPtr(error), error, bytes_transferred);
  }

  public String url() {
    return libtorrent_jni.http_seed_connection_url(swigCPtr, this);
  }

  public void get_specific_peer_info(peer_info p) {
    libtorrent_jni.http_seed_connection_get_specific_peer_info(swigCPtr, this, peer_info.getCPtr(p), p);
  }

  public void disconnect(error_code ec, operation_t op, int error) {
    libtorrent_jni.http_seed_connection_disconnect__SWIG_0(swigCPtr, this, error_code.getCPtr(ec), ec, op.swigValue(), error);
  }

  public void disconnect(error_code ec, operation_t op) {
    libtorrent_jni.http_seed_connection_disconnect__SWIG_1(swigCPtr, this, error_code.getCPtr(ec), ec, op.swigValue());
  }

  public void write_request(peer_request r) {
    libtorrent_jni.http_seed_connection_write_request(swigCPtr, this, peer_request.getCPtr(r), r);
  }

}
