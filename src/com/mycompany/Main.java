package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> allWords = new ArrayList<>();
        int aLetter=0;
        int ąLetter=0;
        int bLetter=0;
        int cLetter=0;
        int ćLetter=0;
        int dLetter=0;
        int eLetter=0;
        int ęLetter=0;
        int fLetter=0;
        int gLetter=0;
        int hLetter=0;
        int iLetter=0;
        int jLetter=0;
        int kLetter=0;
        int lLetter=0;
        int łLetter=0;
        int mLetter=0;
        int nLetter=0;
        int ńLetter=0;
        int oLetter=0;
        int óLetter=0;
        int pLetter=0;
        int qLetter=0;
        int rLetter=0;
        int sLetter=0;
        int śLetter=0;
        int tLetter=0;
        int uLetter=0;
        int vLetter=0;
        int wLetter=0;
        int xLetter=0;
        int yLetter=0;
        int zLetter=0;
        int źLetter=0;
        int żLetter=0;


        System.out.println("Enter a text:");
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String wordInText=in.next();
            if (wordInText.equals("stop"))break;
            allWords.add(wordInText);
        }

        if (allWords != null) {
            for (String word:allWords){
                char[] letters=word.toLowerCase().toCharArray();
                for (char l : letters) {
                    switch (l){
                        case 'a':
                            aLetter++;
                            break;
                        case 'ą':
                            ąLetter++;
                            break;
                        case 'b':
                            bLetter++;
                            break;
                        case 'c':
                            cLetter++;
                            break;
                        case 'ć':
                            ćLetter++;
                            break;
                        case 'd':
                            dLetter++;
                            break;
                        case 'e':
                            eLetter++;
                            break;
                        case 'ę':
                            ęLetter++;
                            break;
                        case 'f':
                            fLetter++;
                            break;
                        case 'g':
                            gLetter++;
                            break;
                        case 'h':
                            hLetter++;
                            break;
                        case 'i':
                            iLetter++;
                            break;
                        case 'j':
                            jLetter++;
                            break;
                        case 'k':
                            kLetter++;
                            break;
                        case 'l':
                            lLetter++;
                            break;
                        case 'ł':
                            łLetter++;
                            break;
                        case 'm':
                            mLetter++;
                            break;
                        case 'n':
                            nLetter++;
                            break;
                        case 'ń':
                            ńLetter++;
                            break;
                        case 'o':
                            oLetter++;
                            break;
                        case 'ó':
                            óLetter++;
                            break;
                        case 'p':
                            pLetter++;
                            break;
                        case 'q':
                            qLetter++;
                            break;
                        case 'r':
                            rLetter++;
                            break;
                        case 's':
                            sLetter++;
                            break;
                        case 'ś':
                            śLetter++;
                            break;
                        case 't':
                            tLetter++;
                            break;
                        case 'u':
                            uLetter++;
                            break;
                        case 'v':
                            vLetter++;
                            break;
                        case 'w':
                            wLetter++;
                            break;
                        case 'x':
                            xLetter++;
                            break;
                        case 'y':
                            yLetter++;
                            break;
                        case 'z':
                            zLetter++;
                            break;
                        case 'ź':
                            źLetter++;
                            break;
                        case 'ż':
                            żLetter++;
                            break;
                    }

                }
            }
        }


        System.out.println("a "+aLetter);
        System.out.println("ą "+ąLetter);
        System.out.println("b "+bLetter);
        System.out.println("c "+cLetter);
        System.out.println("ć "+ćLetter);
        System.out.println("d "+dLetter);
        System.out.println("e "+eLetter);
        System.out.println("ę "+ęLetter);
        System.out.println("f "+fLetter);
        System.out.println("g "+gLetter);
        System.out.println("h "+hLetter);
        System.out.println("i "+iLetter);
        System.out.println("j "+jLetter);
        System.out.println("k "+kLetter);
        System.out.println("l "+lLetter);
        System.out.println("ł "+łLetter);
        System.out.println("m "+mLetter);
        System.out.println("n "+nLetter);
        System.out.println("ń "+ńLetter);
        System.out.println("o "+oLetter);
        System.out.println("ó "+óLetter);
        System.out.println("p "+pLetter);
        System.out.println("q "+qLetter);
        System.out.println("r "+rLetter);
        System.out.println("s "+sLetter);
        System.out.println("ś "+śLetter);
        System.out.println("t "+tLetter);
        System.out.println("u "+uLetter);
        System.out.println("v "+vLetter);
        System.out.println("w "+wLetter);
        System.out.println("x "+xLetter);
        System.out.println("y "+yLetter);
        System.out.println("z "+zLetter);
        System.out.println("ź "+źLetter);
        System.out.println("ż "+żLetter);
        System.exit(0);


    }
}
