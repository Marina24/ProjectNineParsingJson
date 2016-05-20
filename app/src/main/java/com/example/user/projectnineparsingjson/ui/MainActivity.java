package com.example.user.projectnineparsingjson.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.user.projectnineparsingjson.Const;
import com.example.user.projectnineparsingjson.R;
import com.example.user.projectnineparsingjson.model.Friend;
import com.example.user.projectnineparsingjson.model.Member;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "Member";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Member> memberList = parserJson(Const.JSON_STRING);
    }

    private List<Member> parserJson(String json) {
        List<Member> memberList = new ArrayList<>();
        try {
            JSONArray jsonArrayAll = new JSONArray(json);

            for (int i = 0; i < jsonArrayAll.length(); i++) {
                JSONObject member = jsonArrayAll.getJSONObject(i);

                String id = member.getString("_id");
                int index = member.getInt("index");
                String guid = member.getString("guid");
                boolean isActive = member.getBoolean("isActive");
                String balance = member.getString("balance");
                String picture = member.getString("picture");
                int age = member.getInt("age");
                String eyeColor = member.getString("eyeColor");
                String name = member.getString("name");
                String gender = member.getString("gender");
                String company = member.getString("company");
                String email = member.getString("email");
                String phone = member.getString("phone");
                String address = member.getString("address");
                String about = member.getString("about");
                Date registered = getDate(member.getString("registered"));
                float latitude = getFloat(member.getString("latitude"));
                float longitude = getFloat(member.getString("longitude"));
                List<String> tags = getTagsList(member.getJSONArray("tags"));
                List<Friend> friendsList = getFriendsList(member.getJSONArray("friends"));
                String greeting = member.getString("greeting");
                String favoriteFruit = member.getString("favoriteFruit");

                Member person = new Member(id, index, guid, isActive, balance, picture, age, eyeColor, name,
                        gender, company, email, phone, address, about, registered, latitude, longitude,
                        tags, friendsList, greeting, favoriteFruit);

                memberList.add(person);

                Log.d(LOG_TAG, person.toString());
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return memberList;
    }

    private Date getDate(String string) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss Z");
        Date registered = new Date();
        try {
            registered = format.parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return registered;
    }

    private List<String> getTagsList(JSONArray jsonArray) throws JSONException {
        List<String> tagsList = new ArrayList<String>();
        for (int k = 0; k < jsonArray.length(); k++) {
            String tagsJSON = jsonArray.getString(k);
            tagsList.add(tagsJSON);
        }
        return tagsList;
    }

    private List<Friend> getFriendsList(JSONArray jsonArray) throws JSONException {
        List<Friend> friendsList = new ArrayList<>();
        for (int j = 0; j < jsonArray.length(); j++) {
            JSONObject friend = jsonArray.getJSONObject(j);
            int id2 = friend.getInt("id");
            String nAme = friend.getString("name");

            Friend friend1 = new Friend(id2, nAme);
            friendsList.add(friend1);
        }

        return friendsList;
    }

    private float getFloat(String string) {
        return Float.parseFloat(string);
    }
}
