
public class Main {

    public static void main(String[] args) {
        final String ABC = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        final String text = "ЗТЕФТИ ЧЦФТ!\n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";

        Deciphering_sentences cd = new Deciphering_sentences(ABC);

        String[]  strText =  text.split("\n");
        int[] shiftValStr =  { -4, +8, +15};

        for (int i=0; i<shiftValStr.length; i++) {
            System.out.println(cd.decode(strText[i], shiftValStr[i]));
        }

        String[] words = strText[3].split(" ");
        int[] shiftValWord =  { +3, -5, +10, +2, -1, -4, +1, +7, -2, -3};

        for (int i=0; i<shiftValWord.length; i++) {
            System.out.print(cd.decode(words[i], shiftValWord[i])+" ");
        }
        System.out.println();

    }
}
