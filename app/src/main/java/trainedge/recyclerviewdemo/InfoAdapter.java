package trainedge.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by hp on 08-04-2017.
 */

public class InfoAdapter extends RecyclerView.Adapter<InfoHolder> {

    List<InfoModel> InfoList;

    public InfoAdapter(List<InfoModel> infoList) {
        InfoList = infoList;
    }

    @Override
    public InfoHolder onCreateViewHolder(ViewGroup parent, int viewType) // what to design for a single item
    {
        View row = ((LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.simple_item_view, parent, false);//same for all code
        return new InfoHolder(row);

    }

    @Override
    public void onBindViewHolder(final InfoHolder holder, int position)
    {
        //databinding
        final InfoModel infoModel = InfoList.get(position);
        holder.tv.setText(infoModel.label);
        Picasso.with(holder.iv.getContext()).load(infoModel.imageId).into(holder.iv);
        holder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.iv.getContext(),infoModel.label, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount()// how many item there will be
    {
        return InfoList.size();
    }
}
