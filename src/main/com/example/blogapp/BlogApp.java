package main.com.example.blogapp;

public class BlogApp {
  public static void main(String[] args) {
    UserActions regularUser = new RegularUser(1, "Vinay", "vinay@gmail.com");
    AdminActions adminUser = new AdminUser(2, "chandu", "chandu@gmail.com");
    AdminActions groupAdmin = new GroupAdmin(3, "GroupAdminjohn", "john@gmail.com", "Tech group");

    performUserActions(regularUser, "Regular post" , "Regular post content");
    regularUser.editPost(1, "Updated content of regular post.");
    regularUser.deletePost(1);

    // Perform actions as an admin user
    performAdminActions(adminUser, "Admin Post", "This is an admin post.");
    adminUser.editPost(2, "Updated content of admin post.");
    adminUser.deletePost(2);
    adminUser.approvePost(2);
    adminUser.banUser(3);

    // Perform actions as a group admin
    performAdminActions(groupAdmin, "Group Post", "This is a group post.");
    groupAdmin.editPost(3, "Updated content of group post.");
    groupAdmin.deletePost(3);
    groupAdmin.approvePost(3);
    groupAdmin.banUser(4);
}

public static void performUserActions(UserActions user, String title, String content) {
    user.writePost(title, content);
}

public static void performAdminActions(AdminActions admin, String title, String content) {
    admin.writePost(title, content);
}
  }

