package com.adobe.aem.may.batch.core.models;

import java.util.Date;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalChild {

    @ValueMapValue
    public String bookname;

    @ValueMapValue
    public int booksubject;

    @ValueMapValue
    public Date bookpublishdate;

    @ChildResource
    public List<DigitalSubChild> bookdetailswithwriter;

    public String getBookname() {
        return bookname;
    }

    public int getBooksubject() {
        return booksubject;
    }

    public Date getBookpublishdate() {
        return bookpublishdate;
    }

    public List<DigitalSubChild> getBookdetailswithwriter() {
        return bookdetailswithwriter;
    }
}
