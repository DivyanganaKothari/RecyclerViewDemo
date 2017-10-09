package trainedge.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by hp on 02-04-2017.
 */

public class InfoHolder extends RecyclerView.ViewHolder {

   RelativeLayout rlContainer;
    ImageView iv;
    TextView tv;
    public InfoHolder(View itemView) {
        super(itemView);
        rlContainer= (RelativeLayout) itemView.findViewById(R.id.rlContainer);
        iv= (ImageView) itemView.findViewById(R.id.iv);
        tv= (TextView) itemView.findViewById(R.id.tv);
    }
}
