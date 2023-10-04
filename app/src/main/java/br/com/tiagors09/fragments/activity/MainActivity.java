package br.com.tiagors09.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.tiagors09.fragments.R;
import br.com.tiagors09.fragments.fragment.ContatoFragment;
import br.com.tiagors09.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {
    private Button buttonConversas, buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatoFragment contatoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContatos = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);

        conversasFragment = new ConversasFragment();
        contatoFragment = new ContatoFragment();



        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Gerenciador de fragments - realiza transações
                FragmentTransaction transaction = getSupportFragmentManager()
                        .beginTransaction();

                // Realiza a transação
                transaction.replace(R.id.frameConteudo, contatoFragment);

                // Faz o commit
                transaction.commit();
            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager()
                        .beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });
    }
}