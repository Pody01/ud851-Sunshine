package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String mWeatherData[];

    public ForecastAdapter() {

    }

    public void setWeatherData(String weatherData[]) {
        this.mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ForecastAdapterViewHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.forecast_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String text = mWeatherData[position];
        holder.mWeatherTextView.setText(text);
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null) {
            return 0;
        } else {
            return mWeatherData.length;
        }
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

        public TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }


}
