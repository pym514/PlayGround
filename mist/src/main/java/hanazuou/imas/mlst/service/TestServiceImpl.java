package hanazuou.imas.mlst.service;

import java.util.List;



import javax.inject.Inject;



import org.springframework.stereotype.Service;



import hanazuou.imas.mlst.DAO.TestDAO;

import hanazuou.imas.mlst.bean.TestBean;



@Service

public class TestServiceImpl implements TestService {

	@Inject

	private TestDAO dao;

	

	@Override

	public List<TestBean> test() throws Exception {

		// TODO Auto-generated method stub

		return dao.test();

	}



}