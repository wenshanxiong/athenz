//
// This file generated by rdl 1.4.13. Do not modify!
//

package com.yahoo.athenz.zts;
import java.util.List;
import com.yahoo.rdl.*;

//
// DomainMetrics -
//
public class DomainMetrics {
    public String domainName;
    public List<DomainMetric> metricList;

    public DomainMetrics setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return domainName;
    }
    public DomainMetrics setMetricList(List<DomainMetric> metricList) {
        this.metricList = metricList;
        return this;
    }
    public List<DomainMetric> getMetricList() {
        return metricList;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainMetrics.class) {
                return false;
            }
            DomainMetrics a = (DomainMetrics) another;
            if (domainName == null ? a.domainName != null : !domainName.equals(a.domainName)) {
                return false;
            }
            if (metricList == null ? a.metricList != null : !metricList.equals(a.metricList)) {
                return false;
            }
        }
        return true;
    }
}
