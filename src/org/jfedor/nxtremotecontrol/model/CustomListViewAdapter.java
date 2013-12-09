package org.jfedor.nxtremotecontrol.model;
import java.util.List;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class CustomListViewAdapter extends ArrayAdapter<NXTInstruction> {
 
    Context context;
    public int idComando;
 
    public CustomListViewAdapter(Context context, int resourceId,
            List<NXTInstruction> items, int _idComando) {
        super(context, resourceId, items);
        this.context = context;
        idComando = _idComando;
    }
 
    
   
    
    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        TextView txtTitle;
        TextView txtDesc;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        NXTInstruction rowItem = getItem(position);
 
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(org.jfedor.nxtremotecontrol.R.layout.list_item, null);
            holder = new ViewHolder();
            holder.txtDesc = (TextView) convertView.findViewById(org.jfedor.nxtremotecontrol.R.id.desc);
            holder.imageView = (ImageView) convertView.findViewById(org.jfedor.nxtremotecontrol.R.id.icon);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();
 
        holder.txtDesc.setText(rowItem.nombre);
        holder.imageView.setImageResource(rowItem.idImagen);
        
        return convertView;
    }
}