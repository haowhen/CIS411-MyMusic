package com.wesleyreisz.mymusic;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.wesleyreisz.mymusic.model.Song;
import com.wesleyreisz.mymusic.service.MockMusicService;

import java.util.List;

/**
 * Created by Hao on 10/19/2014.
 */
public class MyMusicFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.fragment, container, false);
	}
	@Override
	public void onStart() {
		super.onStart();

	}


}
