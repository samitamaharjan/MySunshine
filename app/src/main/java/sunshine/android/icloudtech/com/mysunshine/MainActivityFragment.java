package sunshine.android.icloudtech.com.mysunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> arrayAdapter = null;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<String> weekForecast = new ArrayList<>();
        weekForecast.add("Today - Sunny - 80 / 83");
        weekForecast.add("Tomorrow - Foggy - 70 / 46");
        weekForecast.add("Wednesday - Cloudy - 72 / 63");
        weekForecast.add("Thursday - Rainy - 64 / 51");
        weekForecast.add("Friday - Foggy - 70 / 46");
        weekForecast.add("Saturday - Sunny - 76 / 68");

        arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
