import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/word", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Word> words = request.session().attribute("words");
      if (words == null) {
        words = new ArrayList<Word>();
        request.session().attribute("words", words);
      }

      String name = request.queryParams("name");
      Word newWord = new Word(name);
      words.add(newWord);

      model.put("template", "templates/word-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/definition", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Definition> definitions = request.session().attribute("definitions");
      if (definitions == null) {
        definitions = new ArrayList<Definition>();
        request.session().attribute("definitions", definitions);
      }

      String description = request.queryParams("description");
      Definition newDefinition = new Definition(description);
      definitions.add(newDefinition);


      model.put("template", "templates/definition-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
