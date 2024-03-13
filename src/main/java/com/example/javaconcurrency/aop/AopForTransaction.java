package com.example.javaconcurrency.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AopForTransaction {
    /**
     * AOP에서 별도의 트랜잭션 분리를 위한 메서드
     * REQUIRES_NEW : 부모 트랜잭션과 관계없이 별도의 트랜잭션으로 동작
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Object proceed(final ProceedingJoinPoint joinPoint) throws Throwable {
        return joinPoint.proceed();
    }
}
