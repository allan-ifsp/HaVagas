package br.edu.ifsp.scl.ads.pdm.allan.havagas;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import br.edu.ifsp.scl.ads.pdm.allan.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        amb.limparBt.setOnClickListener((View view) -> {
            limparView();
            Toast.makeText(this, "Limpando...", Toast.LENGTH_SHORT).show();
        });

        amb.salvarBt.setOnClickListener( view-> {
            Usuario usuario = salvarUsuario();

            Snackbar.make(amb.getRoot(), usuario.toString(), 6000).show();

            System.out.println(usuario);
            Toast.makeText(this, "Salvando...", Toast.LENGTH_LONG).show();
        });

        amb.celularCb.setOnCheckedChangeListener((CompoundButton buttonView, boolean isChecked) ->{
            if (amb.celularCb.isChecked()){
                amb.celularEt.setVisibility(View.VISIBLE);
            }
            else {
                amb.celularEt.setVisibility(View.GONE);
            }
        });
    }

    public void limparView(){
        amb.nomeEt.setText("");
        amb.emailEt.setText("");
        amb.emailCb.setChecked(false);
        amb.telefoneEt.setText("");
        amb.comercialRb.setChecked(true);
        amb.celularCb.setChecked(false);
        amb.celularEt.setText("");
        amb.femininoRb.setChecked(true);
        amb.dataNascimentoEt.setText("");
        amb.fundamentalEt.setText("");
        amb.medioEt.setText("");
        amb.conclusaoGraduacaoEt.setText("");
        amb.instituicaoGraduacao.setText("");
        amb.conclusaoEspecializacao.setText("");
        amb.instituicaoEspecializacao.setText("");
        amb.conclusaoMestrado.setText("");
        amb.instituicaoMestrado.setText("");
        amb.tituloMonografiaMestradoEt.setText("");
        amb.orientadorMestradoEt.setText("");
        amb.conclusaoDoutorado.setText("");
        amb.instituicaoDoutorado.setText("");
        amb.tituloMonografiaDoutoradoEt.setText("");
        amb.orientadorDoutoradoEt.setText("");
        amb.vagasInteresseEt.setText("");
    }

    public Usuario salvarUsuario(){
        Pessoa pessoa = salvarPessoa();
        Formacao fundamental = salvarFundamental();
        Formacao medio = salvarMedio();
        Formacao graduacao = salvarGraduacao();
        Formacao especializacao = salvarEspecializacao();
        Formacao mestrado = salvarMestrado();
        Formacao doutorado = salvarDoutorado();

        Usuario usuario = new Usuario();
        usuario.setPessoa(pessoa);
        usuario.setFundamental(fundamental);
        usuario.setMedio(medio);
        usuario.setGraduacao(graduacao);
        usuario.setEspecializacao(especializacao);
        usuario.setMestrado(mestrado);
        usuario.setDoutorado(doutorado);

        return usuario;
    }

    public Pessoa salvarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(amb.nomeEt.getText().toString());
        pessoa.setEmail(amb.emailEt.getText().toString());
        pessoa.setTelefone(amb.telefoneEt.getText().toString());
        pessoa.setCelular(amb.celularEt.getText().toString());
        pessoa.setSexo(amb.femininoRb.isChecked()? getString(R.string.feminino) : getString(R.string.masculino));
        pessoa.setDataNascimento(amb.dataNascimentoEt.getText().toString());

        return pessoa;
    }

    public Formacao salvarFundamental(){
        Formacao fundamental = new Formacao();
        fundamental.setAnoDeConclusao(amb.fundamentalEt.getText().toString());

        return fundamental;
    }

    public Formacao salvarMedio(){
        Formacao medio = new Formacao();
        medio.setAnoDeConclusao(amb.medioEt.getText().toString());

        return medio;
    }

    public Formacao salvarGraduacao(){
        Formacao graduacao = new Formacao();
        graduacao.setAnoDeConclusao(amb.conclusaoGraduacaoEt.getText().toString());
        graduacao.setInstituicao(amb.instituicaoGraduacao.getText().toString());

        return graduacao;
    }

    public Formacao salvarEspecializacao(){
        Formacao especializacao = new Formacao();
        especializacao.setAnoDeConclusao(amb.conclusaoEspecializacao.getText().toString());
        especializacao.setInstituicao(amb.instituicaoEspecializacao.getText().toString());

        return especializacao;
    }

    public Formacao salvarMestrado(){
        Formacao mestrado = new Formacao();
        mestrado.setAnoDeConclusao(amb.conclusaoDoutorado.getText().toString());
        mestrado.setInstituicao(amb.instituicaoMestrado.getText().toString());
        mestrado.setTituloMonografia(amb.tituloMonografiaMestradoEt.getText().toString());
        mestrado.setNomeOrientador(amb.orientadorMestradoEt.getText().toString());

        return mestrado;
    }

    public Formacao salvarDoutorado(){
        Formacao doutorado = new Formacao();
        doutorado.setAnoDeConclusao(amb.conclusaoDoutorado.getText().toString());
        doutorado.setInstituicao(amb.instituicaoDoutorado.getText().toString());
        doutorado.setTituloMonografia(amb.tituloMonografiaDoutoradoEt.getText().toString());
        doutorado.setNomeOrientador(amb.orientadorDoutoradoEt.getText().toString());

        return doutorado;
    }


}