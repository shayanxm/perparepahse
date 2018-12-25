package com.example.shayanmoradi.tamrin6firsttry.Model;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID mTaskId;
    private String Title;
    private String mDescription;
    private Date mDate;
    private boolean mDoneOrUnDone;

    public Task() {
mTaskId= UUID.randomUUID();
mDate = new Date();
    }

    public UUID getmTaskId() {
        return mTaskId;
    }

    public void setmTaskId(UUID mTaskId) {
        this.mTaskId = mTaskId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismDoneOrUnDone() {
        return mDoneOrUnDone;
    }

    public void setmDoneOrUnDone(boolean mDoneOrUnDone) {
        this.mDoneOrUnDone = mDoneOrUnDone;
    }
}
