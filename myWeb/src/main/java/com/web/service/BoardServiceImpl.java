package com.web.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.web.domain.BoardVO;
import com.web.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Inject
	private BoardDAO bdao;
	
	@Override
	public List<BoardVO> getBoardList() throws Exception {
		return bdao.getBoardList();
	}

}
