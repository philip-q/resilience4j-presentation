package com.phil;


import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Resilience4jTest {

    @Test
    public void testTest() {
//        CircuitBreakerConfig config = CircuitBreakerConfig.custom()
//                .failureRateThreshold(20)
//                .ringBufferSizeInClosedState(5)
//                .build();
//
//        CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.of(config);

        CircuitBreakerRegistry circuitBreakerRegistry = CircuitBreakerRegistry.ofDefaults();

        assertThat(1).isEqualTo(1);
    }


}
