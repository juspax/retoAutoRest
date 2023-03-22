package io.swagger.petstore.utils;

import com.google.gson.Gson;

public class TransformJsonUtils {

    // Es la trasformacion del modelo al json
    public static <T> String transform(T UserModel) {
        Gson gson = new Gson();
        String userJson = gson.toJson(UserModel);
        return userJson;
    }


}
