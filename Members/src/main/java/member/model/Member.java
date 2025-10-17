package member.model;


import java.sql.*;


public class Member {
	private String mid; //회원아이디
	private String passwd; //비밀번호
	private String name; //회원이름
	private String gender; //성별
	private Timestamp joinDate; //가입
	
	public Member(){}

	public Member(String mid, String passwd, String name, String gender, Timestamp joinDate) {
		super();
		this.mid = mid;
		this.passwd = passwd;
		this.name = name;
		this.gender = gender;
		this.joinDate = joinDate;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
	

}

