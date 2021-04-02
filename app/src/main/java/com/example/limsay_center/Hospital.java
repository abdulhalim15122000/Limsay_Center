package com.example.limsay_center;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listHospital = new String[] {"Rumah Sakit Awal Bross", "Rumah Sakit Eka Hospital",
        "Rumah Sakit Shafira", "Rumah Sakit Tabrani", "Rumah Sakit Ibnu Sina"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listHospital));
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
            if (pilihan.equals("Rumah Sakit Awal Bross")){
                a = new Intent(this,RSAwalBross.class);

            } else if (pilihan.equals("Rumah Sakit Eka Hospital")){

            }else if (pilihan.equals("Rumah Sakit Shafira")) {

            }else if (pilihan.equals("Rumah Sakit Tabrani")) {

            }else if (pilihan.equals("Rumah Sakit Ibnu Sina")) {

            }
            startActivity(a);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
