public class User {
    private String login;
    private String FIO;

    public User(String login, String FIO){
        this.login=login;
        this.FIO=FIO;
    }

    public void setLogin(String login){
        this.login=login;
    }

    public void setFIO(String FIO){
        this.FIO=FIO;
    }

    public String getFIO(){
        return FIO;
    }

    public String getLogin(){
        return login;
    }



}
