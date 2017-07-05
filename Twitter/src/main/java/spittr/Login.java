package spittr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Login {
	@NotNull
	@Size(min=5, max=16, message="{username.size}")
	private String userName;

	@NotNull
    @Size(min=5, max=16, message="{password.size}")
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
