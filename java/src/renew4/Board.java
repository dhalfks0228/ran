package renew4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
private int num;
private static int count; //게시글 번호할당을 위해
private String title;
private String contents;
private String writer;
private Date registerDate; //import java.util.Date

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegisterDate() {
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
	//	String dateString = simpleFormat.format(registerDate);
	//	return dateString;
		return simpleFormat.format(registerDate);
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Board() {
		++count; //게시글 번호 1증가
		num = count;
		registerDate = new Date();
	}
	public Board(String title, String contents, String writer) {
		this();
		this.title = title;
		this.contents = contents;
		this.writer = writer;		
	}
	public Board(Board board) {
		this.num= board.num;
		this.registerDate = board.registerDate;
		this.contents = board.contents;
		this.writer = board.writer;
	}
	public Board(int num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//하나의 객체를 다른 두 참조변수가 공유
		if (this == obj)
			return true;
		//참조변후 obj가 객체와 연결이 안된 상태, 비교 대상이 없는 경우
		if (obj == null)
			return false;
		//Generate hashCode() and equals()를 이용하면
		// 기본적으로 클래스가 다르면 다르다고 판별.
		//하지만 Board클래스 에서는 게시글 번호를 이용하기 때문에 클래스가
		//Integer인 경우 비교가 가능하다.
		if (getClass() != obj.getClass()) {
			if(obj instanceof Integer) {
				if(num == (Integer)obj ) {
					return true;
				}
			}else {
				return false;
			}
		}
		Board other = (Board) obj;
		if (num != other.num)
			return false;
		return true;
		}
	@Override
	public String toString() {
		return "게시글 목록 [번호 : " + num + ", 제목 :" + title + ", 작성자 : " + writer
				+ ", 작성일 : " + getRegisterDate() + "]";
	}
	public void print() {
		System.out.println("번호 : " + getNum());
		System.out.println("제목 : " + getTitle());
		System.out.println("작성자 : " + getWriter());
		System.out.println("작성일 : " + getRegisterDate());
		System.out.println("내용 ");
		System.out.println(getContents());
	}
	
}
