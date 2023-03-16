package at.htl.gettingstarted;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * --> @ApplicationPath adds prefix to our rest - services
 * @see http://localhost:8080/api/hello
 */
@ApplicationPath("api")
public class ApplicationConfig extends Application {
}
