package com.adobe.aem.may.batch.core.models;

import java.util.Date;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class DigitalSubChild {

    @ValueMapValue
    public String writername;

    @ValueMapValue
    public int writersubject;

    @ValueMapValue
    public Date writerpublishdate;

    public String getWritername() {
        return writername;
    }

    public int getWritersubject() {
        return writersubject;
    }

    public Date getWriterpublishdate() {
        return writerpublishdate;
    }
}
