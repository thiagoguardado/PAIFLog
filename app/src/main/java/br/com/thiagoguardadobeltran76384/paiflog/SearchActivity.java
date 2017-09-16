package br.com.thiagoguardadobeltran76384.paiflog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity {

    private EditText etCEP;
    private TextView tvTipoDeLogradouro;
    private TextView tvLogradouro;
    private TextView tvBairro;
    private TextView tvCidade;
    private TextView tvEstado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        etCEP = (EditText) findViewById(R.id.etCEP);
        tvTipoDeLogradouro = (TextView)findViewById(R.id.tvTipoDeLogradouro);
        tvLogradouro = (TextView)findViewById(R.id.tvLogradouro);
        tvBairro = (TextView)findViewById(R.id.tvBairro);
        tvCidade = (TextView)findViewById(R.id.tvCidade);
        tvEstado = (TextView)findViewById(R.id.tvEstado);

    }

    public void pesquisar(View v){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://correiosapi.apphb.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        CEPService service = retrofit.create(CEPService.class);

        service.buscarCEP(etCEP.getText().toString())
                .enqueue(new Callback<CEP>() {
                    @Override
                    public void onResponse(Call<CEP> call, Response<CEP> response) {
                        tvTipoDeLogradouro.setText(response.body().getTipoDeLogradouro());
                        tvLogradouro.setText(response.body().getLogradouro());
                        tvBairro.setText(response.body().getBairro());
                        tvCidade.setText(response.body().getCidade());
                        tvEstado.setText(response.body().getEstado());

                    }

                    @Override
                    public void onFailure(Call<CEP> call, Throwable t) {
                        Toast.makeText(SearchActivity.this,
                                "Não foi possível localizar",
                                Toast.LENGTH_SHORT).show();

                    }
                });

    }
}
