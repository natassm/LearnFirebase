//package com.example.learnfirebase;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class RecyclerView_Config {
//
//    private Context mContext;
//    private BooksAdapter mBooksAdapter;
//
//    public void setConfig(RecyclerView recyclerView, Context context, List<Books> books, List<String> keys) {
//        mContext = context;
//        mBooksAdapter = new BooksAdapter(books, keys);
//        recyclerView.setLayoutManager(new LinearLayoutManager(context));
//        recyclerView.setAdapter(mBooksAdapter);
//    }
//
//    class BookItemView extends RecyclerView.ViewHolder {
//        private TextView mTitle, mAuthor, mISBN, mCategory;
//
//        private String key;
//
//        public BookItemView(ViewGroup parent) {
//            super(LayoutInflater.from(mContext).inflate(R.layout.books_list_item, parent, false));
//
//            mTitle = itemView.findViewById(R.id.title_txtview);
//            mAuthor = itemView.findViewById(R.id.author_textView);
//            mISBN = itemView.findViewById(R.id.isbn_textView);
//            mCategory = itemView.findViewById(R.id.category_textView);
//
//        }
//
//        public void bind(Books books, String key) {
//            mTitle.setText(books.getTitle());
//            mAuthor.setText(books.getAuthor());
//            mISBN.setText(books.getIsbn());
//            mCategory.setText(books.getCategory_name());
//            this.key = key;
//        }
//    }
//
//    class BooksAdapter extends RecyclerView.Adapter<BookItemView>
//    {
//        private List<Books> mBookLIst;
//        private List<String> mKeys;
//
//        @NonNull
//        @Override
//        public BookItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType)   {
//            return new BookItemView(parent);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull BookItemView holder, int position) {
//            holder.bind(mBookLIst.get(position),mKeys.get(position));
//        }
//
//        @Override
//        public int getItemCount() {
//            return mBookLIst.size();
//        }
//
//        public BooksAdapter(List<Books> mBookLIst, List<String> mKeys) {
//            this.mBookLIst = mBookLIst;
//            this.mKeys = mKeys;
//        }
//    }
//
//}
//
//
