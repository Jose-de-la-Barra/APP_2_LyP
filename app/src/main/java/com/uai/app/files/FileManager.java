package com.uai.app.files;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.uai.app.dominio.Persona;
import com.uai.app.logic.DataManager;

import com.uai.app.exceptions.CSVNotFoundException;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.List;

public class FileManager {

    private File theFile;

    private String[] titles = {"name","address","country","cost"};
    /*
    Reviso si existe el archivo que me van a hacer ocupar
    y sino tiro una excepcion para arriba
     */
    public FileManager(String fileName) throws CSVNotFoundException {
        this.theFile = new File(fileName);
        if (!theFile.exists()){
            throw new CSVNotFoundException();
        }
    }

    public HashSet<Persona> getData() {
        List<Persona> beans = null;
        try {
            FileReader ff = new FileReader(theFile, Charset.forName("UTF-8"));
            beans = new CsvToBeanBuilder(ff)
                    .withType(Persona.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            System.err.println("No existe el archivo");
        } catch (IOException e) {
            System.err.println("No se puede leer el archivo");
        }
      //  Collections.sort(beans);
        HashSet<Persona> personasFinales = new HashSet();
        personasFinales.addAll(beans);
        return personasFinales;
    }

    public void saveData(){
        try {
            FileWriter t = new FileWriter(theFile.getName());
            CSVWriter writer = new CSVWriter(t);
            // Aca convierto al csv que necesito
            writer.writeNext(titles, false);
            HashSet<Persona> data = DataManager.getInstance().getData();

            for(Persona p : data){
                //significa que lo quiero mantener
                writer.writeNext(p.getDataToCsv(),false);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
