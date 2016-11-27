package com.emp.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.emp.model.emp;



@Repository("empDAO")
public class empDAOlmpl implements empDAO {
public List<emp> getallemp(){
List<emp> empl = new ArrayList<emp>();
emp vo1 = new emp();
vo1.setId(1);
vo1.setFirstName("Aabha");
vo1.setLastName("Kulkarni");
empl.add(vo1);

emp vo2 = new emp();
vo2.setId(2);
vo2.setFirstName("Sandip");
vo2.setLastName("Karve");
empl.add(vo2);

return empl;
}
}
