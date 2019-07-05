package com.example.chapter_9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.chapter_9.dummy.DummyContent;
import com.example.chapter_9.dummy.DummyContent.DummyItem;

import java.util.List;



public class WorkoutListFragment extends ListFragment {
    static interface Listener{
        void onItemClick(long id);
    }
    Listener listener;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayAdapter<Workout> adapter = new ArrayAdapter<>(inflater.getContext(), android.R.layout.simple_list_item_1, Workout.workouts);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

   
   // public void onAttach(Context context) {
        //super.onAttach(context);
        //listener = (Listener) context;
   // }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
       // if(listener!= null){
           // listener.onItemClick(id);
        //}
        Intent intent = new Intent(getContext(),DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA, (int) id);
        startActivity(intent);
    }
}

    // TODO: Customize parameters
