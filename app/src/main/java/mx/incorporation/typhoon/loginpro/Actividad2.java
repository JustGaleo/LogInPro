package mx.incorporation.typhoon.loginpro;


import android.app.Activity;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.AppIndex;

import com.google.android.gms.common.api.GoogleApiClient;



public class Actividad2 extends Activity {

    String nombre = "", fecha = "", hora = "";
    int personas = 0;
    TextView muestraDatos;
    EditText usr, tel, eda, corr;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");

        muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + personas
                + " personas\nFecha: " + fecha + "\nHora: " + hora + "\n");

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void hacerOtraReserva(View v) {
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }

    public void PAGINAWEB(View paginaWeb) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.restauranteelcardenal.com/"));
        startActivity(intent);
    }
/*
    public void MARCAR(View llamada) {
        Intent intento = new Intent(Intent.ACTION_CALL, Uri.parse("tel:5545872673"));
        startActivity(intento);

    }*/

    public void MAPS(View maps) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:19.434662, -99.146463"));
        startActivity(intent);
    }


    public void ENVIAR(View correo) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "RESERVACIÓN");
        intent.putExtra(Intent.EXTRA_TEXT, "Reservacion a nombre de: " + nombre + "\n" + personas
                + " personas\nFecha: " + fecha + "\nHora: " + hora + "\n");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"leonardogarciamartinez@gmail.com"});
        startActivity(intent);
    }




}

