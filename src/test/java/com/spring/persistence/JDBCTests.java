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
	�ڹ� 1.7�������� ��밡�� AutoCloseable�������̽��� ������ Ŭ������ ��밡��
	���� �߻� ���ο� ��� ����
	try() {}�� ���·� ����
	try(�ȿ� ������ �۾� ������ �ڵ����� close)*/
	
	@Test
	public void textConnection() {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "javauser", "JAVA1234")){
			log.info(con);
			log.info("--------------");
			log.info("������ ���̽��� ���� ����");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
