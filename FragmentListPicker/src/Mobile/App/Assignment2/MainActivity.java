package Mobile.App.Assignment2;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupView();
    }

    private void setupView() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction
                = fragmentManager.beginTransaction();

        Menu_Item_Fragment menu = new Menu_Item_Fragment();
        fragmentTransaction.add(android.R.id.content, menu);
        fragmentTransaction.commit();

    }

}
