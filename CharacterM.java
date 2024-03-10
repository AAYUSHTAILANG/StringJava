public class CharacterM {
    public static void main(String[] args) 
    {
        //1.isLetter()
        String str = "Aa    yu  sh    223    @&*       Tai  la  ng 2001";
        StringBuilder sb = new StringBuilder();
        for(int i =0 ;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))//returns boolean
            {
                sb.append(str.charAt(i));
            }
        }        
        System.out.println(sb.toString());

        //2.isDigit
        StringBuilder sb1 = new StringBuilder();
        for(int i =0 ;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))//returns boolean
            {
                sb1.append(str.charAt(i));
            }
        }        
        System.out.println(sb1.toString());

        //3.isWhitespace (for space,tab and newline)
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0 ;i<str.length();i++)
        {
            if(!Character.isWhitespace(str.charAt(i)))//adds if not whitespace
            sb2.append(str.charAt(i));
        }

        System.out.println(sb2.toString());

        //4.isUpperCase & isLowerCase
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();

        for(int i=0;i<str.length();i++ )
        {
            if(Character.isUpperCase(str.charAt(i)))
            sb3.append(str.charAt(i));
            if(Character.isLowerCase(str.charAt(i)))
            sb4.append(str.charAt(i));
        }
        System.out.println(sb3+" "+sb4);

        //5.toUpperCase() & toLowerCase()
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();

        for(int i =0;i<str.length();i++)
        {
            if(Character.isLetter(str.charAt(i)))
            {

                sb5.append(Character.toUpperCase(str.charAt(i)));
                sb6.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        System.out.println(sb5+ " "+sb6);

        //6.isLetterOrDigit
        StringBuilder sb7 = new StringBuilder();
        for(int i =0 ;i<str.length();i++)
        {
           if(Character.isLetterOrDigit(str.charAt(i)))
           sb7.append(str.charAt(i));
        }
        System.out.println(sb7.toString());

        //other methods
        System.out.println(Character.compare('a','A'));
        

    }
}
