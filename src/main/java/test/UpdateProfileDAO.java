package test;
import java.sql.*;
public class UpdateProfileDAO {
    public int k=0;
    public int update(UserBean ub) {
    	try {
    		Connection con = DBConnection.get();
    		PreparedStatement ps = con.prepareStatement
    				("update UserReg66 set addr=?,mid=?where uname=? and pword=?");
    		ps.setString(1, ub.getAddr());
    		ps.setString(2, ub.getmId());
    		ps.setLong(3, ub.getphNo());
    		ps.setString(4, ub.getuName());
    		ps.setString(5,ub.getpWord());
    		k = ps.executeUpdate();
    				
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
		return k;
    }
}
