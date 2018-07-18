package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MathList> mathList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        mathList = objects;


    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater
                = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewFormula);
        TextView tvArea = rowView.findViewById(R.id.textViewType);

        MathList currentItem = mathList.get(position);

        tvName.setText(currentItem.getName());
        tvDate.setText(currentItem.getFormula());
        tvArea.setText(currentItem.getCode());

        return rowView;
    }




}
