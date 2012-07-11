package net.spring3.services.impl;

import net.spring3.services.UserService;


public class UserServiceImpl implements UserService {

  private String source;
  
  @Override
  public void declare() {
    System.out.println("1729: declated -->"+source);
    
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getSource() {
    return source;
  }

  
}
