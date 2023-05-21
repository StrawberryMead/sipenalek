/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kkp.sipenalek;

/**
 *
 * @author Dell
 */
public class ComboBoxItem {
    private int id;
    private String label;

    public ComboBoxItem(Integer id, String label) {
        this.id = id;
        this.label = label;
    }
    public Integer getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() {
      return label;
    }
} 
