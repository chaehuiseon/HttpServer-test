package dto;

public class User {

    private Long user_id;
    private String username;
    private Integer post_count;

    public Long getUser_id(){
        return this.user_id;
    }

    public String getUsername(){
        return this.username;
    }

    public Integer getPost_count(){
        return this.post_count;
    }

    public void setUser_id(Long user_id){
        this.user_id = user_id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPost_count(Integer post_count){
        this.post_count = post_count;
    }


    // public Long getUser_id(){
    //     return this.user_id;
    // }

    // public String getUserName(){
    //     return this.username;
    // }

    // public Integer getPost_Count(){
    //     return this.post_count;
    // }

    // public void setUser_id(Long user_id){
    //     this.user_id = user_id;
    // }

    // public void setUserName(String username){
    //     this.username = username;

    // }

    // public void setPost_Count(Integer post_count){
    //     this.post_count = post_count;
    // }

}
