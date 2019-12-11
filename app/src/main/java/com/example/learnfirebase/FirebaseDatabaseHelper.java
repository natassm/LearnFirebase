//package com.example.learnfirebase;
//
//import androidx.annotation.NonNull;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FirebaseDatabaseHelper {
//
//    private DatabaseReference mReferenceBooks;
//    private FirebaseDatabase mDatabase;
//    private List<Books> books = new ArrayList<>();
//
//    public interface DataStatus{
//        void dataIsLoad(List<Books> books,List<String> keys);
//        void dataIsUpdate();
//        void dataIsDeleted();
//    }
//
//    public FirebaseDatabaseHelper() {
//        mDatabase = FirebaseDatabase.getInstance();
//        mReferenceBooks = mDatabase.getReference("books");
//    }
//
//    public void readBooks(final DataStatus dataStatus){
//        mReferenceBooks.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                books.clear();
//                List<String> keys = new ArrayList<>();
//                for (DataSnapshot keyNode:dataSnapshot.getChildren()){
//                    keys.add(keyNode.getKey());
//                    Books book = keyNode.getValue(Books.class);
//                    books.add(book);
//                }
//
//                dataStatus.dataIsLoad(books.keys);
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//    }
//}
