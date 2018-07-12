package com.web.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.web.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession session;
	
	private final String name = "board";
	
	@Override
	public List<BoardVO> getBoardList() throws Exception {
		
		return session.selectList(name+".list");
	}
	
}
