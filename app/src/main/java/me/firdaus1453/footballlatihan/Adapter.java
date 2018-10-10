package me.firdaus1453.footballlatihan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    int[] gambarClub;
    String[] nama,detailclub;

    public Adapter(Context context, int[] gambarClub, String[] nama, String[] detailclub) {
        this.context = context;
        this.gambarClub = gambarClub;
        this.nama = nama;
        this.detailclub = detailclub;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_club, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, final int position) {
        holder.txtNama.setText(nama[position]);
        holder.imgLogo.setImageResource(gambarClub[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailClubActivity.class);
                intent.putExtra("nb", nama[position]);
                intent.putExtra("gb", gambarClub[position]);
                intent.putExtra("dt", detailclub[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarClub.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView txtNama;
        public ViewHolder(View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgList);
            txtNama = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
