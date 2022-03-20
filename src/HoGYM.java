import java.util.Scanner;

public class HoGYM {
	public static void main(String[] args) {
		
	     int num =0, date= 0;
	     String MemberName= "", MemberNumber= "";
	     double MemberHeight= 0, MemberWeight= 0, MemberBmi= 0;
		
	     Scanner input= new Scanner (System.in);
	     System.out.println("1. Add Member");
	     System.out.println("2. Delete Member");
	     System.out.println("3. Edit Member");
	     System.out.println("4. View Member");
	     System.out.println("5. Show a menu");
	     System.out.println("6. Exit");
		
	     while (num != 6) { //6이 나오면 반복문 종료
		 System.out.println("Select one number between 1-6:");
		 num= input.nextInt();
	
	         switch (num) {
	             case 1: //회원 신상정보 입력
	            	 System.out.println("Add Member");
	        	 System.out.print("Member Name:");
	        	 MemberName = input.next();
	        	 System.out.print("Member Height:");
	        	 MemberHeight = input.nextInt();
	        	 System.out.print("Member Weight:");
	        	 MemberWeight = input.nextInt();
	        	 System.out.print("Member Bmi:");
	        	 MemberBmi = input.nextInt();
	        	 System.out.print("Member Phone Number:");
	        	 MemberNumber = input.next();
	        	 System.out.print("Member Expiration Date:");
	        	 date = input.nextInt();
	 	         break;
	             case 2: //회원 신상정보 삭제
	            	 System.out.println("Delete Member");
                         MemberName = "";
                         MemberHeight = 0;
                         MemberWeight = 0;
                         MemberBmi = 0;
                         MemberNumber = "";
                         date = 0;
	                 break;
	             case 3: //회원 신상정보 수정
	            	 System.out.println("Edit Member");
	        	 System.out.print("Member Name:");
	        	 MemberName = input.next();
	        	 System.out.print("Member Height:");
	        	 MemberHeight = input.nextInt();
	                 System.out.print("Member Weight:");
	        	 MemberWeight = input.nextInt();
	                 System.out.print("Member Bmi:");
	        	 MemberBmi = input.nextInt();
	                 System.out.print("Member Phone Number:");
	                 MemberNumber = input.next();
	        	 System.out.print("Member Expiration Date:");
	        	 date = input.nextInt();
	            	 break;
	             case 4: //회원 신상정보 출력
	            	 System.out.println("View Member");
	            	 System.out.println("Member Name:" + MemberName);
	        	 System.out.println("Member Height:" + MemberHeight);
	        	 System.out.println("Member Weight:" + MemberWeight);
	                 System.out.println("Member Bmi:" + MemberBmi);
	                 System.out.println("Member Phone Number:" + MemberNumber);
	        	 System.out.println("Member Expiration Date:" + date);
	        	 break;
	             case 5: //메뉴 보기
	            	 System.out.println("Show a menu");
	            	 System.out.println("1. Add Member");
	    		 System.out.println("2. Delete Member");
	    		 System.out.println("3. Edit Member");
	    		 System.out.println("4. View Member");
	    		 System.out.println("5. Show a menu");
	    		 System.out.println("6. Exit");
                         break;
	             case 6: //종료
	            	 System.out.println("END");
	            	 break;
                 } 		 
	     }	
	}
}
