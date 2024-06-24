package main.com.example.blogapp;

public interface UserActions {
  void writePost(String title, String content);
  void editPost(int postId, String content);
  void deletePost(int postId);
}
