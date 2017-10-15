package by.homework.student;

import java.util.List;

import org.apache.ibatis.annotations.Select;

interface StudentMapper {
	
	@Select("select s.* from student s "
			+ "join teachers_have_students ths on s.id = ths.student_id "
			+ "where ths.teacher_id = #{teacher_id}")
	List<Student> getByTeacherId(long teacherId);
}
