/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class swig_plugin {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected swig_plugin(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(swig_plugin obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_swig_plugin(swigCPtr);
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
    libtorrent_jni.swig_plugin_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.swig_plugin_change_ownership(this, swigCPtr, true);
  }

  public swig_torrent_plugin new_torrent(torrent_handle t) {
    long cPtr = (getClass() == swig_plugin.class) ? libtorrent_jni.swig_plugin_new_torrent(swigCPtr, this, torrent_handle.getCPtr(t), t) : libtorrent_jni.swig_plugin_new_torrentSwigExplicitswig_plugin(swigCPtr, this, torrent_handle.getCPtr(t), t);
    return (cPtr == 0) ? null : new swig_torrent_plugin(cPtr, false);
  }

  public void added(session_handle s) {
    if (getClass() == swig_plugin.class) libtorrent_jni.swig_plugin_added(swigCPtr, this, session_handle.getCPtr(s), s); else libtorrent_jni.swig_plugin_addedSwigExplicitswig_plugin(swigCPtr, this, session_handle.getCPtr(s), s);
  }

  public void register_dht_extensions(string_dht_extension_handler_listener_ptr_pair_vector dht_extensions) {
    if (getClass() == swig_plugin.class) libtorrent_jni.swig_plugin_register_dht_extensions(swigCPtr, this, string_dht_extension_handler_listener_ptr_pair_vector.getCPtr(dht_extensions), dht_extensions); else libtorrent_jni.swig_plugin_register_dht_extensionsSwigExplicitswig_plugin(swigCPtr, this, string_dht_extension_handler_listener_ptr_pair_vector.getCPtr(dht_extensions), dht_extensions);
  }

  public void on_alert(alert a) {
    if (getClass() == swig_plugin.class) libtorrent_jni.swig_plugin_on_alert(swigCPtr, this, alert.getCPtr(a), a); else libtorrent_jni.swig_plugin_on_alertSwigExplicitswig_plugin(swigCPtr, this, alert.getCPtr(a), a);
  }

  public boolean on_unknown_torrent(sha1_hash info_hash, peer_connection_handle pc, add_torrent_params p) {
    return (getClass() == swig_plugin.class) ? libtorrent_jni.swig_plugin_on_unknown_torrent(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, peer_connection_handle.getCPtr(pc), pc, add_torrent_params.getCPtr(p), p) : libtorrent_jni.swig_plugin_on_unknown_torrentSwigExplicitswig_plugin(swigCPtr, this, sha1_hash.getCPtr(info_hash), info_hash, peer_connection_handle.getCPtr(pc), pc, add_torrent_params.getCPtr(p), p);
  }

  public void on_tick() {
    if (getClass() == swig_plugin.class) libtorrent_jni.swig_plugin_on_tick(swigCPtr, this); else libtorrent_jni.swig_plugin_on_tickSwigExplicitswig_plugin(swigCPtr, this);
  }

  public boolean on_optimistic_unchoke(peer_connection_handle_vector peers) {
    return (getClass() == swig_plugin.class) ? libtorrent_jni.swig_plugin_on_optimistic_unchoke(swigCPtr, this, peer_connection_handle_vector.getCPtr(peers), peers) : libtorrent_jni.swig_plugin_on_optimistic_unchokeSwigExplicitswig_plugin(swigCPtr, this, peer_connection_handle_vector.getCPtr(peers), peers);
  }

  public void save_state(entry e) {
    if (getClass() == swig_plugin.class) libtorrent_jni.swig_plugin_save_state(swigCPtr, this, entry.getCPtr(e), e); else libtorrent_jni.swig_plugin_save_stateSwigExplicitswig_plugin(swigCPtr, this, entry.getCPtr(e), e);
  }

  public void load_state(bdecode_node n) {
    if (getClass() == swig_plugin.class) libtorrent_jni.swig_plugin_load_state(swigCPtr, this, bdecode_node.getCPtr(n), n); else libtorrent_jni.swig_plugin_load_stateSwigExplicitswig_plugin(swigCPtr, this, bdecode_node.getCPtr(n), n);
  }

  public swig_plugin() {
    this(libtorrent_jni.new_swig_plugin(), true);
    libtorrent_jni.swig_plugin_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
