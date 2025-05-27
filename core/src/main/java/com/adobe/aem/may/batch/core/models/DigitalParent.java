package com.adobe.aem.may.batch.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DigitalParent {

    @ValueMapValue
    public String articletitle;

    @ValueMapValue
    public String articledesc;

    @ValueMapValue
    public int articlenum;

    @ChildResource
    public List<DigitalChild> bookdetailswithmap;

    public String getArticletitle() {
        return articletitle;
    }

    public String getArticledesc() {
        return articledesc;
    }

    public int getArticlenum() {
        return articlenum;
    }

    public List<DigitalChild> getBookdetailswithmap() {
        return bookdetailswithmap;
    }



}
