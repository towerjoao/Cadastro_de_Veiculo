/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author TheGa
 */
public class VeiculoController {
    
    static Executavel executavel;
    
    public static void preencherTabela(JTable tabela, List<Veiculo> lista) {
        DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(lista.size());
        tabela.setModel(dtm);
        
        int posLinha = 0;
        for (Veiculo a : lista) {
            tabela.setValueAt(a.getModelo(), posLinha, 0);
            tabela.setValueAt(a.getMarca(), posLinha, 1);
            tabela.setValueAt(a.getPlaca(), posLinha, 2);
            tabela.setValueAt(a.getValor(), posLinha, 3);
            tabela.setValueAt(a.getAno(), posLinha, 4);
            tabela.setValueAt(a.getFone(), posLinha, 5);
            tabela.setValueAt(a.getEndereco(), posLinha, 6);
            tabela.setValueAt(a.getCidade(), posLinha, 7);
            tabela.setValueAt(a.getUf(), posLinha, 8);
            posLinha++;
        }
    }
    
    public static void cadastrarVeiculo(String modelo, String marca, String placa, String valor, String ano, String fone, String endereco, String cidade, String uf ) {
        Veiculo v = new Veiculo();
        v.setMarca(marca);
        v.setModelo(modelo);
        v.setPlaca(placa);
        v.setValor(valor);
        v.setAno(ano);
        v.setFone(fone);
        v.setEndereco(endereco);
        v.setCidade(cidade);
        v.setUf(uf);
        executavel.veiculos.add(v);
        JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!", "Sucesso", 1);
    }
    
    public static void editarVeiculo(String modelo, String marca, String placa, String valor, String ano, String fone, String endereco, String cidade, String uf, int pos) {
        Veiculo v = new Veiculo();
        v.setMarca(marca);
        v.setModelo(modelo);
        v.setPlaca(placa);
        v.setValor(valor);
        v.setAno(ano);
        v.setFone(fone);
        v.setEndereco(endereco);
        v.setCidade(cidade);
        v.setUf(uf);
        executavel.veiculos.set(pos, v);
        JOptionPane.showMessageDialog(null, "Veiculo editado com sucesso!", "Sucesso", 1);
        
    }
    
    public static void excluirVeiculo(JTable tabela) {
        if (tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro!", "Erro", 0);
        } else {
            int reply = JOptionPane.showConfirmDialog(null, "Tem certeza?", "Excluir veiculo", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                executavel.veiculos.remove(tabela.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Veiculo excluido com sucesso!", "Sucesso", 1);
            }
        }
    
        }
        
        }

    


