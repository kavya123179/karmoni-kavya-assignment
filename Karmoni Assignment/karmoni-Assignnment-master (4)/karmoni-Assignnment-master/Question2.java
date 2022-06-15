//let us assume two string array as a={apple,fruit,text,world} and b={text,sam,try,apple,blue}
 //compare the both array and give the count of word same in both array.
 public class Main
{
    public static  int countMatch(String[] a, String[] b) {

        int count = 0;
        int cursor = 0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i].equals(b[j])){
                    count++;
                    cursor = j;
                    break;
                }
            }
        }
        return count;
    }
    
	public static void main(String[] args) {
	    String a[] = {"apple","fruit","text","world"} ;
	    String b[] = {"text","sam","try","apple","blue"};
		System.out.println(countMatch(a,b));
	}
}
