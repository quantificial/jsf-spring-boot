package org.xtremebiker.jsfspring;

import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("view")
//@ManagedBean
public class HelloWorld {

  private String firstName = "abc";
  private String lastName = "Doe";

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    return "Hello " + firstName + " " + lastName + "!";
  }
  
  public String getGreeting() {
	  return this.showGreeting();
  }
}
