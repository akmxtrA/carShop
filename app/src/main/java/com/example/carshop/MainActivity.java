package com.example.carshop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<car> cars = new ArrayList<car>();
    ListView carsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        carsList = findViewById(R.id.carList);
        carAdapter adapter= new carAdapter(this, R.layout.list_item, cars);
        carsList.setAdapter(adapter);
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                car selectedcar = (car) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedcar.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        carsList.setOnItemClickListener(itemListener);

    }
    private void setInitialData(){

        cars.add(new car ("Toyota Camry", "Просторный салон Toyota Camry, позволяющий комфортно разместиться и водителю и " +
                "пассажирам, передовые технологии, мультимедийная система. Уверенность характеру Toyota Camry придают новые более мощные и одновременно экономичные двигатели. " +
                "Надежная 8-ступенчатая автоматическая коробка передач.", R.drawable.camry1));
        cars.add(new car ("Toyota Chaser", "Четырехдверный седан бизнес-класса Toyota Chaser производился на " +
                "заводах японского концерна \"Тойота\" в период с 1977 до 2001 года. Модель создана на платформе Toyota Mark II." +
                " Является преемницей Toyota Corona и предшественницей Toyota Crown.", R.drawable.chaser));
        cars.add(new car ("Mitsubishi Lancer", "Cедан C-класса, который имеет передний, полный приводы." +
                " Коробки передач у него механика, вариатор. Автомобиль комплектуется типом двигателя бензин мощностью от 148 до 168 л.с. Расход топлива на 100 км. составляет 7.8 л - 9.4 л." +
                " Разгон модели до 100 км/ч в диапазоне от 8.5 до 9.7 с.", R.drawable.lancer));
        cars.add(new car ("Lada Priora", "Самая надежная подруга с мотором. Приора имеет улучшенный салон, 16-клапанный двигатель, объемом 1596 куб. см., и 5-ступенчатую МКПП в." +
                " В смешанном режиме езды у Приоры на 100 км. уходит от 6,6 до 7,6 л. топлива за городом (в зависимости от комплектации), а в городе – 9,8 л." +
                " Новый двигатель позволяет разгоняться до 180 км/ч.", R.drawable.priora3));
        cars.add(new car ("Dodge Ram", "Для тех, кому уже нечего доказывать. Один из лучших американских пикапов с большой грузоподъемностью. " +
                "8-ступенчатая АКПП. До скорости 50-60 км/ч машина разгоняется очень быстро, но потом динамика пропадает. " +
                "Это обусловлено большим сопротивлением шин, которые имеют огромные размеры. В зависимости от комплектации устанавливаются агрегаты с объемом 3.7, 4.7 и 5.7 литров," +
                " имеющие мощность в 212, 314 и 396 лошадиных сил соответственно.", R.drawable.ram));
        cars.add(new car ("Nissan Skyline", "Nissan Skyline — автомобиль, выпускаемый в Японии с 1957 года, сначала фирмой Prince Motor Company, а затем концерном Nissan Motor, купившим Prince в 1966 году." +
                "Nissan Skyline ассоциируется у большинства с мощными моторами, что совершенно правильно. GT-R R34 агрегатируется двигателем мощностью 2,5 литра, который способен выдать до 280 л.с. 6-ступенчатая МКПП." +
                "Максимальная скорость Nissan Skyline GT-R R34 составляет 250 км/ч.", R.drawable.skyline));
        cars.add(new car ("Toyota Supra", "Toyota Supra - это легендарный гоночный автомобиль, который по праву занимает почетное место в истории автомобильной промышленности. " +
                "Двигатель был разработан в сотрудничестве с немецкой фирмой BMW . Он мог производить от 200 до 320 лошадиных сил.", R.drawable.supra1));

    }

}