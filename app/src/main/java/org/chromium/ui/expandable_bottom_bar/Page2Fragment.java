package org.chromium.ui.expandable_bottom_bar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.chromium.chrome.R;

/**
 * This class represents one page in the view pager used in {@link BottomSheetFragment}
 */
public class Page2Fragment extends Fragment {
    //TODO Fill this page with the desired items or remove it
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_page2, container, false);
    }

}
