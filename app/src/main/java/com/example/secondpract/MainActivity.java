package com.example.secondpract;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recycler_view;
    private List<Flowers> states;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);
        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        states = new ArrayList<>();
        states.add(new Flowers ("Розы", "красные", R.drawable.ros,"Роза – это листопадный кустарник. Относится к семейству розовых. Старые ветки и молодые побеги покрыты колючками. Высота кустарника колеблется от 1 до 5 метров. Листья темно-зеленые, непарноперистые, округлой формы. Цветки обычно розового или бледно-розового цвета, от 4 до 6 см в диаметре. Цветение кустарника происходит с июня до начало августа."));
        states.add(new Flowers ("Маки", "красные", R.drawable.mak,"Мак — источник антиоксидантов и иммуномодуляторов, помогающих защищать организм от воздействия вредных веществ и инфекций. Вкусные и питательные семена восстанавливают нервную систему, улучшают настроение, справляются с бессонницей, наделены противовоспалительным и болеутоляющим эффектом."));
        states.add(new Flowers ("Одуванчики", "белые", R.drawable.odu,"Одуванчик — род многолетних трав семейства сложноцветных.\n" +
                "\n" +
                "Во всех частях одуванчика содержится млечный сок. Корень стержневой, мясистый, длиной 20–60 см. Листья собраны в прикорневую розетку. Цветоносы безлистные, несут одиночные, реже разветвлённые корзинки. Цветки жёлтые, белые или розовые, язычковые."));
        states.add(new Flowers ("Васильки", "синии", R.drawable.vus,"Василёк — род травянистых растений семейства Астровые, или Сложноцветные (Asteraceae).\n" +
                "\n" +
                "Василёк — однолетнее или двулетнее растение с прямым стеблем высотой до 50–80 см. Цветы собраны в корзинку. Бывают белые, голубые, жёлтые, розовые, фиолетовые, синие, красные и бордовые. Цветёт василёк с июня и до поздней осени."));
        states.add(new Flowers ("Пионы", "розовые", R.drawable.pi,"Они относятся к многолетним травянистым растениям, стебли которых достигают до метра в длину. Листья сизые или темно-зеленые, крупные. Крупные одиночные цветки достигают до 25 см. в диаметре и имеют приятный, утонченный аромат. Надземная часть у пионов отмирает, а подземное многолетнее корневище остается дальше развиваться. Почки образуются на корневищах и очень рано весной трогаются в рост. Цветение наблюдается с конца мая и до середины июля."));
        RecycleAddapter adapter = new RecycleAddapter(this, states);
        recycler_view.setAdapter(adapter);

    }

}