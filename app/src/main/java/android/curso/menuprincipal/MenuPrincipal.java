package android.curso.menuprincipal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MenuPrincipal extends AppCompatActivity {

    private Context context;

    private ImageView imgCarrito;
    private ImageView imgProductos;
    private ImageView imgHistorico;
    private ImageView imgBusqueda;
    private ImageView imgPromociones;
    private ImageView imgSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        context=this;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Vincular las variables con los iconos
        imgCarrito=(ImageView)findViewById(R.id.imgCarrito);
        imgProductos=(ImageView)findViewById(R.id.imgProductos);
        imgBusqueda=(ImageView)findViewById(R.id.imgBusqueda);
        imgHistorico=(ImageView)findViewById(R.id.imgHistorico);
        imgPromociones=(ImageView)findViewById(R.id.imgPromociones);
        imgSalir = (ImageView)findViewById(R.id.imgSalir);

        //Cargamos la imagen desde web URL
        Picasso.with(context).load("http://cdn.wallpapersafari.com/53/98/uThM63.jpg").into(imgCarrito);
        Picasso.with(context).load("http://eltornillodeklaus.com/wp-content/uploads/2014/12/eltornillodeklaus-interstellar-Christopher-nolan2.jpg").into(imgProductos);
        Picasso.with(context).load(R.drawable.assassins_creed).into(imgBusqueda);

        //Recibimos los datos
        Intent b=getIntent();
        String[] datos_recibidos=new String[2];
        datos_recibidos=b.getStringArrayExtra("datos_usuario");

        //Mostramos el mensaje de bienvenida en pantalla
        Toast.makeText(this,"Bienvenido "+datos_recibidos[0],Toast.LENGTH_SHORT).show();

        imgCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,CarritoActivity.class);
                startActivity(intent);
            }
        });

        imgProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ProductosActivity.class);
                startActivity(intent);
            }
        });

        imgPromociones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,PromocionesActivity.class);
                startActivity(intent);
            }
        });

        imgHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,HistoricoActivity.class);
                startActivity(intent);
            }
        });

        imgBusqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,BusquedaActivity.class);
                startActivity(intent);
            }
        });

        imgSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        /*
        Si entraste aca es porque tienes interÈs en realizar tu dashboard y crear tu carrito de compra.
                Tu tarea en este punto es:

        1. Darle funcionalidad a tu login, que realmente autentique, no permita campos en blanco, etc.
        2. Crear tu dashboard con los iconos que veas necesarios.
        3. Empezar a crear activities independientes, de manera conceptual con tal de mostrar que podrÌa
        ir en cada pantalla al presionar el boton en el dashboard.
        4. Conseguir algunos productos que ofrecer con sus respectivos precios.
        */

    }

}
