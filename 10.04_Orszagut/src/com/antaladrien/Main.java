package com.antaladrien;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Jarmu> lista = new ArrayList<Jarmu>();

    public static void jarmuvekJonnek() throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("jarmuvek.txt"));
        String line = br.readLine();
        while (line != null) {
            String[] szavak = line.split(";");
            if (szavak[0].equals("robogo")) {
                Robogo a = new Robogo(szavak[1], Integer.parseInt(szavak[2]), Integer.parseInt(szavak[3]));
                lista.add(a);
            } else if (szavak[0].equals("audi")) {
                AudiS8 a = new AudiS8(szavak[1], Integer.parseInt(szavak[2]), Boolean.parseBoolean(szavak[3]));
                lista.add(a);
            } else {
                System.out.println("Hibás sor");
            }
            line = br.readLine();
        }
//        System.out.println(lista);
        br.close();
    }

    public static void kiketMertunkBe() throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter("buntetes.txt"));
        for (Object o : lista) {
            if (o instanceof Robogo) {
                wr.write(o.toString() + (((Robogo) o).haladhatItt(90) ? " haladhat\n" : " nem haladhat\n"));
            } else if (o instanceof AudiS8) {
                wr.write(o.toString() + (((AudiS8) o).gyorshajtottE(90) ? " gyorshajtott" : " nem hajtott gyorsan\n"));
            }
        }
        wr.close();
    }

    public static void main(String[] args) {
        try {
            jarmuvekJonnek();
            kiketMertunkBe();
        } catch (Exception ex) {
            System.out.println("Hiba történt");
        }
    }
}
