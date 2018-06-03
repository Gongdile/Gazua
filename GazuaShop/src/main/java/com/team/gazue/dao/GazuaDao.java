package com.team.gazue.dao;

import java.util.List;

import com.team.gazue.vo.BoardVO;


public interface GazuaDao {

	public List<BoardVO> selectList(String type) throws Exception;

	public void insert(BoardVO vo) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(int seq) throws Exception;
	
	public BoardVO selectOne(int seq) throws Exception;

}
