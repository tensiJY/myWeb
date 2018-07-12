package com.web.service;

import java.util.List;

import com.web.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> getBoardList() throws Exception;

}
