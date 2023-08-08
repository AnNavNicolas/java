public class Reto32 {
    public static void main(String[] args) {
        System.out.println(findColumn("A"));
        System.out.println(findColumn("Z"));
        System.out.println(findColumn("AA"));
        System.out.println(findColumn("CA"));
        System.out.println(findColumn("zz"));
    }
    public static Integer findColumn(String column) {
        column = column.toUpperCase();
        Integer result = 0;
        for(char character : column.toCharArray()){
            int i = 1;
            for(char c = 'A'; c <= 'Z'; ++c){
                if(character == c){
                    result = result * 26 + i;
                }
                i++;
            }
        }
        return result;
    }
}