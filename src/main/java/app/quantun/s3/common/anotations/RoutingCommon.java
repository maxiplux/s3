package app.quantun.s3.common.anotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
public @interface RoutingCommon {

    @AliasFor(annotation = RequestMapping.class)
    String value() default "";

}
