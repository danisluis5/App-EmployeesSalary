/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.eployees.salary.render;

import app.eployees.salary.bean.PhanXuong;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author vuongluis
 */
public class PhanXuongComboboxModel implements ComboBoxModel{

    private ArrayList<PhanXuong> list = new ArrayList<>();
    private PhanXuong object;
    
    public PhanXuongComboboxModel(){
        list.add(new PhanXuong(1, "A",300));
        list.add(new PhanXuong(2, "B",500));
        list.add(new PhanXuong(3, "C",500));
        list.add(new PhanXuong(4, "D",500));
        object = list.get(0);
    }
    @Override
    public void setSelectedItem(Object anItem) {
        object = (PhanXuong) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return object;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
       return list.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
}
