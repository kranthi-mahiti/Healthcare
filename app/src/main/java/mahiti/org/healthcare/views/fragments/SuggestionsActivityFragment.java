package mahiti.org.healthcare.views.fragments;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mahiti.org.healthcare.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class SuggestionsActivityFragment extends Fragment {

    public SuggestionsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_suggestions, container, false);
    }
}
