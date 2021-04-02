package com.example.limsay_center;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Swalayan999 extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "Driving Direction", "Website", "Info di Google", "Exit"};
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
                String telepon ="tel:0822-8652-9991";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(telepon));

            }else if (pilihan.equals("Driving Direction")) {
                String lokasirs = "https://goo.gl/maps/Y54M2zrhricN9Sfa9";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            }else if (pilihan.equals("Website")) {
            String website = "https://swalayan999.business.site/";
            a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            }else if (pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Swalayan 999");
            }
            startActivity(a);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
