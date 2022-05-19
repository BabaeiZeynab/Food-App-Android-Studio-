package com.zeynab.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.zeynab.food.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :  ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    // How to create RecyclearView
        /*
           1. use RecyclerView in mainActivity.xml
           2. create item in REcyclerView item -> listitem
           3.create adaptor
           4. ser adapter to recyclear view and set layout manager

         */



        val foodList = arrayListOf<Food>(
                Food("Mixed Kebab Plate", "CAD$ 29.99", "Chargrill BBQ beef and chicken Kebab",4.5f,84, "https://cdn.pixabay.com/photo/2016/01/22/02/13/meat-1155132__480.jpg" ),
                Food("New York Steak" , "CAD$70.99", "Served with Caesar salad, and steak fries", 5f, 190, "https://cdn.pixabay.com/photo/2017/03/23/19/57/asparagus-2169305__480.jpg"),
                Food("Sophies Salad" ,"CAD$18", "Spring mix, grilled chicken with cheese", 5f, 230, "https://cdn.pixabay.com/photo/2015/05/31/13/59/salad-791891__480.jpg"),
                Food("Teriaki Salmon", "CAD$56.95", "Grilled atlantic salamon fillet", 3.5f, 90, "https://cdn.pixabay.com/photo/2015/04/08/13/13/food-712665__480.jpg"),
                Food("Capone Pizza", "CAD$19.24", "Oven-Roasted Chicken Breast with greens", 2.5f, 75, "https://cdn.pixabay.com/photo/2015/05/31/13/59/salad-791891__480.jpg" ),
                Food("Royal Burger" ,"CAD$10.50", "Ground flank beef is served on salad", 5f, 116,"https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246__480.jpg"),
                Food("Regular Size Veggie Fries", "CAD$9.99", "NYF's Classic poutine- Gluten free", 4.5f, 245 , "https://cdn.pixabay.com/photo/2016/11/20/09/06/bowl-1842294__340.jpg"),
                Food("Fdge Cake", "CAd$6.99", "'Moist fudge cake layered with rich chocolate", 3.5f,55,"https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552__340.jpg" ),
                Food("Spicy Salmon Poke Bowl", "CAD$36.50", "Spicy Salmon, Avocado, Tobiko", 3f, 79, "https://cdn.pixabay.com/photo/2016/04/06/17/45/salmon-1312372__480.jpg")
        )
        val myAdapter = FoodAdapter(foodList, this)

       binding.recyclerMain.adapter = myAdapter
        binding.recyclerMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false )


    }
}



