

public class Password{

    private String userPassword;


    public void setPassWord(String newPassword){

        if (newPassword.length()>=8){
            userPassword = newPassword;
        }

        else{
            System.out.println("Too short. Must be at least 8 characters");

        }

    }


    public boolean checkPassword(String passwordInput){

        return passwordInput.equals(userPassword);
    }
}