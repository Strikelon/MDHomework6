package com.strikalov.mdhomework6;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class ImageRecyclerViewAdapter extends RecyclerView.Adapter<ImageRecyclerViewAdapter.ImageHolder> {

    private List<Integer> imageNumbersList;

    public ImageRecyclerViewAdapter(List<Integer> imageNumbersLis){
        this.imageNumbersList = imageNumbersLis;
    }

    @Override
    public int getItemCount() {
        return imageNumbersList.size();
    }

    public class ImageHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;

        public ImageHolder(View view){
            super(view);

            imageView = view.findViewById(R.id.image_view);
        }

        public void bind(int position){

            Integer imageNumber = imageNumbersList.get(position);

            switch (imageNumber){
                case 1:
                    imageView.setImageResource(R.drawable.m1);
                    break;
                case 2:
                    imageView.setImageResource(R.drawable.m2);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.m3);
                    break;
                case 4:
                    imageView.setImageResource(R.drawable.m4);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.m5);
                    break;
                case 6:
                    imageView.setImageResource(R.drawable.m6);
                    break;
                default:
                    imageView.setImageDrawable(null);
                    break;
            }

        }

    }

    @NonNull
    @Override
    public ImageHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);

        return new ImageHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageHolder imageHolder, int i) {
        imageHolder.bind(i);
    }
}
