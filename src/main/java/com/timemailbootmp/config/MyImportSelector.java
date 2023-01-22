package com.timemailbootmp.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author curry
 * @package com.timemailbootmp.config
 * @date 2023/1/22 23:41
 * @Version V1.0
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.timemailbootmp.entity.User"};
    }
}
