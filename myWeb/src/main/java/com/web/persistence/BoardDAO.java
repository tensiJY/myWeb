package com.web.persistence;

import java.util.List;

import com.web.domain.BoardVO;


public interface BoardDAO {

	public List<BoardVO> getBoardList() throws Exception;

}
