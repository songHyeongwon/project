package com.spring.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("select sysdate from dual")
	public String getTime();
	
	@Select("select sd_name from student where sd_id=#{sd_id}")
	public String getName(String sd_id);
	
	public String getTime2();
	
	public String getSubjectName1(String s_num);
}
