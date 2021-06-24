package com.pratiked.capstone.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pratiked.capstone.R;
import com.pratiked.capstone.model.Movie;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Movie> movieList;

    public MoviesAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((MovieViewHolder) holder).setOriginalTitle(movieList.get(position).getOriginalTitle());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder{

        private TextView txtOriginalTitle;
        private TextView txtDesc;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            txtOriginalTitle = itemView.findViewById(R.id.txt_original_title);
            txtDesc = itemView.findViewById(R.id.txt_desc);
        }

        public void setOriginalTitle(String originalTitle){
            if (originalTitle != null){
                txtOriginalTitle.setText(originalTitle);
            }
        }

        public void setMovieDesc(String desc){
            if (desc != null){
                txtDesc.setText(desc);
            }
        }
    }
}
