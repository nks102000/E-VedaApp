package pradyumna.simhansapp.prabandham;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import pradyumna.simhansapp.R;
import pradyumna.simhansapp.adapters.LvAdapter;

public class Prabandham extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prabandham);

        recyclerView=findViewById(R.id.lvrecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        LvAdapter adapter= new LvAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}