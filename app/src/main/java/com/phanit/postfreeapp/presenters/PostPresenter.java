package com.phanit.postfreeapp.presenters;

import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;

import com.phanit.postfreeapp.MainActivity;
import com.phanit.postfreeapp.adapter.PostAdapter;
import com.phanit.postfreeapp.api.APIClient;
import com.phanit.postfreeapp.api.ApiInterface;
import com.phanit.postfreeapp.models.response.PostResponse;
import com.phanit.postfreeapp.models.response.PostsItem;
import com.phanit.postfreeapp.views.PostView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostPresenter {

    private ApiInterface apiInterface;

    private final PostView view;

    public PostPresenter(PostView view) {
        this.view = view;
        apiInterface = APIClient.getClient().create(ApiInterface.class);
    }

    public void getAllPosts(){
        view.onLoading();
        apiInterface.getAllPosts().enqueue(new Callback<PostResponse>() {
            @Override
            public void onResponse(Call<PostResponse> call, Response<PostResponse> response) {
                view.onHidingLoading();
                if (response.isSuccessful() && null != response.body()){
                    view.onGetPostSuccess(response.body().getPosts());
                }
            }

            @Override
            public void onFailure(Call<PostResponse> call, Throwable throwable) {
                view.onHidingLoading();
            }
        });
    }
    public void getPostById(int id){
        view.onLoading();
        apiInterface.getPostById(id).enqueue(new Callback<PostsItem>() {
            @Override
            public void onResponse(Call<PostsItem> call, Response<PostsItem> response) {
                view.onHidingLoading();
                if (response.isSuccessful() && response.body() != null){
                    view.onGetPostByIdSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<PostsItem> call, Throwable throwable) {
                view.onHidingLoading();
                view.onSuccess(throwable.getLocalizedMessage());

            }
        });
    }
}
