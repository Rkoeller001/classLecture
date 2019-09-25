package PasswordLab;
//MINI LAB
//Create a program that keeps asking for a password
//Make sure you are using the Scanner Class/Object
//Once the user gets the password correct
//Print out a message to the user eg: logged in
//Keep track of how many wrong attempts they made
//Then display their number of wrong attempts

public class PasswordTester {
    private int password;
    private String incorrect;

    public PasswordTester(int password, String incorrect){
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void login(){
        int password = 123;

//        for (password = 123; password < 121; password++){
//            if (password < 123 ) {
//                incorrect = "incorrect";
//
//            }else if (password > 123) {
//                incorrect = "incorrect";
//            }else {
//                password = 123;
//            }
//
//
//
//            }
        }

    @Override
    public String toString() {
        return "PasswordTester{" +
                "password=" + password +
                ", incorrect='" + incorrect + '\'' +
                '}';
    }
}


