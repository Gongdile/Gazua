package com.team.gazue.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.team.gazue.service.GazuaService;
import com.team.gazue.vo.MemberVO;

@Repository
public class GazuaDao implements GazuaService{

  @Inject
  SqlSession session;

  private String namespace = "com.team.gazue.MemberMapper";
  
  @Override
  public List<MemberVO> selectList(String type) throws Exception {
    return session.selectList(namespace + ".selectList", type);
  }

  @Override
  public void insert(MemberVO vo) throws Exception {
    session.insert(namespace + ".insert");
  }

  @Override
  public void update(MemberVO vo) throws Exception {
    session.update(namespace + ".update");
  }

  @Override
  public void delete(int seq) throws Exception {
    session.delete(namespace + ".delete", seq);
  }

}
