package com.wa.hotline;

import com.cmsl.security.Keys;
import com.google.gson.JsonObject;
import com.wa.utils.Controller;
import spark.Request;
import spark.Response;
import spark.Route;

import java.security.PrivateKey;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * Created by zgeorg03 on 11/6/16.
 */
public class HotlineFormController  extends Controller{


    private PrivateKey privateKey;
    private HotlineCaseHandler caseHandler;


    public HotlineFormController(String mainPath, String mainTemplatePath, PrivateKey key,HotlineCaseHandler caseHandler, Logger logger) {
        super(mainPath, mainTemplatePath, logger);
        this.privateKey = key;
        this.caseHandler = caseHandler;
    }


    public  Route serveHotlineFormSubmission = (request, response) -> {
        StringBuilder sb = new StringBuilder();

        String email = request.queryParams("email");
        if(email==null) {
            return "{\"msg\":\"error\"}";
        }
        sb.append("email\t"+email +"\n");
        //String decrypted_email = Keys.decrypt(privateKey,Base64.getDecoder().decode(email));
        //System.out.println("Decr: " + decrypted_email);


        String file = request.queryParams("files");
        sb.append(file+"\t" + file+"\n");


        //Generate a unique Identifier
        String caseID = UUID.randomUUID().toString();


        if(!caseHandler.newCase(caseID, sb.toString().getBytes("UTF-8"))){
            return "{\"msg\":\"Case already exists!\"}";
        }

        JsonObject object =new JsonObject();
        object.addProperty("msg","ok");
        object.addProperty("case_id",caseID);
        return object;

    };
    @Override
    protected void mainRoute(Request request, Map model, Response response) {

    }
}
