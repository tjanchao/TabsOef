package be.ehb.tabsoef;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Q on 20-2-2018.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        MainFragment mainFragment = new MainFragment();
        AboutFragment aboutFragment = new AboutFragment();

        switch (position) {
            case 0: return mainFragment;
            case 1: return aboutFragment;
        }
        return mainFragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0: return "Split Bill";
            case 1: return "About";

        }
        return "tab is er niet";
    }
}
