package eu.dreamix.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bdimitrov on 6/6/17.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/")
public class RestController {

    @RequestMapping(value = "/spotify", method = RequestMethod.GET)
    public ResponseEntity<Object> callSpotify() {
        return ResponseEntity.ok("Spotify call");
    }
}
