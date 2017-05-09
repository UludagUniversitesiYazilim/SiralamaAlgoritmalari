/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siralamalar;

/**
 *
 * @author berkay
 */
public interface IDizi {
    
    public int[] getArray();
    public void push(int value);
    public void insert(int index, int value);
    public int pop();
    public int length();
    public int getElement(int index);
    public String show_details();

    
    
}
