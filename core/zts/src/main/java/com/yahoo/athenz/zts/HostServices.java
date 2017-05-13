//
// This file generated by rdl 1.4.13. Do not modify!
//

package com.yahoo.athenz.zts;
import java.util.List;
import com.yahoo.rdl.*;

//
// HostServices - The representation for an enumeration of services authorized
// to run on a specific host.
//
public class HostServices {
    public String host;
    public List<String> names;

    public HostServices setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return host;
    }
    public HostServices setNames(List<String> names) {
        this.names = names;
        return this;
    }
    public List<String> getNames() {
        return names;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != HostServices.class) {
                return false;
            }
            HostServices a = (HostServices) another;
            if (host == null ? a.host != null : !host.equals(a.host)) {
                return false;
            }
            if (names == null ? a.names != null : !names.equals(a.names)) {
                return false;
            }
        }
        return true;
    }
}
