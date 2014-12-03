/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

/**
 *
 * @author adi_irsyadi
 */
public interface ModelsProcess_Interface {
    public void showDataSet();
    public void showSelectedDataSet(String Value, String Key);
    public boolean addDataValue();
    public boolean editDataValue();
    public boolean subDataValue();
    public String genIdDataValue();
}

