package com.example.android.network.sync.basicsyncadapter.data;

import com.google.gson.annotations.SerializedName;


import java.util.List;

/**
 * Created by neil on 5/25/16.
 */
public class Item {

    public static final String DISCIPLES_TODAY_BASE_URL = DTService.DISCIPLES_TODAY_BASE_URL;
    String title;


    String id;
    private String introtext;
    private String fulltext;
   // private String image;
    String link;
    private String created_by_alias;


    //TODO: Clean up unneeded getters/setters.

    public String getLink() {
        return DISCIPLES_TODAY_BASE_URL + link;
    }

    public String getId() {
        return id;
    }

    public String getFulltext() {
        return fulltext;
    }


/*
    //NOTE: Must match json. TODO: use annotation so it doesn't have to.
    @SerializedName("extra_fields")
    private List<ExtraField> extra_fields;


    public List<ExtraField> getExtraFields() {
        return extra_fields;
    }
    */
    //TODO: Use extra fields when needed.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroText() {
        return introtext;
    }
/*
    public String getImageUrl()
    {
        String imageUrl;
        imageUrl = getImageUrl(introtext, "jpg");
        if (!imageUrl.isEmpty())
        {
            return imageUrl;
        }

        imageUrl = getImageUrl(introtext, "png");
        if (!imageUrl.isEmpty())
        {
            return imageUrl;
        }

        imageUrl = getImageUrl(introtext, "gif");
        if (!imageUrl.isEmpty())
        {
            return imageUrl;
        }

        imageUrl = getImageUrl(fulltext, "jpg");
        if (!imageUrl.isEmpty())
        {
            return imageUrl;
        }

        imageUrl = getImageUrl(fulltext, "png");
        if (!imageUrl.isEmpty())
        {
            return imageUrl;
        }

        imageUrl = getImageUrl(fulltext, "gif");
        if (!imageUrl.isEmpty())
        {
            return imageUrl;
        }



        //TODO: utilize json fields image,imageSmall, imageMedium fields as needed.

            //This is the twitter image, seems like a decent default.
        return Article.DEFAULT_IMAGE_URL;

    }

    private String getImageUrl(String fieldToSearch, String fileSuffix)
    {
        int start = fieldToSearch.indexOf("images");
        if (start < 0) {
            return "";
        }
        int end = fieldToSearch.indexOf("." + fileSuffix);
        if (end < 0)
        {
            return "";
        }

        String s = fieldToSearch.substring(start, end);
        String image = DISCIPLES_TODAY_BASE_URL + s + "." + fileSuffix;
        return image;
    }

    public String getCreated_by_alias() {
        return created_by_alias;
    }
    */
}
