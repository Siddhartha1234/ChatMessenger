package com.example.hp.chatmessenger;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hp on 2/24/2017.
 */
public class MySimpleArrayAdapter extends ArrayAdapter<Contacts> {
    private final Context context;
    private final List<Contacts> values;
    private ImageView contactImage;

    public MySimpleArrayAdapter(Context context, List<Contacts> values) {
        super(context, R.layout.contact_list, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.contact_list, parent, false);
        TextView Name = (TextView) rowView.findViewById(R.id.txtbox);
        TextView MobileNumber = (TextView) rowView.findViewById(R.id.mobileNumber);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.contactImage);
        Name.setText(values.get(position).name);
        Uri u =Uri.parse(values.get(position).photo_uri);
        if (u != null) {
            imageView.setImageURI(u);
        } else {
            imageView.setImageResource(R.drawable.ic_add_a_photo_black_24dp);
        }

        return rowView;
    }


}
