class Solution {
    public void reverseString(char[] s) {
             helper(0,s);
         }
         private static void helper(int index,char[] str){
             char tmp;
             if(str==null||index>=str.length/2){
                 return;
             }
             helper(index+1,str);
             tmp=str[index];
             str[index]=str[str.length-index-1];
             str[str.length-index-1]=tmp;
            // System.out.print(str[str.length-index-1]);
         }
 }