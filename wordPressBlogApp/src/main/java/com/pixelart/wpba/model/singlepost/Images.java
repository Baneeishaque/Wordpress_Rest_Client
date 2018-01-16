package com.pixelart.wpba.model.singlepost;

import com.google.gson.annotations.Expose;


public class Images {

    @Expose
    private Medium medium;

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

}
