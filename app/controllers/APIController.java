package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class APIController extends Controller {

    public Result people() {
        ObjectNode result = Json.newObject();
        result.put("firstName", "Rick");
        result.put("lastName", "Sanchez");
        return ok(result);
    }
}
