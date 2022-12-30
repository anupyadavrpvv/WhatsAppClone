package com.neatroots.whatsapp.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.neatroots.whatsapp.fragments.CallsFragment;
import com.neatroots.whatsapp.fragments.ChatFragment;
import com.neatroots.whatsapp.fragments.StatusFragment;

public class FragmentAdapters extends FragmentPagerAdapter {
    public FragmentAdapters(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ChatFragment();
            case 1: return new StatusFragment();
            case 2: return new CallsFragment();
            default: return new ChatFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0){
            title = "CHATS";
        }else if (position == 1){
            title = "STATUS";
        }else if (position == 2){
            title = "CALLS";
        }
        return title;
    }
}
