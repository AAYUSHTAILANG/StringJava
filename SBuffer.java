public class SBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("capacity is : "+sb.capacity());//Initially 16

        sb.append("yo yo");
        System.out.println("capacity is : "+sb.capacity());//16

        sb.append("sadasdasdasda");
        System.out.println("capacity is : "+sb.capacity());//34 //(16*2)+2

        StringBuffer sb1 = new StringBuffer("Aayush");
        System.out.println("capacity is : "+sb1.capacity());//capacity is : 22
        //16 + 6 =22

        System.out.println(sb1.append(" Tailang"));

         sb1.delete(2, 4);
        
        System.err.println(sb1);

        //equals
        StringBuffer sb2 =new StringBuffer("Aayush");
        StringBuffer sb3 = new StringBuffer("Aayush");
        System.out.println(sb2.equals(sb3));//false
        System.out.println(sb2.toString().equals(sb3.toString()));//true

        //reverse
        System.out.println(sb2.reverse());//hsuyaA




    }
}
