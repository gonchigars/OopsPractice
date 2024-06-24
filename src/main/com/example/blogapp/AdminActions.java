package main.com.example.blogapp;

public interface AdminActions extends UserActions {
  void approvePost(int postId);
  void banUser(int UserId);
}
