package com.phanit.postfreeapp.models.response;

import com.google.gson.annotations.SerializedName;

public class Reactions{

	@SerializedName("dislikes")
	private int dislikes;

	@SerializedName("likes")
	private int likes;

	public void setDislikes(int dislikes){
		this.dislikes = dislikes;
	}

	public int getDislikes(){
		return dislikes;
	}

	public void setLikes(int likes){
		this.likes = likes;
	}

	public int getLikes(){
		return likes;
	}

	@Override
 	public String toString(){
		return 
			"Reactions{" + 
			"dislikes = '" + dislikes + '\'' + 
			",likes = '" + likes + '\'' + 
			"}";
		}
}