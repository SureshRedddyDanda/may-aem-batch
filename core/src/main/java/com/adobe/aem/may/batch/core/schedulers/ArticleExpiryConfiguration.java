package com.adobe.aem.may.batch.core.schedulers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="ArticleExpiryConfiguration")
public @interface ArticleExpiryConfiguration {
   
    @AttributeDefinition(    
    name="KailashHotels",
    description="excellent hotels"
    )

    public String scheduler_name();

    @AttributeDefinition(    
    name="KailashHotels",
    description="excellent hotels"
    )

    public String scheduler_cronExpression() default "*/1 * * * * ?" ;

    @AttributeDefinition(    
    name="RamHotels",
    description="excellent hotels"
    )

    public boolean scheduler_enabled() default false;

    @AttributeDefinition(    
    name="NarayanHotels",
    description="excellent hotels"
    )

    public boolean scheduler_concurrent() default false;

}
