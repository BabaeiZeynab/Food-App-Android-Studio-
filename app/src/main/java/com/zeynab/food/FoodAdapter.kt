package com.zeynab.food

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

// create kotlin class with implemmet RecyclerView.Adapter
// FoodAdapter enterance is arrayList of Food
class FoodAdapter(private val data: ArrayList<Food>, private val context: Context) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

    // we have to create class which hold views
    // we shuld pass item which is type of View
    inner class FoodViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        // we will get all the things that we have in a ite.xml all the images textView and so on
        val imgMain = itemView.findViewById<ImageView>(R.id.item_img_view)
        val foodName = itemView.findViewById<TextView>(R.id.item_foodName)
        val price = itemView.findViewById<TextView>(R.id.item_price)
        val ingredinet = itemView.findViewById<TextView>(R.id.item_ingredient)
        val rating = itemView.findViewById<RatingBar>(R.id.item_rating)
        val ratingNumber = itemView.findViewById<TextView>(R.id.item_retingNumber)

        fun bindData(position: Int){

            Glide.with(context)
                    .load(data[position].urlImage)
                    .into(imgMain)
            foodName.text = data[position].foodName
            price.text = data[position].price
            ingredinet.text = data[position].ingredient
            rating.rating = data[position].rating
            ratingNumber.text = data[position].toString()



        }

    }

    // implement all methods
    /*
        1.  return FoodView() which requires item insid and we dont ahev so we will create item from ite,.xml
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {

       // we get out view which we created in item.xml -> then we put inside parent and use false becaue we want to scroll
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bindData(position)
    }

    // number of items that we have might be different it can be added deleted updated so we create class data class Food for this
    override fun getItemCount(): Int {

        return  data.size
    }

}