package main.com.example.blogapp;

public class GroupAdmin extends User implements AdminActions {
  private String groupName;
  public GroupAdmin(int UserId, String UserName, String UserEmail, String groupName) {
    super(UserId, UserName, UserEmail);
    this.groupName = groupName;
  }
  @Override
    public void writePost(String title, String content) {
        System.out.println(getUserName() + " writes post in group " + groupName + ": " + title);
    }

    @Override
    public void editPost(int postId, String content) {
        System.out.println(getUserName() + " edits post ID: " + postId + " in group " + groupName + " with new content: " + content);
    }

    @Override
    public void deletePost(int postId) {
        System.out.println(getUserName() + " deletes post ID: " + postId + " in group " + groupName);
    }

    @Override
    public void approvePost(int postId) {
        System.out.println(getUserName() + " approves post ID: " + postId + " in group " + groupName);
    }

    @Override
    public void banUser(int userId) {
        System.out.println(getUserName() + " bans user ID: " + userId + " in group " + groupName);
    }

    public String getGroupName() {
        return groupName;
    }
}
