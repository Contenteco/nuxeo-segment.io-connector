package org.nuxeo.segment.io;

import java.io.Serializable;
import java.util.Map;

import org.nuxeo.ecm.core.api.NuxeoPrincipal;

import com.github.segmentio.models.Providers;

public interface SegmentIO {

    String getWriteKey();

    Map<String, String> getGlobalParameters();

    void identify(NuxeoPrincipal principal);

    void identify(NuxeoPrincipal principal, Map<String, Serializable> metadata);

    void track(NuxeoPrincipal principal, String eventName);

    void track(NuxeoPrincipal principal, String eventName,
            Map<String, Serializable> metadata);

    void flush();

    Providers getProviders();

    SegmentIOUserFilter getUserFilters();
}
