public class StringM{
    public static void main(String[] args) {
        String s ="Aayush";

        //I. LENGTH METHOD
        System.out.println(s.length());//6

        /* 
        try
        {
        String s1=null;
        System.out.println(s1.length());//is null Exception
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        */

        //II.TRIM METHOD

        String t = "            MATHS                    ";
        System.out.println(t.trim());//MATHS //REMOVES THE SPACES

        String t1="           abc         xyz            ";
        System.out.println(t1.trim());//abc         xyz //removes trailing and leading spaces only

        System.out.println(t1.trim().length());//15

        //System.out.println(t1.length().trim());//error

       
        //III. EQUALS

        String e="Aayush";
        String e1="Aayush";
        String e2="aayush";

        if(e.equals(e1))
        System.out.println("strings "+e+" "+e1+" are equal");
        if(!e1.equals(e2))
        System.out.println("strings "+e1+" "+e2+" are unequal");
        if(!e2.equals(e))
        System.out.println("strings "+e2+" "+e+" are unequal");
        
        System.out.println("************Equals ignore case****************");

        //IV.EQUALSIGNORECASE
        if(e.equalsIgnoreCase(e1))
        System.out.println("strings "+e+" "+e1+" are equal");
        if(e1.equalsIgnoreCase(e2))
        System.out.println("strings "+e1+" "+e2+" are equal");
        if(e2.equalsIgnoreCase(e))
        System.out.println("strings "+e2+" "+e+" are equal");

        //V. compareTo METHOD
        System.out.println("***********COMPARETO()*************");
        String c ="a";
        String c1 ="A";

        System.out.println(c.compareTo(c1));//97-65=32

        String c2="a";
        System.out.println(c.compareTo(c2));//0

        String c3="z";
        System.out.println(c.compareTo(c3));//-25

        //VI. compareToIgnoreCase
        System.out.println("********comparetoignorecase**********");
        System.out.println(c.compareToIgnoreCase(c1));


        // +
        System.out.println("******** + *******************");
        String p ="JAVA";
        System.out.println(p+10);//p10
        System.out.println(p+10+20);//p1020
        System.out.println(20+p+10);//20p10
        System.out.println(20+10+p);//30p
        System.out.println(p+10/2);//p5
        System.out.println(p+10*5);//p50
     // System.out.println(p+10-5);//error

        //VII CONCAT METHOD
        System.out.println("*******concat***********");
        String co ="Aayush";
        String co1 ="Tailang";
        System.out.println(co.concat(co1));//AayushTailang

        //VIII JOIN METHOD
        System.out.println("*******join************");
        System.out.println(String.join("|", co,co1));//Aayush|Tailang
        System.out.println(String.join(":", co,co1));//Aayush:Tailang
        System.out.println(String.join("@", co,null));//Aayush@null
        System.out.println(String.join("$", null,co1));//null$Tailang
      //System.out.println(String.join(null, co));//exception

        //IX SUBSEQUENCE
        System.out.println("********subsequence***********");

        String ss ="My project title is HOSTEL HUNT";
        System.out.println(ss.subSequence(3, 15));//project titl

        System.out.println(ss.substring(3,15));//project titl
        System.out.println(ss.substring(5));//oject title is HOSTEL HUNT

        //X.charAt()
        String ca ="Aayush";
        for(int i=0;i<ca.length();i++)
        {
            System.out.println("char at " +i+"= "+ ca.charAt(i));
        }

        //XI.valueAt()
        int a= 10;
        String va = String.valueOf(a);
        System.out.println(va+a);//treats as string

        //XII.toCharArray()
        char [] tca = ca.toCharArray();
        for(int i=0;i<tca.length;i++)
        {
            System.out.println(tca[i]);
        }

    }
}
