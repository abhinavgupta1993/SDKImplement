package com.abhinav.toastlib;

import android.content.Context;
import android.widget.Toast;

public class GetToast {

    public static void toasting(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
