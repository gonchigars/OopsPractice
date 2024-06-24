package main.com.example.blogapp;

public class Post {
  private int postId;
  private String title;
  private String content;
  private boolean approved;
  
  private Post(int postId, String title, String content) {
    this.postId = postId;
    this.title = title;
    this.content = content;
    this.approved = false;
  }

  public int getPostId() {
    return postId;  
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public boolean isApproved() {
    return approved;
  }

  public void setApproved(boolean approved) {
    this.approved = approved;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
