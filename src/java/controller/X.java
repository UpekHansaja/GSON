package controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author upekhansaja
 */
@WebServlet(name = "X", urlPatterns = {"/X"})
public class X extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Gson gson = new Gson();
        JsonArray jsonArray = gson.fromJson(req.getReader(), JsonArray.class);

        List<JsonElement> jsonElements = jsonArray.asList();

        for (JsonElement jsonElement : jsonElements) {
            JsonObject jsonObject1 = jsonElement.getAsJsonObject();
            System.out.println(jsonObject1.get("id").getAsInt());
            System.out.println(jsonObject1.get("name").getAsString());
        }

    }

}
