//bron: http://stackoverflow.com/questions/4407792/playframework-is-active-menu-item-route
package tags;

import groovy.lang.Closure;

import java.io.PrintWriter;
import java.util.*;

import play.mvc.Http;
import play.mvc.Router;
import play.templates.FastTags;
import play.templates.GroovyTemplate;

public class CustomFastTags extends FastTags {

	public static void _activeRoute(Map<?, ?> args, Closure body,
			PrintWriter out, GroovyTemplate.ExecutableTemplate template,
			int fromLine) {
		Router.ActionDefinition actionDef = (Router.ActionDefinition) args.get("href");
		String activeStyle = "active";

		if (Http.Request.current().action.equals(actionDef.action)) {
			out.print(activeStyle);
		} 
	}
}