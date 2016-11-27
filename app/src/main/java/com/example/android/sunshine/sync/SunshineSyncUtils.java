/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine.sync;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;

import com.example.android.sunshine.data.WeatherContract;

// COMPLETED (9) Create a class called SunshineSyncUtils
public class SunshineSyncUtils {

    //  COMPLETED (12) Declare a private static boolean field called sInitialized
    private static boolean sInitialized;

    /**
     * Creates periodic sync tasks and checks to see if an immediate sync is required. If an
     * immediate sync is required, this method will take care of making sure that sync occurs.
     *
     * @param context Context that will be passed to other methods and used to access the
     *                ContentResolver
     */
    //  COMPLETED (13) Create a synchronized public static void method called initialize
    synchronized public static void initialize(@NonNull final Context context) {

//      COMPLETED (14) Only execute this method body if sInitialized is false
        /*
         * Only perform initialization once per app lifetime. If initialization has already been
         * performed, we have nothing to do in this method.
         */
        if (sInitialized) return;

//      COMPLETED (15) If sInitialized is false, set it to true and call startImmediateSync
        sInitialized = true;
        startImmediateSync(context);


    }

    //  COMPLETED (10) Create a public static void method called startImmediateSync
    /**
     * Helper method to perform a sync immediately using an IntentService for asynchronous
     * execution.
     *
     * @param context The Context used to start the IntentService for the sync.
     */
    public static void startImmediateSync(@NonNull final Context context) {
//      COMPLETED (11) Within that method, start the SunshineSyncIntentService
        Intent intentToSyncImmediately = new Intent(context, SunshineSyncIntentService.class);
        context.startService(intentToSyncImmediately);
    }
}