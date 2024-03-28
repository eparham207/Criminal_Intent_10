package com.parham.msu.criminal_intent_10

import androidx.recyclerview.widget.RecyclerView
import com.parham.msu.criminal_intent_10.databinding.ListItemCrimePoliceBinding
import java.text.SimpleDateFormat
import java.util.*

class CrimePoliceHolder(private val binding: ListItemCrimePoliceBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(crime: Crime) {
        binding.apply {
            crimeTitle.text = crime.title
            crimeDate.text = SimpleDateFormat("EEE MMM dd HH:mm z yyyy", Locale.getDefault()).format(crime.date)
            contactPoliceButton.setOnClickListener {
                // Handle button click event for contacting the police
                // For example, you can launch a new activity or show a dialog
            }
        }
    }
}