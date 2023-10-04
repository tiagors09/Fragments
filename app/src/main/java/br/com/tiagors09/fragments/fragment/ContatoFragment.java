package br.com.tiagors09.fragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.com.tiagors09.fragments.R;

public class ContatoFragment extends Fragment {
    private TextView textViewContato;
    public ContatoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contato, container, false);

        textViewContato = view.findViewById(R.id.textViewContato);
        textViewContato.setText("Contatos alterado");

        return view;
    }
}