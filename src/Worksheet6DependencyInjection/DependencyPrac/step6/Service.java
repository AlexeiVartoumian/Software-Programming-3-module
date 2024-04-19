package DependencyPrac.step6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//at step 6 wee need to further annotate as
// the classpath loader will go through everything
// we only want services! reflected in the
// interfaces as well as the DI CONTEXT FILTERING ANNOTATIONS
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {
}
