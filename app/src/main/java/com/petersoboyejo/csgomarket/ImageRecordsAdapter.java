package com.petersoboyejo.csgomarket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.List;

public class ImageRecordsAdapter extends ArrayAdapter<ImageRecord> {
    private ImageLoader mImageLoader;


    public ImageRecordsAdapter(Context context) {
        super(context, R.layout.image_list_item);

        mImageLoader = new ImageLoader(VolleyApplication.getInstance().getRequestQueue(), new BitmapLruCache());


    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.image_list_item, parent, false);
        }

        // NOTE: You would normally use the ViewHolder pattern here
        // Pt 1
        NetworkImageView imageView = (NetworkImageView) convertView.findViewById(R.id.image1);
        TextView textViewItemName = (TextView) convertView.findViewById(R.id.itemName);


        TextView textItemPrice = (TextView) convertView.findViewById(R.id.itemPrice);
        TextView textViewSubOne = (TextView) convertView.findViewById(R.id.subOne);
        TextView textViewSubTwo = (TextView) convertView.findViewById(R.id.subTwo);
        TextView textViewItemCase = (TextView) convertView.findViewById(R.id.itemCase);



        ImageRecord imageRecord = getItem(position);

        // Pt 2
        imageView.setImageUrl(imageRecord.getItemImage(), mImageLoader);
        textViewItemName.setText(imageRecord.getItemName());

        textItemPrice.setText(imageRecord.getItemPrice());

        textViewSubOne.setText(imageRecord.getSubOne());
        textViewSubTwo.setText(imageRecord.getSubTwo());
        textViewItemCase.setText(imageRecord.getItemCase());

        return convertView;
    }

    public void swapImageRecords(List<ImageRecord> objects) {
        clear();

        for(ImageRecord object : objects) {
            add(object);
        }

        notifyDataSetChanged();
    }
}
