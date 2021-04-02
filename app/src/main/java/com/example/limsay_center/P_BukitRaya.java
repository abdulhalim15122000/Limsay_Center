package com.example.limsay_center;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class P_BukitRaya extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "Driving Direction", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampil(pilihan);
    }

    private void tampil(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")){
                String telepon ="tel:+62-761-21000";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(telepon));

            }else if (pilihan.equals("Driving Direction")) {
                String lokasirs ="https://goo.gl/maps/Sp6TycLiTy3zGeV16";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));

            }else if (pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Polsek Bukit Raya");
            }
            startActivity(a);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
