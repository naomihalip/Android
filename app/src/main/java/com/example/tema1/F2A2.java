package com.example.tema1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class F2A2 extends Fragment {

    OnActivityFragmentCommunication onActivityFragmentCommunication;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);

        if(context instanceof OnActivityFragmentCommunication){
            onActivityFragmentCommunication = (OnActivityFragmentCommunication) context;
        }

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        onActivityFragmentCommunication = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.f1a2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button replaceMe = view.findViewById(R.id.button3);
        replaceMe.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                replaceFragment();
            }
        });

        Button deleteFragment = view.findViewById(R.id.button4);
        deleteFragment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                deleteOneFragment();
            }
        });

        Button stopActivity = view.findViewById(R.id.button3);
        stopActivity.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                stopActivity();
                stopActivitySecondWay();
            }
        });
    }

    void stopActivity(){
        if(getActivity() == null){
            return;
        }
        getActivity().finish();
    }

    void stopActivitySecondWay(){
        if(onActivityFragmentCommunication == null){
            return;
        }

        onActivityFragmentCommunication.killYourself();
    }

    void replaceFragment(){
        if(onActivityFragmentCommunication == null){
            return;
        }

        //onActivityFragmentCommunication.onReplaceFragment();
        //trenuie terminata
    }

    void deleteOneFragment(){
        //trebuie completat
    }
}
