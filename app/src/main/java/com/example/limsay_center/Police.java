package com.example.limsay_center;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Police extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listPolice = new String[] {"Polsek Bukit Raya", "Polsek Senapelan",
                "Polsek Tampan", "Polsek Sukajadi", "Polsek Rumbai"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listPolice));
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
            if (pilihan.equals("Polsek Bukit Raya")) {
                a = new Intent(this, P_BukitRaya.class);

            } else if (pilihan.equals("Polsek Senapelan")) {

            } else if (pilihan.equals("Polsek Tampan")) {

            } else if (pilihan.equals("Polsek Sukajadi")) {

            } else if (pilihan.equals("Polsek Rumbai")) {

            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
