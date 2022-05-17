package com.uai.app.ui;

import com.uai.app.dominio.Persona;
import com.uai.app.exceptions.DataNotLoadedException;
import com.uai.app.logic.DataManager;
import com.uai.app.ui.utils.UAIJFrame;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.HashSet;

public class MostrarDatosUI extends UAIJFrame  {

    private JPanel mainPanel;
    private JPanel mainTableConatiner;
    private JTextArea textArea1;

    public MostrarDatosUI(String title) {
        super(title);
        this.setMainPanel(mainPanel);

        String[] titles = {"name","address","country","cost"};
        //obtengo las personas en una matriz
        HashSet<Persona> data = DataManager.getInstance().getData();
        String[][] dataTabla = new String[data.size()][4];
        int cont = 0;
        for(Persona p : data) {
            dataTabla[cont] = p.getDataToCsv();
            cont++;
        }

        TableModel tableModel = new DefaultTableModel(dataTabla, titles);
        JTable table = new JTable(tableModel);
        mainTableConatiner.setLayout(new BorderLayout());
        mainTableConatiner.add(new JScrollPane(table), BorderLayout.CENTER);

        mainTableConatiner.add(table.getTableHeader(), BorderLayout.NORTH);

        mainTableConatiner.setVisible(true);
        mainTableConatiner.setSize(400,400);
    }

}
