package dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.DeptVO;

public class DeptDAO {
	
	SqlSession sqlSession;
	
	public DeptDAO( SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
		
	//부서목록 가져오기
	public List<DeptVO> selectDept() {
		List<DeptVO> list = sqlSession.selectList("d.dept_list");
		return list;
	}
	
}




















