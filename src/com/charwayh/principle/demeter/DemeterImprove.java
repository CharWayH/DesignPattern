package com.charwayh.principle.demeter;

/**
 * @author charwayH
 * 迪米特法则
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
  */
public class DemeterImprove {
    public static void main(String[] args) {
        SchoolManager_ schoolManager = new SchoolManager_();
        schoolManager.printAllEmployee(new CollegeManger_());
    }
}


/**
 * 学校总部员工类
  */
class Employee{
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
class CollegeEmployee{
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
class CollegeManger{
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

    public void printEmployee(){
        List<CollegeEmployee_> list1 = getAllEmployee();
        System.out.println("========学院员工========");
        for (CollegeEmployee_ e : list1) {
            System.out.println(e.getId());
        }
    }

}

/**
 * 管理学校总部员工的管理类
 */
class SchoolManager{
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
    void printAllEmployee(CollegeManger sub){
        sub.printEmployee();
        List<Employee_> list2 = this.getAllEmployee();
        System.out.println("========学校总部员工========");
        for (Employee_ e : list2) {
            System.out.println(e.getId());
        }
    }
}