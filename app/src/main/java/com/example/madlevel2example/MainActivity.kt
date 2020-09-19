package com.example.madlevel2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2example.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val reminders = arrayListOf<Reminder>()
    private val ReminderAdapter = ReminderAdapter(reminders)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }
    private fun initViews(){
        binding.rvReminders.layoutManager =
            LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
        binding.rvReminders.adapter = ReminderAdapter
        binding.rvReminders.addItemDecoration(DividerItemDecoration(this@MainActivity,DividerItemDecoration.VERTICAL))
        binding.btnAddReminder.setOnClickListener{
            val reminder = binding.etReminder.text.toString()
            addReminder(reminder)
        }
        createItemTouchHelper().attachToRecyclerView(rvReminders)
    }
    private fun addReminder(reminder: String){
        if (reminder.isNotBlank()){
            reminders.add(Reminder(reminder))
            ReminderAdapter.notifyDataSetChanged()
            binding.etReminder.text?.clear()
        } else{
            Snackbar.make(etReminder, "You must fill in the field!", Snackbar.LENGTH_SHORT).show()
        }
    }
    private fun createItemTouchHelper(): ItemTouchHelper {


        val callback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT) {

            // Enables or Disables the ability to move items up and down.
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            // Callback triggered when a user swiped an item.
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                reminders.removeAt(position)
                ReminderAdapter.notifyDataSetChanged()
            }
        }
        return ItemTouchHelper(callback)
    }

}