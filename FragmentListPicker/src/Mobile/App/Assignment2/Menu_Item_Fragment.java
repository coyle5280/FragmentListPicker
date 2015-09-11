/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobile.App.Assignment2;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 *
 * @author godzilla
 */
public class Menu_Item_Fragment extends ListFragment {

    String[] menuItems = new String[]{
        "Hamburger",
        "Pizza",
        "Soup",
        "Salad",
        "Fries"
    };

    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, menuItems);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), R.id.theTextView, menuItems);
        setListAdapter(adapter);       
        
        /**
         * Inflate the layout for this fragment
         */
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
