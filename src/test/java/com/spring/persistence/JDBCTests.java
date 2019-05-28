package com.spring.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;


@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
/*	try-with-resources
	자바 1.7버젼부터 사용가능 AutoCloseable인터페이스의 구현된 클래스만 사용가능
	예외 발생 여부와 상관 없음
	try() {}의 형태로 정의
	try(안에 내용은 작업 종료후 자동으로 close)*/
	
	@Test
	public void textConnection() {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "javauser", "JAVA1234")){
			log.info(con);
			log.info("--------------");
			log.info("데이터 베이스에 정상 연결");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
