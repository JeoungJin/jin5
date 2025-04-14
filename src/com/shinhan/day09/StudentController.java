package com.shinhan.day09;

/*  MVC2모델
 * Controller(C)...사용자와 소통 (요청과 응답)
 * Service(Model) ... 업무로직 (요청을 처리한다.)
 * DAO(Model) .... DB에 업무(CRUD작업 : insert, select, update, delete)
 * DTO(Model) .... Data Transfer 하기위한 설계
 * View(V) ....display 
 * 
 */


public class StudentController {

	public static void main(String[] args) {

		 StudentDAO dao = new StudentDAO();
         StudentService service = new StudentService(dao);
         
         StudentDTO[] arr = service.findAll();
         StudentView.print(arr);
         
         StudentView.print( service.findById("12345") );
         
         StudentDTO a= new StudentDTO("12345", "차민건1");
         StudentDTO b= new StudentDTO("12345", "차민건2");
         System.out.println(a.equals(b));
         System.out.println(a.getGrade());
         System.out.println(a.getMajor());
         System.out.println(a.getName());
	}

}
