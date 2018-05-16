package com.team.gazue.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.team.gazue.vo.MemberVO;

@Service
public interface GazuaService {
	
	public List<MemberVO> selectList(String type) throws Exception;
	
	public void insert(MemberVO vo) throws Exception;
	
	public void update(MemberVO vo) throws Exception;
	
	public void delete(int seq) throws Exception;
	
}
