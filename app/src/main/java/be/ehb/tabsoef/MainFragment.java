package be.ehb.tabsoef;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    public static MainFragment newInstance(){
        MainFragment fragment = new MainFragment();
        return fragment;

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        final EditText etTotal = rootView.findViewById(R.id.et_main_total);
        EditText etTip = rootView.findViewById(R.id.et_main_tip);
        final EditText etPerson = rootView.findViewById(R.id.et_main_persons);

        Button btnSplitBill = rootView.findViewById(R.id.btn_split_bill);

        final TextView tvResult = rootView.findViewById(R.id.tv_main_result);


        btnSplitBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String total = etTotal.getText().toString();
                String person = etPerson.getText().toString();

                float totalToFloat = Float.valueOf(total);
                float personToInt = Integer.valueOf(person);

                tvResult.setText("" + totalToFloat / personToInt);


            }
        });


        return rootView;

    }

}
