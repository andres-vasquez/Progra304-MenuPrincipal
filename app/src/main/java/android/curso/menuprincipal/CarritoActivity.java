package android.curso.menuprincipal;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

public class CarritoActivity extends AppCompatActivity {


    private Context context;

    private RelativeLayout rlFondo;
    private ImageView imgAgrandada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito);

        context=this;

        rlFondo=(RelativeLayout)findViewById(R.id.rlFondo);
        imgAgrandada=(ImageView)findViewById(R.id.imgAgrandada);

        //Imagen de fondo
        rlFondo.setBackgroundResource(R.drawable.reloj);

        //Imagen principal
        Picasso.with(context).load("http://cdn.wallpapersafari.com/53/98/uThM63.jpg").into(imgAgrandada);
    }
}
