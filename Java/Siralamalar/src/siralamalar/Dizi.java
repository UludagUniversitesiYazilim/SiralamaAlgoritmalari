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
public class Dizi implements IDizi {
    int[] dizi;
    private int last_index;
    
    Dizi(){
        dizi = new int[2];
        dizi[0] = 1;
        last_index = 0;
    }
    
    Dizi(int[] dizi){
        this.dizi = dizi;
        last_index = (this.dizi.length - 1);
    }
    
    @Override
    public int[] getArray() {
        return dizi;
    }

    @Override
    public void push(int value) {
        System.out.println(dizi.length);
        last_index++;
        dizi[last_index] = value;
        check();
    }

    @Override
    public void insert(int index, int value) {
        try {
            
        }catch (ArrayIndexOutOfBoundsException e){
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    @Override
    public int pop() {
        if (last_index > 0){
            int pop;
            pop = dizi[last_index];
            last_index--;
            check();
            return pop; 
        }else{
            throw new ArrayIndexOutOfBoundsException("There is no element!");
        }
    }

    @Override
    public int length() {
        return (last_index + 1);
    }

    @Override
    public int getElement(int index) {
        if (index < length()){
            if (index < 0){
                index = length() + index;
            }
            return dizi[index]; 
        }else{
            throw new ArrayIndexOutOfBoundsException("There is no element!");
        }
    }

    @Override
    public String show_details() { //TODO : Duzeltilmeli
        String details;
        final String Sp = " ";
        details = "\n==========---- Details ----==========\n";
        
        for (int i=0; i < (length()); i++){
            details += "\t" + (i+1) + "\t:\t" + dizi[i] + "\n";
        }
        
        details += "\n The array has " + (length()) + " item./n";
        
        details += "\n==========---- Details ----==========\n";
        
        return details;
    }
    
    private void expand(){
        int[] new_array;
        
        new_array = new int[(last_index+1) * 2];
        copy(new_array);
        dizi = new_array;
        System.out.println("Dizi boyu" + this.length());
        System.gc();
    }
    
    private void restrict(){
        int[] new_array;
        
        new_array = new int[(last_index+1) / 2];
        copy(new_array);
        dizi = new_array;
        System.out.println("Dizi boyu" + this.length());
        System.gc();        
    }
    
    private void copy(int[] array){
        System.arraycopy(dizi, 0, array, 0, this.length());
    }
    
    private void check(){
        int real_len = dizi.length;
        int virt_len = last_index;
        
        if (real_len-2 < virt_len){
            System.out.println("Genisletiliyor...");
            expand();
        }
        
        if (virt_len < real_len-2){
            System.out.println("Daraltiliyor...");
            restrict();
        }
    }
}
