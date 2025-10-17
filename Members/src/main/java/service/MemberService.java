package service;


import java.util.List;

import member.model.Member;
import member.model.MemberDao;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	public List<Member> getMemberList(){
		return dao.getMemberList();
	}

}
