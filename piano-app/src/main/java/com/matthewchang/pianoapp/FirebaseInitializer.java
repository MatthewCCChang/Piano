package com.matthewchang.pianoapp;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

// ...

public class FirebaseInitializer {
    public static void initializeFirebase() {
        try {
            // Specify the path to your JSON key file
            FileInputStream serviceAccount = new FileInputStream("../../../../serviceAccountKey.json");

            // Initialize Firebase with the downloaded JSON key file
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
