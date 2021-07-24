package algonquin.cst2335.soccergames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryRecyclerViewAdapter extends RecyclerView.Adapter<CategoryRecyclerViewAdapter.ViewHolder> {

    String data [];
    private Context context;

    public CategoryRecyclerViewAdapter(Context context, String[] data) {
        this.data = data;
        this.context = context;
    }

    @Override
    public CategoryRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_recycler_view_item, parent, false);
        return new CategoryRecyclerViewAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CategoryRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.textView.setText(data[position]);
        holder.textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "I have clicked on category " + data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // this class helps fetch the views of custom views that we created
        TextView textView;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewCategory);
            imageView = itemView.findViewById(R.id.imageViewCategory);
        }
    }
}
