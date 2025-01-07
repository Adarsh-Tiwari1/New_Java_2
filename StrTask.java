/*
class StrTask {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(5, "Ram");
        System.out.println(sb); //HelloRam
    }    
}
*/

/*
class StrTask{
    public static void main(String[] args) {
        String str = "welcometobhopal";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i] + " ");
        }
    }
}
*/

/*
class StrTask{
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "welcoMe to Bhopal";
        char[] ch = str.toCharArray();
        System.out.println(str.charAt(2));
        System.out.println(str2.charAt(6));
    }
}
*/

/*
class StrTask{
    public static void main(String[] args) {
        String str = "Java";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i=i+2){
           char temp = ch[i];
           ch[i] = ch[i+1];
           ch[i+1] = temp;
        }
        String swap = new String(ch);
        System.out.println(swap);
    }
}
*/
