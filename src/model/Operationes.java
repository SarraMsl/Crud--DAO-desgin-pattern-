

package model;

import java.util.ArrayList;


public interface Operationes {
    public boolean insert(Object obj);
    public boolean delete(Object obj);
    public boolean update(Object obj);
    public  ArrayList<Object[]> read();
    public  ArrayList<Object[]> recherch(int id);

    
}
