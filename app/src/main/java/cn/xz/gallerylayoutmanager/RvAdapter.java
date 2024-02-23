package cn.xz.gallerylayoutmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ChatViewHolder> {

    private ArrayList<String> mList = new ArrayList<>();

    public void setList(ArrayList<String> mList) {
        this.mList = mList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_list, parent, false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        String mData = mList.get(position);
        holder.tvTxt.setText(mData);
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0:mList.size();
    }

    static class ChatViewHolder extends RecyclerView.ViewHolder{

        private final TextView tvTxt;

        public ChatViewHolder(View itemView) {
            super(itemView);
            tvTxt = (TextView) itemView.findViewById(R.id.tv_txt);
        }
    }
}
