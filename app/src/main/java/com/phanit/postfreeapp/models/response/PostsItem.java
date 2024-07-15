package com.phanit.postfreeapp.models.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PostsItem{

	@SerializedName("reactions")
	private Reactions reactions;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("body")
	private String body;

	@SerializedName("userId")
	private int userId;

	@SerializedName("views")
	private int views;

	@SerializedName("tags")
	private List<String> tags;

	public void setReactions(Reactions reactions){
		this.reactions = reactions;
	}

	public Reactions getReactions(){
		return reactions;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getBody(){
		return body;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setViews(int views){
		this.views = views;
	}

	public int getViews(){
		return views;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	@Override
 	public String toString(){
		return 
			"PostsItem{" + 
			"reactions = '" + reactions + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",body = '" + body + '\'' + 
			",userId = '" + userId + '\'' + 
			",views = '" + views + '\'' + 
			",tags = '" + tags + '\'' + 
			"}";
		}
}