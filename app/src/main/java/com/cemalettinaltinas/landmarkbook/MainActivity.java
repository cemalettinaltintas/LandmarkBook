package com.cemalettinaltinas.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.cemalettinaltinas.landmarkbook.databinding.ActivityDetailsBinding;
import com.cemalettinaltinas.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> lanmarkArrayList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Data - Veriler
        Landmark pisa=new Landmark("Pisa","Italy",R.drawable.pisa);
        Landmark eiffel=new Landmark("Eiffel","France",R.drawable.eiffel);
        Landmark colosseum=new Landmark("Colossseum","Italy",R.drawable.colloseum);
        Landmark londonBridge=new Landmark("London Bridge","UK",R.drawable.london);

        lanmarkArrayList=new ArrayList<>();

        lanmarkArrayList.add(pisa);
        lanmarkArrayList.add(eiffel);
        lanmarkArrayList.add(colosseum);
        lanmarkArrayList.add(londonBridge);

        /*

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                lanmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));

        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",lanmarkArrayList.get(position));
                startActivity(intent);
            }
        });
        */
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LanmarkAdapter lanmarkAdapter=new LanmarkAdapter(lanmarkArrayList);
        binding.recyclerView.setAdapter(lanmarkAdapter);
    }

}