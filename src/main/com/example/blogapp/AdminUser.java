package main.com.example.blogapp;

public class AdminUser extends User implements AdminActions {
  public AdminUser(int UserId, String UserName, String UserEmail) {
    super(UserId, UserName, UserEmail);
  }

  @Override
  public void writePost(String title, String content) {
    System.out.println(getUserName()+" write post: "+title);
  }

  @Override
  public void editPost(int postId, String content) {
    System.out.println(getUserName()+" edit post Id: "+postId+ " with content: "+content);
  }

  @Override
  public void deletePost(int postId) {
    System.out.println(getUserName()+" delete post Id: "+postId);
  }

  @Override
  public void approvePost(int postId) {
    System.out.println(getUserName()+" approve post Id: "+postId);
  }

  @Override
  public void banUser(int UserId) {
    System.out.println(getUserName()+" ban user Id: "+UserId);
  }
}
