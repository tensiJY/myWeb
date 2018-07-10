
show databases;
create schema book_ex;

use book_ex;

show tables;

create table tbl_member(
	m_no bigint auto_increment,
	m_id varchar(50) not null,
    m_pw varchar(50) not null,
    m_name varchar(50) not null,
    m_email varchar(100),
    m_regdate timestamp default now(),
    m_updatedate timestamp default now(),
    m_use varchar(2) default 'Y',
    m_leavedate timestamp,
    constraint primary key pk_mno(m_no),
    constraint unique u_mid(m_id)
);

create table tbl_board(
	b_no bigint not null auto_increment,
    b_writer varchar(100) not null,
    b_title varchar(100) not null,
    b_content text not null,
    b_regdate timestamp not null default now(),
    b_modidate timestamp not null default now(),
    b_viewcnt int(11) not null default 0,
    b_use varchar(2) not null default 'Y',
    constraint primary key pk_bno(b_no) 
);

INSERT INTO
	TBL_BOARD
(B_WRITER, B_TITLE, B_CONTENT)
		VALUES
('ADMIN', '제목', '내용');