package project.handler;

import java.io.File;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import dto.User;

public class sumhandler extends jsonhandler {

    @Override
    public String response() throws Exception {
        // TODO Auto-generated method stub
        String filepath = "/Users/chaehuiseon/Downloads/untitled7/src/data/input/user.json";
        File file = new File(filepath);
        if(!file.exists()){
            System.out.println("file not exist");
            throw new UnsupportedOperationException("file not exist");
        }

        ObjectMapper obj = new ObjectMapper();
        User[] users = obj.readValue(file,User[].class);
        int sum = 0;
        for(User user : users){
            sum += user.getPost_count();
        }
        JSONObject t = new JSONObject();
        t.put("sum",sum);

        return t.toString();


    }

}
