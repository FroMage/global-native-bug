package rest;

import io.quarkiverse.renarde.Controller;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.Path;

public class Application extends Controller {
    
    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance index();
    }

    @Path("/")
    public TemplateInstance index() {
        return Templates.index();
    }
}