package hanazuou.imas.mlst.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import hanazuou.imas.mlst.bean.TestBean;



@Repository

public class TestDAOImpl implements TestDAO {

	private static final String namespace="hanazuou.imas.mlst.testMapper";

	

	@Inject

	private SqlSession sqlSession;

	

	@Override

	public List<TestBean> test() throws Exception{

		// TODO Auto-generated method stub

		return sqlSession.selectList(namespace+".test");

	}



}