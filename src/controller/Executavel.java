/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import view.*;
import model.Veiculo;

/**
 *
 * @author TheGa
 */
public class Executavel {
    
    public static FrmPrincipal formPrin;
    public static List<Veiculo> veiculos;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        veiculos = new ArrayList<Veiculo>();
       
        formPrin = new FrmPrincipal();
        formPrin.setVisible(true);
    }
    
}
