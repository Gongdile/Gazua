package com.team.gazue.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.team.gazue.vo.MemberVO;

@Service
public class GazuaService {

	@Inject
	SqlSession session;

	private String namespace = "com.team.gazue.MemberMapper";

	public List<MemberVO> selectList() throws Exception {
		return session.selectList(namespace + ".selectList");
	}

	public void insert(MemberVO vo) throws Exception {
		session.insert(namespace + ".insert");
	}

	public void update(MemberVO vo) throws Exception {
		session.update(namespace + ".update");
	}

	public void delete(int seq) throws Exception {
		session.delete(namespace + ".delete", seq);
	}
}
