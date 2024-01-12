package com.example.tugasbesar_7708210057_kesyanaylakusumaputri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class rating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        val imageList = ArrayList<SlideModel>()
        val btn = findViewById<Button>(R.id.btn) as Button
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar) as RatingBar

        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZ23jvE4hg0ivqAZqt4r-K7T1oQFf81hmLOQdz6oses9vek-vmqfgmWsdMTn-j0m5kpHs&usqp=CAU", "Barbie the Princess and the Pauper."))
        imageList.add(SlideModel("https://sakura.co/wp-content/uploads/2021/03/sakuraco-dorayaki-thumbnail.png", "Barbie the Rapunzel"))
        imageList.add(SlideModel("https://images.squarespace-cdn.com/content/v1/5d3ee66abacfa00001df6854/1591768409005-WJYQKCSLIPCPRAUE16GV/gourmet-tour-japan-dorayaki.jpg", "And people do that."))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        btn.setOnClickListener {
            val getRatingValue = ratingBar.rating
            Toast.makeText(this@rating, "Rating =" + getRatingValue, Toast.LENGTH_LONG).show()
        }
    }
}