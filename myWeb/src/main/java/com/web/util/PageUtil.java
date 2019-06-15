package com.web.util;
/*
�� Ŭ������ ������ �̵� ����� �����ϱ� ���ؼ� �ʿ��� 7���� ������
����ϰ� ������� Ŭ����
 */
public class PageUtil {
	public 		int		nowPage;		//	���� �������� ����� ����
	public		int		totalCount;	//	�� ������ ������ ����� ����
	
	public		int		listCount;		//	�� ȭ�鿡 ������ ����� ����
	public		int		pageGroup;		//	�� ȭ�鿡 ������ ������ ��
	
	public		int		totalPage;		//	�� ��������
	public		int		startPage;		//	���� ������
	public		int		endPage;		//	������ ������
	
	//	�������� �� Ŭ������ new ��Ű�鼭 �ʼ� ������ �˷��ֱ�� ����.
	public PageUtil(int nowPage, int totalCount) {
		this.nowPage	=	nowPage;
		this.totalCount	=	totalCount;
		//	�̵��� �� �κ��� �����ؼ� ����� Ȯ���ϵ��� ����.
		listCount = 10;
		pageGroup = 5;
		//	�Ʒ��ʿ� ���� �Լ��� �ϳ��� ȣ���ؼ� ������ 3���� ������
		//	����� ����.
		calcTotalPage();
		calcStartPage();
		calcEndPage();
	}
	//	�� ���������� ����� �Լ�
	private void calcTotalPage() {
		//	��ȭ�鿡 10���� ����ϱ�� �����Ƿ�....
		//	�� ������ 100���̸� 10�������� �ʿ��ϰ�
		//	�� ������ 101���̸� 11�������� �ʿ��ϴ�.
		
		totalPage = (totalCount % listCount) == 0 ? 
				(totalCount / listCount) : (totalCount / listCount) + 1;
	}
	//	���� �������� ����� �Լ�
	private void calcStartPage() {
		//	����
		//		���� �������� ���° �׷����� �˾Ƴ���
		int	tempGroup = (nowPage - 1) / pageGroup + 1;
		//		�� �׷��� ���� �������� ���Ѵ�.
		startPage = (tempGroup - 1) * pageGroup + 1;
		//startPage = nowPage; ����
	}
	//	������ �������� ����� �Լ�
	private void calcEndPage() {
		//	���� ������ + 5 - 1�� �ϸ� �ȴ�.
		endPage = startPage + pageGroup - 1;
		//	�ٸ� ������ �������� �� ����� �ƴ� ���� �ִ�.
		if(endPage > totalPage) {
			endPage = totalPage;
		}
	}
	
	//	�� ������ view���� JSTL�� �̿��ؼ� ����ؾ� �ϹǷ�....
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getListCount() {
		return listCount;
	}
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	public int getPageGroup() {
		return pageGroup;
	}
	public void setPageGroup(int pageGroup) {
		this.pageGroup = pageGroup;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}


}


/*
 	����¡ ó���ϱ�

	[����]	[1][2][3][4][5] [����]
	[����]	[6][7][8][9][10] [����]

	���� ����� ����� ���ؼ� �ݵ�� �˾ƾ� �� ����
	1.	���� ������
	2.	�� ������ ����
		==>		�ݵ�� �������� �˷��־�� �� ����
		
	3.	�� ȭ�鿡 ������ ����� ����
	4.	�� ȭ�鿡�� �̵� ������ ������ ��
		==>		�����ڵ��� ������ �����ؾ��� ����
		
	5.	�� ��������
	6.	ȭ�鿡 ǥ���� �������� ���� ������
	7.	ȭ�鿡 ǥ���� �������� ������ ������
		==>		��꿡 ���ؼ� ������� ����

	[����]	[1][2][3][4][5] [����]				1���׷�
	1-1 / 5 + 1		1��
	2-1 / 5 + 1
	3-1 / 5 + 1
	4-1 / 5 + 1
	5-1 / 5 + 1
	
	
	[����]	[6][7][8][9][10] [����]				2��
	6-1 / 5 + 1		2��
	7-1 / 5 + 1
	8-1 / 5 + 1
	9-1 / 5 + 1
	10-1 / 5 + 1
	
	[����]	[11][12][13][14][15] [����]		3
	[����]	[16][17][18][19][20] [����]		4
	[����]	[21][22][23][24][25] [����]		5
	[����]	[26][27][28] [����]		6
	
	1�׷��̸�	1������ ���� ����
	2�׷��̸� 6������ ���� ����
	3�׷��̸� 11������ ���� ����
	
	(1 - 1) * 5 + 1				1
	(2 - 1) * 5 + 1				6
	(3 - 1) * 5 + 1				11
*/