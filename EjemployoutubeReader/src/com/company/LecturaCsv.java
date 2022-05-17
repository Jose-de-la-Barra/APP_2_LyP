package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaCsv {

    public static void main(String[] args) {

        try {

            File inventario= new File("/Users/mf.mayol/IdeaProjects/EjemployoutubeReader/src/com/company/inventario1.csv");

            //Scanner que lee desde el archivo
            Scanner inventoryscanner= new Scanner(inventario);
            //leer una linea
            String nextLine=inventoryscanner.nextLine();
            System.out.println(nextLine);


        } catch (FileNotFoundException e) {
            //si algo ocurre mal viene acá
            e.printStackTrace();
        }


    }
}
