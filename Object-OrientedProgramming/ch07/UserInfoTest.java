package ch07;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userLee = new UserInfo();
		userLee.userId = "yeeun426";
		userLee.userPassWord = "000000";
		userLee.userName = "LeeYeEun";
		userLee.phoneNumber = "01033335555";
		userLee.userAddress = "Incheon, Korea";
		
		System.out.println(userLee.showUserInfo());
		
		UserInfo userKim = new UserInfo("yeng", "111111", "Kim");
		System.out.println(userKim.showUserInfo());

	}

}
