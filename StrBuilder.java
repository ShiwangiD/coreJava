public class StrBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        sb.append("shiwangi");
        sb.append(" dubey");
        sb.append("aaaaaaaaa");
        // System.out.println(sb);

        // sb.insert(2, 'i');
        // System.out.println(sb);

        // sb.delete(0, 2);
        // sb.deleteCharAt(1);
        //  sb.replace(1, 3, "xy");
        // sb.reverse();
        // sb.charAt(5);
        // sb.setCharAt(1, 'j');
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        
        sb.trimToSize();
        
    }
    
}
