package org.example.Practice;

public class UnitTest {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e' };
        for(int i=0;i<chars.length;++i){
            chars[i] = (char) (chars[i] -32);
        }
        System.out.println(chars);
    }
}
