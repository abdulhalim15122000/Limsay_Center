package com.example.limsay_center;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SuperMarket extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listSuperMarket = new String[] {"Swalayan 999", "Global Swalayan",
                "Planet Swalayan", "Naga Swalayan", "Berkah Swalayan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSuperMarket));
    }
    protected  void  onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampil(pilihan);
    }

    private void tampil(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Swalayan 999")) {
                a = new Intent(this, Swalayan999.class);

            } else if (pilihan.equals("Global Swalayan")) {

            } else if (pilihan.equals("Planet Swalayan")) {

            } else if (pilihan.equals("Naga Swalayan")) {

            } else if (pilihan.equals("Berkah Swalayan")) {

            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
