package by.homework.teacher;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

interface TeacherMapper {

	@Select("select * from teacher where id = #{id}")
	@Results({ 
		@Result(property = "id", column = "id"),
		@Result(property = "students", column = "id", javaType = List.class, many = @Many(select = "by.homework.student.StudentMapper.getByTeacherId")) })
	Teacher getById(long id);
	
	@Select("select * from teacher")
	@Results({ 
		@Result(property = "id", column = "id"),
		@Result(property = "students", column = "id", javaType = List.class, many = @Many(select = "by.homework.student.StudentMapper.getByTeacherId")) })
	List<Teacher> getAll();
}