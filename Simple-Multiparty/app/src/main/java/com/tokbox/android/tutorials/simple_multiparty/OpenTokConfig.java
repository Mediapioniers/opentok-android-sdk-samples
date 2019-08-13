package com.tokbox.android.tutorials.simple_multiparty;

import android.util.SparseArray;

class OpenTokConfig {
    // *** Fill the following variables using your own Project info from the OpenTok dashboard  ***
    // ***                      https://dashboard.tokbox.com/projects                           ***

    // Replace with your OpenTok API key
    static final String API_KEY = "";
    static final SparseArray<String> SESSION_IDS = new SparseArray<>();
    static final SparseArray<String> TOKENS = new SparseArray<>();

    static {
        // Replace with generated Session IDs
        SESSION_IDS.put(0, "");
        SESSION_IDS.put(1, "");
        // Replace with generated tokens (from the dashboard or using an OpenTok server SDK)
        TOKENS.put(0, "");
        TOKENS.put(1, "");
    }
}
