package com.aermb.modul1_googlemapsapi;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.aermb.modul1_googlemapsapi.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng untad = new LatLng(-0.83643, 119.89369);
        LatLng vatulemo = new LatLng(-0.90019, 119.88957);
        LatLng sma5 = new LatLng(-0.84181, 119.88399);
        LatLng tokytoky = new LatLng(-0.83976, 119.88344);
        LatLng hotelbrisky = new LatLng(-0.85338, 119.88225);
        LatLng terminalmamboro = new LatLng(-0.80617, 119.883653);
        LatLng poldasulteng = new LatLng(-0.85627, 119.892292);


        int tinggi = 100;
        int lebar = 100;

        BitmapDrawable bitmapStart = (BitmapDrawable)getResources().getDrawable(R.drawable.marker_black);
        BitmapDrawable bitmapDes = (BitmapDrawable)getResources().getDrawable(R.drawable.marker_red);
        Bitmap s = bitmapStart.getBitmap();
        Bitmap d = bitmapDes.getBitmap();
        Bitmap markerStart = Bitmap.createScaledBitmap(s,lebar,tinggi,false);
        Bitmap markerDes = Bitmap.createScaledBitmap(d,lebar,tinggi,false);

        mMap.addMarker(new MarkerOptions().position(untad).title("Universitas Tadulako")
                .snippet("ini adalah kampus kami")
                .icon(BitmapDescriptorFactory.fromBitmap(markerStart)));
        mMap.addMarker(new MarkerOptions().position(vatulemo).title("Lapangan Vatulemo")
                .snippet("ini adalah lapangan vatulemo")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));
        mMap.addMarker(new MarkerOptions().position(sma5).title("SMA Negeri 5 Palu")
                .snippet("Ini adalah SMA Negeri 5 Palu")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));
        mMap.addMarker(new MarkerOptions().position(tokytoky).title("toky toky martadinata")
                .snippet("Ini adalah Rumah makan toky toky martadinata")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));
        mMap.addMarker(new MarkerOptions().position(hotelbrisky).title("hotel brisky")
                .snippet("Ini adalah hotel brisky")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));
        mMap.addMarker(new MarkerOptions().position(terminalmamboro).title("terminal mamboro")
                .snippet("Ini adalah terminal mamboro")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));
        mMap.addMarker(new MarkerOptions().position(poldasulteng).title("polda sulteng")
                .snippet("Ini adalah polda sulteng")
                .icon(BitmapDescriptorFactory.fromBitmap(markerDes)));

        mMap.addPolyline(new PolylineOptions().add(
                untad,
                new LatLng(-0.836341,119.892311),
                new LatLng(-0.836545,119.892279),
                new LatLng(-0.836384,119.889565),
                new LatLng(-0.836363,119.889340),
                new LatLng(-0.836282,119.889233),
                new LatLng(-0.836282,119.889233),
                new LatLng(-0.836204,119.883431),
                new LatLng(-0.836743,119.883487),
                new LatLng(-0.839093,119.883360),
                new LatLng(-0.841530,119.883290),
                new LatLng(-0.841571,119.884040),
                sma5
                ).width(10)
                        .color(Color.LTGRAY)
        );

        mMap.addPolyline(new PolylineOptions().add(
                untad,
                new LatLng(-0.836341,119.892311),
                new LatLng(-0.836545,119.892279),
                new LatLng(-0.836384,119.889565),
                new LatLng(-0.836383,119.88948),
                new LatLng(-0.843353, 119.89095),
                new LatLng(-0.846832, 119.89166),
                new LatLng(-0.850261, 119.89206),
                new LatLng(-0.851226, 119.89212),
                new LatLng(-0.864293, 119.88938),
                new LatLng(-0.870374, 119.88723),
                new LatLng(-0.870940, 119.88728),
                new LatLng(-0.871153, 119.88711),
                new LatLng(-0.873840, 119.88716),
                new LatLng(-0.875699, 119.88747),
                new LatLng(-0.878514, 119.88765),
                new LatLng(-0.880322, 119.88747),
                new LatLng(-0.881467, 119.88727),
                new LatLng(-0.885776, 119.88657),
                new LatLng(-0.887999, 119.88547),
                new LatLng(-0.888234, 119.88537),
                new LatLng(-0.897655, 119.88735),
                new LatLng(-0.900825, 119.88817),
                new LatLng(-0.900789, 119.88916),
                vatulemo
                ).width(10)
                        .color(Color.GRAY)
        );

        mMap.addPolyline(new PolylineOptions().add(
                untad,
                new LatLng(-0.836341,119.892311),
                new LatLng(-0.836545,119.892279),
                new LatLng(-0.836384,119.889565),
                new LatLng(-0.838389,119.889706),
                new LatLng(-0.838220,119.88556),
                new LatLng(-0.838094, 119.88339),
                new LatLng(-0.839762, 119.883310),
                tokytoky
                ).width(10)
                        .color(Color.YELLOW)
        );

        mMap.addPolyline(new PolylineOptions().add(
                untad,
                new LatLng(-0.836341,119.892311),
                new LatLng(-0.836545,119.892279),
                new LatLng(-0.836384,119.889565),
                new LatLng(-0.838389,119.889706),
                new LatLng(-0.838220,119.88556),
                new LatLng(-0.838094, 119.88339),
                new LatLng(-0.839762, 119.883310),
                new LatLng(-0.848487, 119.88258),
                new LatLng(-0.853480, 119.883575),
                new LatLng(-0.853336, 119.882263),
                hotelbrisky
                ).width(10)
                        .color(Color.YELLOW)
        );

        mMap.addPolyline(new PolylineOptions().add(
                untad,
                new LatLng(-0.836341,119.892311),
                new LatLng(-0.836545,119.892279),
                new LatLng(-0.836384,119.889565),
                new LatLng(-0.830307, 119.887748),
                new LatLng(-0.827082, 119.88470),
                new LatLng(-0.825228, 119.885678),
                new LatLng(-0.820810, 119.885463),
                new LatLng(-0.816061, 119.886224),
                new LatLng(-0.813536, 119.885424),
                new LatLng(-0.810861, 119.88332),
                new LatLng(-0.810722, 119.882397),
                new LatLng(-0.806871, 119.882819),
                new LatLng(-0.806897, 119.883657),
                new LatLng(-0.806452, 119.883752),
                new LatLng(-0.806211, 119.883740),
                new LatLng(-0.806205, 119.883670),
                terminalmamboro
                ).width(10)
                        .color(Color.BLUE)
        );

        mMap.addPolyline(new PolylineOptions().add(
                untad,
                new LatLng(-0.836341,119.892311),
                new LatLng(-0.836545,119.892279),
                new LatLng(-0.836384,119.889565),
                new LatLng(-0.836383,119.88948),
                new LatLng(-0.843353, 119.89095),
                new LatLng(-0.846832, 119.89166),
                new LatLng(-0.851131, 119.892063),
                new LatLng(-0.853261, 119.891901),
                new LatLng(-0.855426, 119.891484),
                new LatLng(-0.855657, 119.892440),
                new LatLng(-0.856250, 119.892319),
                poldasulteng
                ).width(10)
                        .color(Color.GRAY)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(untad, 11.5f));
    }
}

