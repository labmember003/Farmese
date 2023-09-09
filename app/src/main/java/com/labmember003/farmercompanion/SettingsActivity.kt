package com.labmember003.farmercompanion

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.settings, SettingsFragment())
                .commit()
        }

        //findViewById
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
            val preference = preferenceManager.findPreference<Preference>("language")
            preference!!.setOnPreferenceChangeListener { preference, newValue ->
//                Toast.makeText(requireContext(), newValue.toString(), Toast.LENGTH_SHORT).show()
                if (newValue == "हिंदी") {
                    languageCode = "hi"
                }
                else if (newValue == "English") {
                    languageCode = "en"
                }
                // Start the main activity
                val intent = Intent(requireContext(), MainActivity2::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
                true
            }
        }

    }
}