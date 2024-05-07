package com.example.gymroutineapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.gymroutineapp.model.Routine
import com.example.gymroutineapp.repo.WorkoutRetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        // TODO: how do i want it to look? probably simple. I think for right now I'll just have it
        //  fetch the data and print. I'll just have one workout in a json on github. Need to have
        //  sample data in a package in the app and I can just point towards the public github
        //  upload of that.

        // TODO: how does it know which one to show? I could have each one include a timestamp or
        //  just the week and it shows whatever I was doing that week. Would have to limit the data
        //  to just my fave 52. Or i could have it store the last index I was on and add a button to
        //  skip to the next one.

        makeCall()
    }

    private fun makeCall() {
        // TODO: move to viewModel.

        WorkoutRetrofitInstance.api.getGymRoutine().enqueue(object : Callback<Routine>{
            override fun onResponse(call: Call<Routine>, response: Response<Routine>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<Routine>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}

/*
https://www.youtube.com/watch?v=7NtRPOouJRc&list=PLzZEuVaFb9EygSJmbjX3sJAwlEzhHaPcH&index=4


For getting the workouts off of my phone

https://play.google.com/store/apps/details?id=com.riteshsahu.SMSBackupRestore&hl=en&gl=US
It can export all your text messages and call logs to a XML file, it'll be huge if you have a lot of
texts. You can save the XML file, transfer it to / from your PC using something like WiFi FTP Server,
and import it back on the phone when you're ready.


https://www.reddit.com/r/techsupport/comments/rbbv3i/best_way_to_export_a_copy_of_text_messages_from/

https://www.reddit.com/r/AndroidQuestions/comments/10tjvi6/export_sms_messages_from_android_to_windows_for/
 */