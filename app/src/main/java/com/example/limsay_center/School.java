package com.example.limsay_center;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class School extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listSchool = new String[] {"MAN 1 Pekanbaru", "MAN 2 Model Pekanbaru",
                "MAN 3 Pekanbaru", "MAN 4 Pekanbaru", "SMK 2 Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSchool));
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
            if (pilihan.equals("MAN 1 Pekanbaru")) {
                a = new Intent(this, man1pku.class);

            } else if (pilihan.equals("MAN 2 Pekanbaru")) {

            } else if (pilihan.equals("MAN 3 Pekanbaru")) {

            } else if (pilihan.equals("MAN 4 Pekanbaru")) {

            } else if (pilihan.equals("SMK 2 Pekanbaru")) {

            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
