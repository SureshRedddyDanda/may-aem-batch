package com.adobe.aem.may.batch.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DemoModel implements Demo{
    
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String des;
    @ValueMapValue
    private int num;
    

    @Override
    public String getArticleTitle() {
        return text;  
    }
    @Override
    public String getArticleDesc() {
        return des;
        
    }
    @Override
    public int getArticleNum() {
        return num;
        
    }

    // getter and setter methods
    // getter --> to get the value from the variable
    // setter --> to set the value to the variable


}
