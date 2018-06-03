package com.team.gazue.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.team.gazue.dao.GazuaDao;
import com.team.gazue.vo.BoardVO;
import com.team.gazue.vo.MemberVO;

@Service
public class GazuaServiceImpl implements GazuaService {

	@Inject
	GazuaDao dao;

	@Override
	public List<BoardVO> selectList(String type) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectList(type);
	}

	@Override
	public void insert(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(vo);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		dao.update(vo);
	}

	@Override
	public void delete(int seq) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(seq);
	}

	@Override
	public BoardVO selectOne(int seq) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectOne(seq);
	}

}
