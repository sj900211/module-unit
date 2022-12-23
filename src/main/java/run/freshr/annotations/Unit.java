package run.freshr.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

/**
 * Unit
 *
 * @author FreshR
 * @apiNote 논리적인 Architecture 를 설계하기 위한 Annotation<br>
 *          Service 와 똑같은 기능
 * @since 2022. 12. 23. 오후 4:23:59
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Unit {

  /**
   * component name
   *
   * @return the string
   * @apiNote Service 에 있는 value 와 똑같은 기능
   * @see org.springframework.stereotype.Service
   * @author FreshR
   * @since 2022. 12. 23. 오후 4:23:59
   */
  @AliasFor(annotation = Component.class)
  String value() default "";

}
