package main.com.example.blogapp;

public class RegularUser extends User implements UserActions {
  public RegularUser(int UserId, String UserName, String UserEmail) {
    super(UserId, UserName, UserEmail);
  }

  @Override
  public void writePost(String title, String content) {
    System.out.println(getUserName()+" write post: "+title);
  }

  @Override
  public void editPost(int postId, String content) {
    System.out.println(getUserName()+" edit post: "+postId+ " with content: "+content);
  }

  @Override
  public void deletePost(int postId) {
    System.out.println(getUserName()+" delete post: "+postId);
  }
}
