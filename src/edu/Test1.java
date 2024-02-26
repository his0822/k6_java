package edu;
public class Test1 {
	public static void main(String[] args) {
		{
			// 한 라인에 한개식 출력하는 코드
			System.out.println("이름 : 이상현") ;
			System.out.println("성별 : 남") ;
			System.out.println("학교 : 부산대학교") ;
			System.out.println("나이 : 미공개") ;
		}
		System.out.println("=".repeat(60));
		{
			// 한 라인에 전체를 한꺼번에 출력하는 코드
			//  \t ? 탭키 삽입
			System.out.print("이름 : 이상현 \t") ;
			System.out.print("성별 : 남 \t") ;
			System.out.print("학교 : 부산대학교 \t") ;
			System.out.print("나이 : 미공개") ;
			System.out.println("") ;
		}
		System.out.println("=".repeat(60));
		{
			// 한 라인에 전체를 한꺼번에 출력하는 코드
			// \n ? 다음줄로 이동
			System.out.print("이름 : 이상현\n") ;
			System.out.print("성별 : 남\n") ;
			System.out.print("학교 : 부산대학교\n") ;
			System.out.print("나이 : 미공개") ;
		}
	}
}
