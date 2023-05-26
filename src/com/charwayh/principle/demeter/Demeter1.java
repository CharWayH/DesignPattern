package com.charwayh.principle.demeter;

/**
 * @author charwayH
 * 迪米特法则
 * SchoolManager_中，CollegeEmployee_类并不是SchoolManager_类的直接朋友
 * 按照迪米特法则，应该避免类中出现这样非直接朋友关系的耦合
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
  */
public class Demeter1 {
    public static void main(String[] args) {
        SchoolManager_ schoolManager = new SchoolManager_();
        schoolManager.printAllEmployee(new CollegeManger_());
    }
}


/**
 * 学校总部员工类
  */
class Employee_{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 学院员工类
 */
class CollegeEmployee_{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 管理学院员工的管理类
 */
class CollegeManger_{
    /**
     * 返回学院的所有员工
     */
    public List<CollegeEmployee_> getAllEmployee(){
        List<CollegeEmployee_> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // 增加10个员工到list
            CollegeEmployee_ emp = new CollegeEmployee_();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }
}
/**
 * 管理学校总部员工的管理类
 */
class SchoolManager_{
    public List<Employee_> getAllEmployee(){
        List<Employee_> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee_ emp = new Employee_();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    // CollegeEmployee_不是SchoolManager_的直接朋友
    void printAllEmployee(CollegeManger_ sub){
        List<CollegeEmployee_> list1 = sub.getAllEmployee();
        System.out.println("========学院员工========");
        for (CollegeEmployee_ e : list1) {
            System.out.println(e.getId());
        }
        List<Employee_> list2 = this.getAllEmployee();
        System.out.println("========学校总部员工========");
        for (Employee_ e : list2) {
            System.out.println(e.getId());
        }
    }
}