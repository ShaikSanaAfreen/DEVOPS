package pack;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import java.sql.SQLException;
import java.util.*;
import com.mysql.jdbc.ResultSet;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;


public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate=jdbcTemplate;
}

	public int saveStudent(Student s){  
	    String query="insert into Student values('"+s.getId()+"','"+s.getName()+"')";  
	    return jdbcTemplate.update(query);  
	} 
	public int updateStudent(Student s){  
	    String query="update Student set name='"+s.getName()+"' where id='"+s.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteStudent(Student s){  
	    String query="delete from Student where id='"+s.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}


	public List<Student>getAllStudents()
	{

		return jdbcTemplate.query("select * from Student",new ResultSetExtractor<List<Student>>() {
			
				@Override
				public List<Student>extractData(java.sql.ResultSet rs)throws SQLException,DataAccessException{
				List<Student> list=new ArrayList<Student>();
				while(rs.next())
				{
					Student e=new Student();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					list.add(e);
					
				}
				return list;
	}
});
		}
}