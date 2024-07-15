package com.phanit.postfreeapp.models.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PostResponse{

	@SerializedName("total")
	private int total;

	@SerializedName("limit")
	private int limit;

	@SerializedName("skip")
	private int skip;

	@SerializedName("posts")
	private List<PostsItem> posts;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setLimit(int limit){
		this.limit = limit;
	}

	public int getLimit(){
		return limit;
	}

	public void setSkip(int skip){
		this.skip = skip;
	}

	public int getSkip(){
		return skip;
	}

	public void setPosts(List<PostsItem> posts){
		this.posts = posts;
	}

	public List<PostsItem> getPosts(){
		return posts;
	}

	@Override
 	public String toString(){
		return 
			"PostResponse{" + 
			"total = '" + total + '\'' + 
			",limit = '" + limit + '\'' + 
			",skip = '" + skip + '\'' + 
			",posts = '" + posts + '\'' + 
			"}";
		}
}