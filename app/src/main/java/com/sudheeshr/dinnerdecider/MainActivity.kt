package com.sudheeshr.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("North Indian","South Indian","Korean","Chinese","Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecideId.setOnClickListener {

            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            showFoodTxtId.text = foodList[randomFood]
        }

        btnAddFoodId.setOnClickListener {

            val addNewFood = foodTxtId.text.toString()
            if (addNewFood != ""){
                foodList.add(addNewFood)
                foodTxtId.text.clear()
                Toast.makeText(this, "New Food Added To Your List", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this,"Please enter any food item", Toast.LENGTH_SHORT).show()
            }




        }
    }
}
