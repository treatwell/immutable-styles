package com.treatwell.common.utils.immutables;

import org.immutables.value.Value;

/**
 * Style to be used in combination with {@link org.immutables.value.Value.Modifiable}. Generated
 * classes with have setters with void return types. Primary use case is for command objects
 * that would be posted using JSF.
 */
@Value.Style(
    // Generate Java bean like setters (void return type)
    beanFriendlyModifiables = true
)
public @interface JavaBeanStyle {
}
