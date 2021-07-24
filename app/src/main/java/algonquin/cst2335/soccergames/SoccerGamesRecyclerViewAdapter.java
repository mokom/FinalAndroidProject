package algonquin.cst2335.soccergames;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SoccerGamesRecyclerViewAdapter extends RecyclerView.Adapter<SoccerGamesRecyclerViewAdapter.ViewHolder> {

    String data[];
    private Context context;

    public SoccerGamesRecyclerViewAdapter(Context context, String[] data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public SoccerGamesRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.soccer_games_recycler_view_item, parent, false);
        return new SoccerGamesRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SoccerGamesRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.textView.setText("Title1");
        holder.newsDetail.setText("Soccer News 1");
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, NewsDetailActivity.class);
                i.putExtra("Title", "Title1");
                i.putExtra("content", "News 1 Details");
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // this class helps fetch the views of custom views that we created
        TextView textView, newsDetail;
        ImageView imageView;
        Button buttonReadMore, buttonSave;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.soccerGameNewsTitle);
            newsDetail = itemView.findViewById(R.id.newsDetail);
            imageView = itemView.findViewById(R.id.imageViewSoccerNews);
            buttonReadMore = itemView.findViewById(R.id.readMoreButton);
            buttonSave = itemView.findViewById(R.id.saveButton);
        }
    }
}
