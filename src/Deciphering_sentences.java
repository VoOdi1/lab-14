
import java.util.HashMap;

public class Deciphering_sentences {
    String ABC;
    int ABC_len;

    Deciphering_sentences(String ABC)
    {
        this.ABC = ABC;
        ABC_len = ABC.length();
    }

    String decode(String str, int shift)
    {
        char[] strc = str.toCharArray();
        String dstr = "";
        for(char c: strc)
        {
            char buffer = c;
            int ABCpos = ABC.indexOf(c);
            if(ABCpos >= 0)
            {
                if(ABCpos + shift < 0)
                {
                    buffer = ABC.charAt(ABCpos + shift + ABC_len);
                }
                else if (ABCpos + shift >= ABC_len)
                {
                    buffer = ABC.charAt(ABCpos + shift - ABC_len);
                }
                else
                {
                    buffer = ABC.charAt(ABCpos + shift);
                }

            }
            dstr += buffer;
        }
        return dstr;
    }

    HashMap<Integer,String> allDecode(String str)
    {
        HashMap<Integer,String> decodeVariant = new HashMap<Integer,String>();
        for(int i=0; i<ABC_len; i++)
        {
            decodeVariant.put(i, decode(str,i));
        }
        return decodeVariant;
    }
}
