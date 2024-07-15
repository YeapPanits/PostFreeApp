package com.phanit.postfreeapp.views;

import com.phanit.postfreeapp.models.response.PostsItem;

import java.util.List;

public interface PostView {

    void onLoading();

    void onHidingLoading();

    void onError(String message);

    void onSuccess(String message);

    void onGetPostSuccess(List<PostsItem> postsItemList);

    void onGetPostByIdSuccess(PostsItem data);

}
