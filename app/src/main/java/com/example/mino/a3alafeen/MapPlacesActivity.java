package com.example.mino.a3alafeen;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MapPlacesActivity extends Activity {

    Button Map_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_places);
        Map_btn = findViewById(R.id.Map_btn);
        Map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Group of static links

               // final String uri = "http://maps.google.com/maps?daddr=Gachibowli"+"+to:Lingampally+to:Nizampet+to:kukatpally+to:moosapet+to:Nizampet+to:srnagar+to:ameerpet+to:jubileehills+to:kothaguda";
               // final String uri = "http://maps.google.com/maps?daddr=Gachibowli"+"+to:Lingampally";
               // final String uri = "https://maps.google.com/maps?saddr=San+Francisco,+CA&daddr=Los+Angeles,+CA+to:Phoenix,+AZ+to:Houston,+TX+to:Jacksonville,+FL+to:New+York,+NY+to:Buffalo,+NY+to:Chicago,+IL+to:Seattle,+WA+to:San+Jose,+CA";
               // final String uri = "https://maps.google.com/maps?saddr=San+Francisco,+CA&daddr=Los+Angeles,+CA";
               // final String uri = "https://maps.google.com/maps/dir/?api=&1map_action=pano&origin="+"Mansoura"+"&destination="+"Cairo";
               // final Srting uri = "https://www.google.com/maps/dir/Mansoura+University/Cairo";
               // final String uri = "https://maps.google.com/maps/dir/origin="+"Mansoura"+"/destination="+"Cairo";

                String origin="Mansoura";
                String dest= "Cairo";
                //Value of origin
                String str_org = "origin=" + origin;
                //Value of destination
                String str_dest = "&8&destination=" + dest;

                String param = str_org +"&" + str_dest;
                String url = "https://www.google.com/maps/dir/?api=1&"+ param;


                //the full url
                //final String uri ="https://www.google.com/maps/dir/?api=1&origin=Mansoura&8&destination=Cairo";



//                lamiaa's method
//                String ur = "";
//                final String uri = "https://maps.google.com/maps?saddr=";
//                String startpoint="Mansoura";
//                String endpoint= "Cairo";
//                ur.concat(uri + startpoint + "&daddr=" +endpoint);
//                final Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(ur));




                final Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
                //final Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?saddr="+src_lat+","+src_ltg+"&daddr="+des_lat+","+des_ltg));

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
//                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
//                    startActivity(intent);
//                }
                if (intent.resolveActivity(getPackageManager()) !=null){
                    startActivity(intent);
                }
            }
        });
    }
}
