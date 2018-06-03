package com.team.gazue.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.team.gazue.vo.BoardVO;

@Repository
public class GazuaDaoImpl implements GazuaDao {
	@Inject
	SqlSession session;

	private String namespace = "com.team.gazue.BoardMapper";

	@Override
	public List<BoardVO> selectList(String type) throws Exception {
		return session.selectList(namespace + ".selectList", type);
	}

	@Override
	public void insert(BoardVO vo) throws Exception {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int seq) throws Exception {
		session.delete(namespace + ".delete", seq);
	}

	@Override
	public BoardVO selectOne(int seq) throws Exception {
		return session.selectOne(namespace + ".selectOne", seq);
	}

}
