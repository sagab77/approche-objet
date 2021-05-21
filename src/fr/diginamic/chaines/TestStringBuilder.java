package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {



        String string = "";
        long debutString = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            string += i;
        }
        long finString = System.currentTimeMillis();
        System.out.println("String : temps écoulé en millisecondes :" + (finString - debutString));


        StringBuilder stringBuilder = new StringBuilder();
        long debutStringB = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            stringBuilder.append(i);
        }
        long finStringB = System.currentTimeMillis();
        System.out.println("StringBuilder : temps écoulé en millisecondes :" + (finStringB - debutStringB));


        StringBuffer stringBuffer = new StringBuffer();
        long debutStringBu = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            stringBuffer.append(i);
        }
        long finStringBu = System.currentTimeMillis();
        System.out.println("StringBuffer : temps écoulé en millisecondes :" + (finStringBu - debutStringBu));


    }

}