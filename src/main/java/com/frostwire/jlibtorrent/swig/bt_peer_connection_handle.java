/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class bt_peer_connection_handle extends peer_connection_handle {
  private transient long swigCPtr;

  protected bt_peer_connection_handle(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.bt_peer_connection_handle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(bt_peer_connection_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_bt_peer_connection_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public bt_peer_connection_handle(peer_connection_handle pc) {
    this(libtorrent_jni.new_bt_peer_connection_handle(peer_connection_handle.getCPtr(pc), pc), true);
  }

  public boolean packet_finished() {
    return libtorrent_jni.bt_peer_connection_handle_packet_finished(swigCPtr, this);
  }

  public boolean support_extensions() {
    return libtorrent_jni.bt_peer_connection_handle_support_extensions(swigCPtr, this);
  }

  public boolean supports_encryption() {
    return libtorrent_jni.bt_peer_connection_handle_supports_encryption(swigCPtr, this);
  }

  public void switch_send_crypto(crypto_plugin crypto) {
    libtorrent_jni.bt_peer_connection_handle_switch_send_crypto(swigCPtr, this, crypto_plugin.getCPtr(crypto), crypto);
  }

  public void switch_recv_crypto(crypto_plugin crypto) {
    libtorrent_jni.bt_peer_connection_handle_switch_recv_crypto(swigCPtr, this, crypto_plugin.getCPtr(crypto), crypto);
  }

  public bt_peer_connection native_handle() {
    long cPtr = libtorrent_jni.bt_peer_connection_handle_native_handle(swigCPtr, this);
    return (cPtr == 0) ? null : new bt_peer_connection(cPtr, true);
  }

}
