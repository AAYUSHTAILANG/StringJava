public class SBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("JAVA SPRINGBOOT");
        System.out.println(sb.capacity()); //16

        System.out.println(sb.reverse());
        //OTHER METHODS ARE SAME AS SPRINGBUFFER
        //ONLY THE METHODS ARE NON-SYNCHRONISED
    }
}
