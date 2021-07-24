package algonquin.cst2335.soccergames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewCategory, recyclerViewNews;
    CategoryRecyclerViewAdapter categoryRecyclerViewAdapter;
    SoccerGamesRecyclerViewAdapter soccerGamesRecyclerViewAdapter;

    String categories[] = {"Euro 2020", "World Cup 2022", "Tokyo 2021"};
    String news[] = {"News 1", "News 2", "News 3", "News 4", "News 5", "News 6"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory = findViewById(R.id.categoryRecyclerView);
        recyclerViewCategory.setLayoutManager(new LinearLayoutManager(this));
        categoryRecyclerViewAdapter = new CategoryRecyclerViewAdapter(this, categories);
        recyclerViewCategory.setAdapter(categoryRecyclerViewAdapter);

        recyclerViewNews = findViewById(R.id.soccerGameRecyclerView);
        recyclerViewNews.setLayoutManager(new LinearLayoutManager(this));
        soccerGamesRecyclerViewAdapter = new SoccerGamesRecyclerViewAdapter(this, news);
        recyclerViewNews.setAdapter(soccerGamesRecyclerViewAdapter);
    }
}