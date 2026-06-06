import java.util.Arrays;

public class ReverseString {

    public String reverseString(String str){
        char[] charArray=str.toCharArray();

        int start=0;int end=charArray.length-1;char temp;
        while (start<end){
            temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;end--;
        }

        return new String(charArray);
    }

}
