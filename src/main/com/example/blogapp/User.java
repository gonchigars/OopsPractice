package main.com.example.blogapp;

import java.security.PublicKey;

public class User {
  private int UserId;
  private String UserName;
  private String UserEmail;
  
  public User(int UserId, String UserName, String UserEmail) {
    this.UserId = UserId; 
    this.UserName = UserName;
    this.UserEmail = UserEmail;
  }
  public int getUserId() {
    return UserId;
  }
  public String getUserName() {
    return UserName;
  }
  public String getUserEmail() {
    return UserEmail;
  }
}
