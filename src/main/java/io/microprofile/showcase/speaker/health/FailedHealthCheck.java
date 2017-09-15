package io.microprofile.showcase.speaker.health;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

/**
 * 
 * @author jagraj
 *
 */
@Health
@ApplicationScoped
public class FailedHealthCheck implements HealthCheck{
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("Speaker:failed-check").down().build();
    }

}
