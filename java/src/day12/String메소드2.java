package day12;

import java.util.Scanner;

public class String메소드2 {

	public static void main(String[] args) {
		/* 5개짜리 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성하세요.
		 * 입력받은 파일 중 이미지 파일들을 출력하는 코드를 작성하세요
		 * */
		Scanner scan = new Scanner(System.in);
		String []arr = new String[5];
		String[] fileName = {"java의 정석.txt", "String메소드.java","java의 정석 앞표지.png", "java의 정석 뒷표지.jpg", "java의정석.hwp"};
		String [] img = {"png","jpg","gif","bmp"};
		System.out.println("---이미지파일리스트---");
//		int index;
//		String tmp;
		/* for(int i = 0; i<5;i++) {
			System.out.println((i+1)+"번째 fileName를 입력하세요.");
			String fileName = scan.next();
			arr[i] = fileName;
		} */
//		for(int i=0;i<arr.length;i++) {
//			index = arr[i].lastIndexOf('.');
//			tmp = arr[i].substring(index+1);
//			for(String tmp2 : img){
//				if(tmp2.equals(tmp)) {
//				System.out.println((i+1) + "번째 " + arr[i] + " 파일은 그림파일입니다.");
//				}
//			}
//		}
		for(String tmpFileName : fileName) {
			int index = tmpFileName.lastIndexOf('.');
			String suffix = null;
			if(index == -1) {
				continue;
			}
			suffix = tmpFileName.substring(index+1);
			
				if(contains(img,suffix)) {
					System.out.println(tmpFileName);
				}
		}
		scan.close();
	}
	/* 기능 : 배열과 찾을 문자열이 주어지면 배열에서 찾을 문자열이 있는지 없는지를 확인하여 알려주는 메소드
	 * */
	public static boolean contains(String arr[], String search) {
		if(arr==null || arr.length == 0) // 배열의 값이 없는 경우
			return false;
		if(search == null)  // 찾는 문자열이 없는경우.
			return false;
		for(String tmp : arr) {
			if(search.equals(tmp))
			return true;
		}
		return false;
	}
}
