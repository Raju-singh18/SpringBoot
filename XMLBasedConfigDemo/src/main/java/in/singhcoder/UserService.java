package in.singhcoder;

import java.util.List;

public class UserService {

//    private String name;
//
//    public UserService(String name){
//        System.out.println("user service created");
//        this.name=name;
//    }
//
//    public String getUserName(){
//        return name;
//    }

//    private List<String> usernames;
//
//    public UserService(List<String> usernames){
//        this.usernames=usernames;
//    }
//
//    public List<String> getUsernames(){
//        return usernames;
//    }


    public UserService(){
        System.out.println("UserService Created");
    }

    public void init(){
        System.out.println("Post construct phase");
    }

    public void cleaup(){
        System.out.println("Pre Destroy phase");
    }
}
