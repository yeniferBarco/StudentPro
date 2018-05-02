package studentpro.upb.edu.co.studentpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonContinuar = (Button) findViewById(R.id.buttonContinuar);
        buttonContinuar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        lanzarActivity(v.getId());
    }

    public void lanzarActivity(int idView){

        Intent i;
        switch (idView){
            case R.id.buttonContinuar:
                i = new Intent(this, Home.class);
                startActivity(i);
                break;

            default:
                break;
        }
    }
}
