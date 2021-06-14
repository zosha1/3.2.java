package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private Comment comment[];

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public Comment[] getComment() {
        return comment;
    }

    public void setComment(Comment[] comment) {
        this.comment = comment;
    }
}
