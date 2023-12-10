/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Viceleno
 */
public class Reserva {
    private String periodo;
    private ArrayList<Usuario> listUsu;
    private ArrayList<Laboratorio> listLab;

    public Reserva() {
        listUsu = new ArrayList<>();
        listLab = new ArrayList<>();
    }

    
    public Reserva(String periodo) {
        this.periodo = periodo;
        listUsu = new ArrayList();
        listLab = new ArrayList();
    }
    
    
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Usuario> getListUsu() {
        return listUsu;
    }

    public void setListUsu(ArrayList<Usuario> listUsu) {
        this.listUsu = listUsu;
    }

    public ArrayList<Laboratorio> getListLab() {
        return listLab;
    }

    public void setListLab(ArrayList<Laboratorio> listLab) {
        this.listLab = listLab;
    }
    
    public void addUsu(Usuario u){
        u.setRes(this);
        listUsu.add(u);
    }
    
    public void addLab(Laboratorio l){
        l.setRes(this);
        listLab.add(l);
    }
    
}
