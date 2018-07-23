package prova;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;


@Named
@SessionScoped
public class LoginBean implements Serializable{
 private static final long serialVersionUID = 1L;
 @Getter @Setter private String user;
 @Getter @Setter private String password;
 @Getter private String myError="";
 
 
 public String login () {
 
  var a=user;	 
  if (user.equalsIgnoreCase("ximo") && password.equals("password")) {
    return "test-application-page";
  } else {
    myError="Bad User/password";
    return "test-login-page";
  }
 }

} 
