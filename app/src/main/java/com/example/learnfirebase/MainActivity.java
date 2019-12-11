//package com.example.learnfirebase;
//
//import android.os.Bundle;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class MainActivity extends AppCompatActivity {
//
//    private RecyclerView mrecyclerView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mrecyclerView = findViewById(R.id.recyclerView_books);
//        new FirebaseDatabaseHelper().readBooks(new FirebaseDatabaseHelper.DataStatus() {
//            @Override
//            public void dataIsLoad(List<Books> books, List<String> keys) {
//                new RecyclerView_Config().setConfig(mrecyclerView, MainActivity.this, books, keys);
//            }
//
//            @Override
//            public void dataIsUpdate() {
//
//            }
//
//            @Override
//            public void dataIsDeleted() {
//
//            }
//        });
//    }
//}
