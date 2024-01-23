package com.example.carshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class carAdapter extends ArrayAdapter<car> {

    private LayoutInflater inflater;
    private int layout;
    private List<car> cars;

    public carAdapter(Context context, int resource, List<car> cars) {
        super(context, resource, cars);
        this.cars = cars;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.car);
        TextView nameView = view.findViewById(R.id.name);
        TextView capitalView = view.findViewById(R.id.description);
        TextView countView = view.findViewById(R.id.countView);
        Button removeButton = view.findViewById(R.id.removeButton);
        Button addButton = view.findViewById(R.id.addButton);
        car Car = cars.get(position);

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Car.getCount()-1;
                if(count<0) count=0;
                Car.setCount(count);
                countView.setText(count + " шт");
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Car.getCount()+1;
                Car.setCount(count);
                countView.setText(count + " шт");
            }
        });


        flagView.setImageResource(Car.getCarImage());
        nameView.setText(Car.getName());
        capitalView.setText(Car.getDescription());

        return view;
    }
}