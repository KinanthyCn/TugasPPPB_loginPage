package com.kinan.tugaspppb_loginpage

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import com.google.android.material.snackbar.Snackbar
import com.kinan.tugaspppb_loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){

            butLogin.setOnClickListener {
                val username: String = addUsername.text.toString()
                val password: String = edtPassword.text.toString()

                if(username.isNotEmpty() && password.isNotEmpty()) {
                    val snackbar = Snackbar.make(
                        it,
                        R.string.log_suc,
                        Snackbar.LENGTH_SHORT
                    )
                    snackbar.setTextColor(Color.WHITE)
                    snackbar.setBackgroundTint(Color.GRAY)
                    snackbar.show()

                } else if (password.isEmpty() && username.isNotEmpty()){
                    val snackbar = Snackbar.make(
                        it,
                        R.string.log_pw,
                        Snackbar.LENGTH_SHORT
                    )
                    snackbar.setTextColor(Color.WHITE)
                    snackbar.setBackgroundTint(Color.GRAY)

                    snackbar.show()

                }else if (username.isEmpty() && password.isNotEmpty()){
                    val snackbar = Snackbar.make(
                        it,
                        R.string.log_uname,
                        Snackbar.LENGTH_SHORT
                    )
                    snackbar.setTextColor(Color.WHITE)
                    snackbar.setBackgroundTint(Color.GRAY)

                    snackbar.show()
                }

                else {
                    val snackbar = Snackbar.make(
                        it,
                        R.string.log_fail,
                        Snackbar.LENGTH_SHORT
                    )
                    snackbar.setTextColor(Color.WHITE)
                    snackbar.setBackgroundTint(Color.GRAY)

                    snackbar.show()


            }



        }
    }



            }
        }

