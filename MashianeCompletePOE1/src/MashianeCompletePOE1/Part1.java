 // This is part 1 of the POE
package MashianeCompletePOE1;

import static MashianeCompletePOE1.CompletePOE.objLogin;
 import javax.swing.JOptionPane;



 /**
 *
 * @author Ntokozo Noluthando Mashiane(ST10455454)
 */
 
 public class Part1 {
    // Declare the following: firstName, lastName, username, password as private
       private String firstName;    
       private String lastName;
       private String username;
       private String password;
       private String loginUsername;
       private String loginPassword;
       
    //Declare constructors 
    public Part1() {
        this.firstName = "";
        this.lastName = "";
        this.username = "";
        this.password = "";
        this.loginUsername = "";
        this.loginPassword = "";
    }
    //Declare accessor methods for each attribute
    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
       return lastName;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
         return password;
    }
    public String getLoginUsername(){
        return loginUsername;
    }
    public String getLoginPassword(){
        return loginPassword;
    }
    // Create mutator methods

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public void setLoginUsername(String loginUsername){
            this.loginUsername = loginUsername;
        }
        public void setLoginPassword(String loginPassword){
            this.loginPassword = loginPassword;
        }
 
     // This method checks if username entered is correct
      public boolean checkUserName (){  
          for(int i=0;i<2;i++){
              objLogin.setUsername(JOptionPane.showInputDialog("Please create a username : "));
    if(username.length()<=5 && username.contains("_")){
              JOptionPane.showMessageDialog(null, "Username successfully captured !"); 
             break;
                      }
      else{JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore "
                    + "and is no more than 5 characters in length","ERROR",JOptionPane.ERROR_MESSAGE);
     
}
          
          }
           return false;
         
      }
     // This method ensures that the user meets the password requirements
         public boolean checkPasswordComplexity(){
            for(int i=0;i<2;i++){
                 objLogin.setPassword(JOptionPane.showInputDialog("Please create a password : "));
              if(password.length()>=8 && password.matches(".*[0-9]*.") && password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()]*.")){
                  JOptionPane.showMessageDialog(null, "Password successfully captured !");
             break; }
         else{ 
             JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.","ERROR",JOptionPane.ERROR_MESSAGE);
             
              }
           
}
           return false;
         }
    public String registerUser(){
        for (int i=0;i<1;i++)
        {
        if (username == null ? username != null : !username.equals(username)){
            
            JOptionPane.showMessageDialog(null,"The username is incorrectly formatted");
            break;
            
        }
        else if(password == null ? password != null : !password.equals(password)){
            JOptionPane.showMessageDialog(null,"The password does not meet the complexity requirements !","ERROR",JOptionPane.ERROR_MESSAGE);
            return null;
        }
        else {
            JOptionPane.showMessageDialog(null,"User has been successfully registered ! ");
        }
           return null;
    }
           return null;
    }
    // This method is to login the user by ensuring username and password match
    public boolean loginUser(){
    if (username.equals(loginUsername)&& password.equals(loginPassword)){
        JOptionPane.showMessageDialog(null,"Welcome "+ firstName  +" "+ lastName + ", It is great to see you again ! ");
        return true;
        }
        else{
                JOptionPane.showMessageDialog(null,"Username or Password incorrect, Please try again","ERROR",JOptionPane.ERROR_MESSAGE);
                return false;
        
    }
 }
  
   // Create a method to validate your login
   public String returnLoginStatus(){
      if(username.equals(loginUsername)&& password.equals(loginPassword)){
               JOptionPane.showMessageDialog(null, "A successful login !");}
        else{
            JOptionPane.showMessageDialog(null,"A failed login!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
           return null;
   }
   
   }

        
           
         


    

