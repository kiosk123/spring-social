package social;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import social.config.SocialConfig;
import social.config.WebConfig;

public class SocialWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override 
    protected Class <?> [] getRootConfigClasses() {
        return new Class <?> []{SocialConfig.class};
    }

    @Override 
    protected Class <?> [] getServletConfigClasses() {
        return new Class <?> []{WebConfig.class};
    }

    @Override 
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
