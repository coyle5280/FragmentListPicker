/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.App.Assignment2;


import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

/**
 *
 * @author godzilla
 */
public class FragmentOne extends Fragment {
    
    public View onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        

        
        View viewFrag = inflater.inflate(R.layout.frag1, container, false);


        
        return viewFrag;
    }
    
    
}
