package app.quantun.s3.common.anotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface Query {

    @AliasFor(annotation = Service.class)
    String value() default "";

}
