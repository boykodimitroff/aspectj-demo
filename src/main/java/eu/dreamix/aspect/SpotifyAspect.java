package eu.dreamix.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * Created by bdimitrov on 6/6/17.
 */
@Aspect
@Component
public class SpotifyAspect {

    @Pointcut("execution(* eu.dreamix.rest.SpotifyController.callSpotify(..))")
    public void around() {}

    @Around("around()")
    public ResponseEntity mockSpotify() {
        return ResponseEntity.ok("Mocked Spotify call");
    }
}
