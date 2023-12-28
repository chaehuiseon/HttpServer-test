package project.handler;


import org.json.JSONObject;

import com.fasterxml.jackson.core.*;

public class roothandler extends jsonhandler{

    @Override
    public String response() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'response'");
        JSONObject t = new JSONObject();
        t.put("message","server check");

        return t.toString();

    }

}
