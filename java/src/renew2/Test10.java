package renew2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		/*- 정수 n을 입력받고 입력받은 수만큼 단어와 뜻을
		 *  입력받아 저장하고 출력하는 코드를 작성하세요.*/
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();
		System.out.print("입력할 단어의 개수 : ");
		int size = scan.nextInt();
		
		while(list.size() < size) {
			System.out.print("단어 : ");
			String word = scan.next();
			System.out.print("뜻 : ");
			String mean = scan.next();
			//객체를 만들어 추가.
			list.add(new Word(word,mean));
		}
		Collections.sort(list);
		for(Word tmp : list) {
			System.out.println(tmp);
		}
		/* 입력한 단어 중 하나를 검색하여 출력하는 코드를 작성.*/
		System.out.print("검색할 단어 입력 : ");
		String search = scan.next();
		for(Word tmp : list) {
			if(tmp.equals(search)) {
				System.out.println("--검색된 단어--");
				System.out.println(tmp);
			}
		}
		scan.close();
	}
}
// 순서, 쌍 둘다 만족하기 위한 
class Word implements Comparable{
	private String word;
	private String mean;
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public int compareTo(Object o) {
		//정렬
		Word word = (Word)o;
		// 오름차순
		return this.word.compareTo(word.word);
//		내림차순
//		return -this.word.compareTo(word.word);
		 
	}
	
	
	@Override
	public String toString() {
		return "[" + word + " : " + mean + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof String) {
			return word.equals(obj);
		}
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
	
	
}