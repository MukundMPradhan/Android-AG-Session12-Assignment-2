package acadgild.assignment.session12_assignment_2.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import acadgild.assignment.session12_assignment_2.MessagePasser;
import acadgild.assignment.session12_assignment_2.R;

/**
 * Created by mukund on 21/5/16.
 */
public class SimpleAddition extends Fragment {
    EditText display;
    MessagePasser messagePasser;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_simple_addition, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        display = (EditText) getActivity().findViewById(R.id.etDisplay);

    }

    public void setMessage(String message) {
        display.setText(message);
    }

}
