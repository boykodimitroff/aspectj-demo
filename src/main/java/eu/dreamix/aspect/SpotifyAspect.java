package eu.dreamix.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

/**
 * Created by bdimitrov on 6/6/17.
 */
@Aspect
@Configuration
public class SpotifyAspect {

    @Pointcut("execution(* eu.dreamix.rest.RestController.callSpotify(..))")
    public void around() {}

    @Around("around()")
    public ResponseEntity mockSpotify() {
        return ResponseEntity.ok("Mocked Spotify call");
    }
}
