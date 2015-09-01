


public class Solution {

	private static void replaceSpace(){
		String str="Java is good";
		StringBuilder sb=new StringBuilder("");
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				count=count+3;
			}
			else{
				++count;
			}
		}
		char[] finalS = new char[count];
		int k=0;
		System.out.println(count);
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				sb.append("%20");
				finalS[k++]='%';
				finalS[k++]='2';
				finalS[k++]='0';
			}else{
				sb.append(str.charAt(i));
				finalS[k++]=str.charAt(i);
			}
		}
		System.out.println(sb);
		System.out.println(">>> "+String.valueOf(finalS));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		replaceSpace();
	}

}
