package com.example.admin.scloud.utils;

import android.Manifest;
import android.os.Environment;

public class ConstantString {
    private ConstantString() {
    }

    public static final String BREAK_LINE = "\n";
    public static final String DOWNLOAD_FILE_PATH =
            Environment.getExternalStorageDirectory().toString() + "/MySoundCloud";
    public static final String[] PERMISSIONS =
            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE};
    public static final String AUDIO ="Audio";
    public static final String CLASSIC ="Classic";
    public static final String COUNTRY ="Country";
    public static final String AMBIENT ="Ambient";
    public static final String ALTERNATIVE ="Alternative";


}
