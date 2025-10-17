package member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBUtil;

public class MemberDao {

    public List<Member> getMemberList() {
        List<Member> memberList = new ArrayList<>();
        String sql = "select * from member";

        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();  

            while (rs.next()) {
                Member member = new Member(
                        rs.getString("mid"),
                        rs.getString("passwd"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getTimestamp("joindate")
                        );
                
                memberList.add(member);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return memberList;  
    }
}