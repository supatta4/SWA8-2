public class Client {

	public static void main(String[] args) {
		IUser iuser = new ManagerUser();
		UserManager user = new UserManager(iuser);
		System.out.println("What that? "+user.getName());
	}

}