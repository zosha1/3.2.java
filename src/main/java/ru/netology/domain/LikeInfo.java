package ru.netology.domain;

public class LikeInfo {
    private int likeCount;
    private Like like[];

    public Like[] getLike() {
        return like;
    }

    public void setLike(Like[] like) {
        this.like = like;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
