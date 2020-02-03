package br.com.cs.didemo.examplesbeans;

public class FakeDataSource {

	private String userName;
	private String password;
	private String url;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "FakeDataSource [userName=" + userName + ", password=" + password + ", url=" + url + "]";
	}

}