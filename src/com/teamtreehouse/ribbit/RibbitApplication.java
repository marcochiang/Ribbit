package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "kokejXOTl5twZJytw5EfCi4I7hVEpSMLDKOF7kt6", "BFrpHhWzplg5obPkDNXpUWCSXuXfdnLls3vY6RsY");
	}
}
