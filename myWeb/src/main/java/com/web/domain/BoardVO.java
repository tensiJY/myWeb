package com.web.domain;

import java.sql.Date;

public class BoardVO {

	private int bno;
	private String bwriter;
	private String bcontent;
	private Date bregdate;
	private Date bmodidate;
	private int bviewcnt;
	private String buse;
	private String btitle;
	
	

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public Date getBregdate() {
		return bregdate;
	}

	public void setBregdate(Date bregdate) {
		this.bregdate = bregdate;
	}

	public Date getBmodidate() {
		return bmodidate;
	}

	public void setBmodidate(Date bmodidate) {
		this.bmodidate = bmodidate;
	}

	public int getBviewcnt() {
		return bviewcnt;
	}

	public void setBviewcnt(int bviewcnt) {
		this.bviewcnt = bviewcnt;
	}

	public String getBuse() {
		return buse;
	}

	public void setBuse(String buse) {
		this.buse = buse;
	}

	

}
