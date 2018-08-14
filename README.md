# Android-Localization-example-in-Tamil

Create values res folder for different language suffixed with language code "-ta,-hi,-uk"

     values     <default> US
        string.xml
            <string name="title">Learn</string>
            
            
     values-ta  தமிழ் 
        string.xml
            <string name="title">கல்வி</string>
            
     add android:configChanges="locale" to your AndroidManifest.xml 
