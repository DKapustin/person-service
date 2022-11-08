package liga.medical.personservice.core.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
@RequiredArgsConstructor
@Slf4j
public class LoggingAdvice {

    @Pointcut(value = "execution(* liga.medical.personservice.core.controller.*.*(..))")
    public void restPointcut() {
    }

    @Around(value = "restPointcut()")
    public Object restLogger(ProceedingJoinPoint pjp) throws JsonProcessingException {
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().toString();
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        log.info("LogName - " + log.getName() +
                "; ClassName - " + className +
                "; MethodName - " + methodName  +
                ", Date: " + new Date() +
                " Username: " + authentication.getName());

        Object object = null;
        try {
            object = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return object;
    }

}
