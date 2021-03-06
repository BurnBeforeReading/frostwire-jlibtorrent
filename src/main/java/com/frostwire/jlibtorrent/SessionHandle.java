package com.frostwire.jlibtorrent;

import com.frostwire.jlibtorrent.swig.session_handle;

/**
 * @author gubatron
 * @author aldenml
 */
public class SessionHandle {

    protected final session_handle s;

    public SessionHandle(session_handle s) {
        this.s = s;
    }

    public session_handle getSwig() {
        return s;
    }
}
