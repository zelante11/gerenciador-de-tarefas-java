/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.util.List;
import res.JavaSqlite;

/**
 *
 * @author admin
 */
public class TaskMaster {
    public static void main(String[] args) {
        JavaSqlite sq = new JavaSqlite();
        
        sq.selectAll();
    }
}
