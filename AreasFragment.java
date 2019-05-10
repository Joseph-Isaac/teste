package br.ufc.loadingjr.guiacomp.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.ufc.loadingjr.guiacomp.R;
import br.ufc.loadingjr.guiacomp.adapter.AdapterAbasAreas;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreasFragment extends Fragment {


    public AreasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        AdapterAbasAreas adapter = new AdapterAbasAreas( getActivity().getSupportFragmentManager() );
        adapter.adicionar( new AreasAutomacaoFragment() , "AUTOMAÇAO E CONTROLE");
        adapter.adicionar( new AreasCienciaFragment(), "CIENCIA DA COMUTAÇAO");
        adapter.adicionar( new AreasTelecomFragment(), "TELECOMUNICAÇOES");

        ViewPager viewPager = (ViewPager) getView().findViewById(R.id.abas_view_pager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) getView().findViewById(R.id.abas);
        tabLayout.setupWithViewPager(viewPager);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_areas, container, false);
    }

}
