package mx.incorporation.typhoon.loginpro;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario, txtContra;
    TextView lblMsj, text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario=(EditText) findViewById(R.id.idNombre);

        txtContra = (EditText) findViewById(R.id.idPass);

        lblMsj = (TextView) findViewById(R.id.MSJ);


    }

    public void entrar(View laVistaXML){

        String usr = "Leonardo";
        String contra = "12345";
        if(txtUsuario.getText().toString().equals("Leonardo") && txtContra.getText().toString().equals("12345") ){

            Intent miIntento = new Intent(this, inicio.class);

            miIntento.putExtra("nombreusr", usr);
            miIntento.putExtra("contraseña", contra);
            startActivity(miIntento);
        } else{


            String msj = "Usuario y/o contraseña incorrectos";
            lblMsj.setText(msj);

            /*

            TextView text = (TextView) laVistaXML.findViewById(R.id.text);
            text.setText("Usuario y/o contraseña incorrectos");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(laVistaXML);
            toast.show();*/

        }
    }
}
