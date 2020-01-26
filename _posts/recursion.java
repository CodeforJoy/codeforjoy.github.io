public class S {
    public void reverseString(char[] s) {
        helper(0,s);

    }
    private static void helper(int index,char[] str){
        if(str==null||index>=str.length){
            return;
        }
        helper(index+1,str);
        System.out.print(str[index]);
        if(index!=0)
            System.out.print(',');
    }
}
