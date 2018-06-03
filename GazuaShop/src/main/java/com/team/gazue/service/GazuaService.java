package com.team.gazue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.team.gazue.vo.BoardVO;
import com.team.gazue.vo.MemberVO;

public interface GazuaService {
	
	public List<BoardVO> selectList(String type) throws Exception;
	
	public void insert(BoardVO vo) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int seq) throws Exception;
	
	public BoardVO selectOne(int seq) throws Exception;
	
}
