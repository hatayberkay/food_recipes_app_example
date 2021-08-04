It is  food recipes app example for showing how to using local cache and Rest Api.

Topic: Showing recipes. There are 3 layout as my Firebase Project. This project only created by Rest Api and Local Cache

Link: https://github.com/hatayberkay/Food-recipes-firebase



Local cache: Saving data to local database. I used to when my app has not internet connection.
Rest Api : It'is for getting data.


Adapters: For combine datas and views.
Models: It's objects for datas.
Persistance : Our Room for  persistance.
Repositories :It's converter. ( Our data )
Request : Rest Api jobs.
Util : It's for specific values.
Other class and ViewModels: It has created for only work with layouts.


The importont libraries that I have used:

1)Rest Api
2)Recyclerview
3)CardView
4)Glide
5) Room:
6) LiveData

    implementation "com.squareup.retrofit2:retrofit:$retrofitVersion"

    implementation "com.squareup.retrofit2:converter-gson:$retrofitVersion"

    // ViewModel and LiveData
    implementation "android.arch.lifecycle:extensions:$lifecycle_version"

    // Cardview
    implementation "com.android.support:cardview-v7:$supportVersion"

    // Recyclerview
    implementation "com.android.support:recyclerview-v7:$supportVersion"

    // Design support
    implementation "com.android.support:design:$supportVersion"

    // Glide
    implementation "com.github.bumptech.glide:glide:$glideVersion"
    annotationProcessor "com.github.bumptech.glide:compiler:$glideVersion"

    // Glide RecyclerView Preloader
    implementation("com.github.bumptech.glide:recyclerview-integration:$glideVersion") {
        // Excludes the support library because it's already included by Glide.
        transitive = false
    }

    implementation 'de.hdodenhof:circleimageview:3.0.0'

    // Room
    implementation "android.arch.persistence.room:runtime:$lifecycle_version"
    annotationProcessor "android



