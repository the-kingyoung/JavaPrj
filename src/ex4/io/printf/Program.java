package ex4.io.printf;
public class Program{
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1=50;
		kor2=60;
		kor3=80;
		
		total = kor1 + kor2 + kor3;
		avg = total/3;
		//----------성적출력부분-------------------------------
		System.out.println("┌──────────────────────┐");
		System.out.println("│        성적출력        │");
		System.out.println("└──────────────────────┘");
		
		System.out.printf("\t국어1 : %d\n",kor1);
		System.out.printf("\t국어2 : %d\n",kor2);
		System.out.printf("\t국어3 : %d\n",kor3);
		System.out.printf("\t총점 : %d\n",total);
		System.out.printf("\t평균 : %f\n",avg);
		
		System.out.println("───────────────────────");
		
		System.out.print(80);
		//System.out.write(80);
		//System.out.flush();
		
	}
}