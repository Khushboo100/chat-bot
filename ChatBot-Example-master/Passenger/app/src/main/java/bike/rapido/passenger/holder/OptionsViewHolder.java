package bike.rapido.passenger.holder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import bike.rapido.passenger.R;

public class OptionsViewHolder extends RecyclerView.ViewHolder {

    public TextView tvOption;
    public CardView cvOption;

    public OptionsViewHolder(View itemView) {
        super(itemView);
        tvOption = (TextView) itemView.findViewById(R.id.tvOption);
        cvOption = (CardView) itemView.findViewById(R.id.cvOption);
    }
}

