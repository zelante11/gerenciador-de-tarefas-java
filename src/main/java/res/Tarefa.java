/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package res;

/**
 *
 * @author admin
 */
public class Tarefa {

    private int tafID;
    private String titulo;
    private String descricao;

    //Getters and Setters
    public int getTafID() {
        return tafID;
    }

    public void setTafID(int tafID) {
        this.tafID = tafID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Construtor
    public Tarefa() {}
    public Tarefa(int id, String t, String desc){
        tafID = id;
        titulo = t;
        descricao = desc;
    }

}
